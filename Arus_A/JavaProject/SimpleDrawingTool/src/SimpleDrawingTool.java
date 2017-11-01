import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import sun.awt.X11.XErrorHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleDrawingTool extends Frame{
    //constants for menu shortcuts
    private static final int kControlA=65;
    private static final int kControlD=68;
    private static final int kControlC=67;
    private static final int kControlR=82;
    private static final int kControlP=80;
    private static final int kControlT=84;
    private static final int kControlX=88;

    private RectangleShape rectangle=new RectangleShape();
    private OvalShape oval=new OvalShape();
    private PolygonShape polygon=new PolygonShape();
    private TriangleShape triangle=new TriangleShape();

    private DrawingPanel panel;

    public SimpleDrawingTool(){
        //set frame's title
        super("Simple Drawing Tool");
        //add menu
        addMenu();
        //add drawing panel
        addPanel();
        //add window Listener
        this.addWindowListener(new WindowHandler());
        //set frame size
        this.setSize(600,600);
        //make this frame visible
        this.setVisible(true);
    }
    public static void main(String args[]){
        SimpleDrawingTool simpleDrawingTool=new SimpleDrawingTool();
    }

    private void addMenu() {
        //Add menu bar to our frame
        MenuBar menubar = new MenuBar();
        Menu file = new Menu("File");
        Menu shape = new Menu("Shapes");
        Menu about = new Menu("About");
        //now add menu items to these Menu objects
        file.add(new MenuItem("Exit", new MenuShortcut(kControlX))).addActionListener(new WindowHandler());

        shape.add(new MenuItem("Rectangle", new MenuShortcut(kControlR))).addActionListener(new WindowHandler());
        shape.add(new MenuItem("Circle", new MenuShortcut(kControlC))).addActionListener(new WindowHandler());
        shape.add(new MenuItem("Triangle", new MenuShortcut(kControlT))).addActionListener(new WindowHandler());
     //   shape.add(new MenuItem("Polygon", new MenuShortcut(kControlP))).addActionListener(new WindowHandler());
     //   shape.add(new MenuItem("Draw Polygon", new MenuShortcut(kControlD))).addActionListener(new WindowHandler());

        about.add(new MenuItem("About", new MenuShortcut(kControlA))).addActionListener(new WindowHandler());

        //add menus to menubar
        menubar.add(file);
        menubar.add(shape);
        menubar.add(about);
        //menuBar.setVisible(true);
        if(null==this.getMenuBar()) {
            this.setMenuBar(menubar);
        }
    }//addMenu
        /**
         This method adds a panel to SimpleDrawingTool for drawing shapes.
         */
        private void addPanel(){
            panel=new DrawingPanel();
            //get size of SimpleDrawingTool frame
            Dimension d=this.getSize();
            //get insets of frame
            Insets ins=this.insets();
            //exclude insets from the size of the panel
            d.height=d.height-ins.top-ins.bottom;
            d.width=d.width-ins.left-ins.right;
            panel.setSize(d);
            panel.setLocation(ins.left, ins.top);
            panel.setBackground(Color.blue);
            //add mouse listener. Panel itself will be handling mouse events
            panel.addMouseListener(panel);
            this.add(panel);
        }//end of addPanel();

    //Inner class to handle events
    private class WindowHandler extends WindowAdapter implements ActionListener{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }

        public void actionPerformed(ActionEvent e) {
            //check to see if the action command is equal to exit
            if (e.getActionCommand().equalsIgnoreCase("exit")) {
                System.exit(0);
            }else if(e.getActionCommand().equalsIgnoreCase("Rectangle")){
                Menu menu=getMenuBar().getMenu(1);
                JOptionPane.showMessageDialog(null, "Խնդրեմ, նշեք սկզբնական կետը և անկյունագծով սահեցրեք դեպի վերջնական կետ։");
                for (int i = 0; i <menu.getItemCount(); menu.getItem(i).setEnabled(true), i++);
                getMenuBar().getShortcutMenuItem(new MenuShortcut(kControlR)).setEnabled(false);
                panel.drawShape(rectangle);
            }
            else if(e.getActionCommand().equalsIgnoreCase("Circle")){
                Menu menu =getMenuBar().getMenu(1);
                for (int i = 0; i <menu.getItemCount();menu.getItem(i).setEnabled(true), i++);
                getMenuBar().getShortcutMenuItem(new MenuShortcut(kControlC)).setEnabled(false);
                panel.drawShape(oval);
            }
            else if (e.getActionCommand().equalsIgnoreCase("Triangle")){
                Menu menu = getMenuBar().getMenu(1);
                JOptionPane.showMessageDialog(null, "Խնդրեմ, նշեք երեք կետ, որով կնկարվի եռանկյունին:");
                for (int i = 0; i <menu.getItemCount();menu.getItem(i).setEnabled(true), i++);
                getMenuBar().getShortcutMenuItem(new MenuShortcut(kControlT)).setEnabled(false);
                panel.drawShape(triangle);
            }
           /* else if(e.getActionCommand().equalsIgnoreCase("Polygon")){
                Menu menu=getMenuBar().getMenu(1);
                for (int i = 0; i <menu.getItemCount();menu.getItem(i).setEnabled(true), i++);
                getMenuBar().getShortcutMenuItem(new MenuShortcut(kControlP)).setEnabled(false);
                panel.drawShape(polygon);
            }
            else if(e.getActionCommand().equalsIgnoreCase("Draw Polygon")){
                Menu menu=getMenuBar().getMenu(1);
                for (int i = 0; i <menu.getItemCount();menu.getItem(i).setEnabled(true), i++);
                getMenuBar().getShortcutMenuItem(new MenuShortcut(kControlP)).setEnabled(false);
                panel.repaint();
            }*/
            else if (e.getActionCommand().equalsIgnoreCase("About")) {
                JOptionPane.showMessageDialog(null, "Ծրագիրը գրված է 2017թ․ հոկտեմբերի 31֊ին։\n" +
                        "Օգտվել եմ համացանցից, քիչ թե շատ ծանոթացել awt֊ին :)\n" +
                        "Մտադրություն ունեմ ուսումնասիրել ավելի նոր GUI toolkit-եր՝ JavaSwing, JavaFX, և նկարչական ծրագիրը նորից գրել։\n" +
                        "Սիրով՝ Արուս Աղաբեկյան ;)", "About", JOptionPane.PLAIN_MESSAGE);
            }
        }//actionPerformed()
    }//windowHandler - Inner Class ends here

    class DrawingPanel extends Panel implements MouseListener {
        private Point sPoint=null;
        private Point ePoint=null;
        private Shapes shape=null;
        private java.util.ArrayList list=new java.util.ArrayList();
        //override panel.paint method to draw shapes
        public void paint(Graphics g){
            g.setColor(Color.orange);
            shape.draw(list, g);
        }
        public void drawShape(Shapes shape){
            this.shape=shape;
        }
        //define mouse handler
        public void mouseClicked(MouseEvent e){
            //if user wants to draw triangle, call repaint after 3 clicks
            if(shape instanceof TriangleShape){
                list.add(e.getPoint());
                if(list.size()>2){
                    repaint();
                }
            }
            else if (shape instanceof PolygonShape){
                list.add(e.getPoint());
            }
        }//mouse Clicked
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e){
            sPoint=e.getPoint();
        }//mousePressed
        public void mouseReleased(MouseEvent e){
            ePoint=e.getPoint();
            if(ePoint.getX()<sPoint.getX()){
                Point temp=ePoint;
                ePoint=sPoint;
                sPoint=temp;
            }
            if(ePoint.getY()<sPoint.getY()){
                int temp=(int)ePoint.getY();
                ePoint.y=(int)sPoint.getY();
                sPoint.y=temp;
            }
            if (shape instanceof RectangleShape || shape instanceof OvalShape){
                list.clear();
                list.add(sPoint);
                list.add(ePoint);
                repaint();
            }
        }//mouseReleased
    }//DrawingPanel
}
