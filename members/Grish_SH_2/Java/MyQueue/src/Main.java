public class Main {
    public static void main(String[] args) {

    Queue myqueue = new Queue();
        myqueue.enqueue("Harut");
        myqueue.enqueue("Grish");
        myqueue.enqueue("Tik");
        System.out.println(myqueue.dequeue());
        System.out.println(myqueue.dequeue());
        System.out.println(myqueue.dequeue());
        System.out.println(myqueue.size());


    }
}
