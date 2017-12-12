public class Main {
    public static void main(String[] args) {
        Hashmap hashmap = new Hashmap();
        hashmap.put(1,"A");
        hashmap.put(2,"B");
        hashmap.put(3,"C");
        hashmap.put(4,"D");
        hashmap.put(5,"E");
        hashmap.put(5,"F");
        hashmap.put(1,"F");

        hashmap.remove(5);
        hashmap.remove(1);
        hashmap.clear();
        System.out.println(hashmap.isEmpty());
    }
}

