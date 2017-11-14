public class Main {
    public static void main(String[] args) {
        Products Apple = new Products("apple",200);
        Products Milk = new Products("milk",300);
        Products Pen = new Products("pen",76);
        Products Pencil = new Products("pencil",80);
        Chtik chtik = new Chtik();
        chtik.add(Apple);
        chtik.add(Milk);
        chtik.add(Pen);
        chtik.add(Pen);
        chtik.add(Pencil);
        System.out.println("Overall price = " + chtik.getCount() + "AMD");
    }

}
