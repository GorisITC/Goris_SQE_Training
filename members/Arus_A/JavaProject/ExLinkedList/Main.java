public class Main {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("hello");
        l.add("Hayko");
        l.add("Du");
        l.add("Na");
        l.add("Simon");
        l.add("Vlo");
        l.add("Panos");
        l.add("tero");
        l.add("bardo");
        l.add("vino");
        l.add("porito");
        try {
              /*  l.removeByIndex(0);
                l.removeByIndex(9);
                l.removeByIndex(5);*/
            l.removeByValue("porito");
            l.printLinkedList();
            System.out.println("1. The index of the mentioned value is: " + l.indexOf("tero"));
            System.out.println("2. The value of mentioned index is: " + l.getIndex(4));
            System.out.println("3. The value of first element is: " + l.getFirst());
            System.out.println("4. The value of last element is: " + l.getLast());
            System.out.println("5. The length of the LinkedList is: " + l.getLength());
        } catch (NullPointerException e) {
            System.out.println("Warning: One of the inserted index is greater than a length of LinkedList.");
        }

    }
}
