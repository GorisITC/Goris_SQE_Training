import com.sun.org.apache.xpath.internal.operations.Neg;

public class Stack {
    String[] array;
    int length = 0;

    public Stack() {
        this(10);
    }

    public Stack(int i) {
        if(i<0) throw new NegativeArraySizeException("Incorrect");
        array = new String[i];
    }

    public void push(String item) {
        if (length == array.length) {
            System.out.println("Your stack is full");
        }
        array[length++] = item;
    }

    public String peek() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Your stack is emty to peek something");
        return array[length - 1];
    }

    public String pop() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Your stack is empty to pop something");
        String last = array[length-1];
        array[length-1] = null;
        length --;
        return last;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == array.length;

    }
}
