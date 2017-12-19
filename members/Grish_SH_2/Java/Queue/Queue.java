public class Queue <T>{
        Object [] array;
        int size = 0;


        public Queue(int i) {
            if(i<0) throw new NegativeArraySizeException();
            array = (T[]) new Object[i];
        }

        public void push(T item) {
            if (size == array.length) {
                Object[] second = new Object[size + 5];
                for (int i = 0; i < array.length; i++) {
                    second[i] = array[i];
                }

                array = second;
            }
            array[size++] = (T) item;
        }

        public T peek() {
            if (isEmpty()) throw new IndexOutOfBoundsException("Your Queue is emty to peek something");
            System.out.println(array[size - 1]);
            return (T)array[size - 1];
        }

        public T pop() {
            if(isEmpty()) throw new IndexOutOfBoundsException("Your Queue is empty to pop something");
            T last = (T) array[size-1];
            array[size-1] = null;
            size --;
            return last;
        }

        public boolean isEmpty() {
            return size == 0;
        }

}
