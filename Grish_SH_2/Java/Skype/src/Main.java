public class Main {
    public static void main(String[] args) {
        Message mes1 = new Message();
        mes1.setText("Barev Skype");
        mes1.setUsername("Armenak");
        System.out.println(mes1.getUsername() + ":" + mes1.getText());
        Message mes2 = new Message();
        mes2.setText("Hajox Skype");
        mes2.setUsername("Valodik");
        System.out.println(mes2.getUsername() + ":" + mes2.getText());
    }

}
