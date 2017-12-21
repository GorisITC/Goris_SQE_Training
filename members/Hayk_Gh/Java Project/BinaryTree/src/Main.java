public class Main {
    public static void main(String[] args) {
        Tree<Integer,String> tree = new Tree<>();
        tree.put(5,"A");
        tree.put(4,"B");
        tree.put(6,"D");
        tree.put(7,"K");
        tree.put(10,"E");
        tree.put(19,"J");
        tree.put(50,"FGH");
        tree.put(90,"FasdfGH");
        tree.put(100,"FGasfdH");
        tree.put(-1,"N");
        tree.put(-11,"M");
        tree.put(-12,"P");
        tree.put(-13,"Q");
        tree.put(-14,"W");

        tree.remove(4);
        tree.displayToLeft();



    }
}
