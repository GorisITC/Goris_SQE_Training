import java.util.Arrays;

public class HashMap <K,V> {
    int count = 0;
    int arraylenght = 5;
    private Node<K,V> list[] = new Node[arraylenght];

    public void put(K key, V value) {
        boolean exist = true;
        for (int i = 0; i < count; i++) {
            if (list[i].getKey().equals(key)) {
                list[i].setValue(value);
                exist = false;
            }
        }
        if(exist) {
            listIsFull();
            list[count++] = new Node<>(key, value);
        }
    }

    public void listIsFull() {
        if (count == list.length) {
            int newLenght = list.length + 5;
            list = Arrays.copyOf(list,newLenght);
        }
    }

    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (list[i] != null) {
                if (list[i].getKey().equals(key)) {
                    return list[i].getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key){
        for (int i = 0; i < count; i++) {
            if(list[i].getKey().equals(key)){
                list[i] = null;
                count--;
            }
        }
    }
    public int getCount(){
        return count;
    }

}
