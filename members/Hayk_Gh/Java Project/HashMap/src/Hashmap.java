public class Hashmap<K, V> {
    Node<K, V> element = null;
    int count = 0;
    Node array[] = new Node[1];

    void put(K key, V value) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) {
                element = new Node<>(key, value);
                array[i] = element;
                count++;
                break;
            }
            if (array[i].key.hashCode() == key.hashCode()) {
                array[i].value = value;
                break;
            }
            if (count == array.length) {
                newArray();
            }
        }
    }

    V get(K key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].key.equals(key) || array[i].key == key) {
                    return (V) array[i].value;
                }
            }
        }
        return null;
    }

    String getFirst() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return "[key] : " + array[i].key + " [value] : " + array[i].value;
            }
        }
        return null;
    }

    String getlast() {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != null) {
                return "[key] : " + array[i].key + " [value] : " + array[i].value;
            }
        }
        return null;
    }

    void remove(K key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].key.equals(key)) {
                array[i] = null;
                count--;
                break;
            }
        }
    }

    void newArray() {
        Node newArray[] = new Node[count + 5];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    boolean containsKey(K key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].key.toString().equals(key.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean containsValue(V value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                if (array[i].value.toString().equals(value.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    void clear() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                array[i] = null;
                count--;
            }
        }
    }

    boolean isEmpty() {
        return count == 0;
    }

    int getCount() {
        return count;
    }
}
