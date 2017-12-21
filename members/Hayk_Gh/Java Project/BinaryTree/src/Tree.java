import java.util.NoSuchElementException;

public class Tree<T extends Comparable<T>, K> {
    Node<T, K> root;

    static int count = 0;

    public void put(T key, K value) {
        if (root == null) {
            root = new Node<>(null, null, null, key, value);
            return;
        }
        Node<T, K> current = root;

        while (current != null) {
            if (current.key.compareTo(key) > 0) {
                if (current.left == null) {
                    current.left = new Node(null, null, current, key, value);
                    break;
                }
                current = current.left;
            } else if (current.key.compareTo(key) < 0) {

                if (current.right == null) {
                    current.right = new Node(null, null, current, key, value);
                    break;
                }
                current = current.right;
            }
        }
        count++;
    }

    public void displayToRight() {
        if (root != null) {
            System.out.println(root.key);
        }
        while (root.right != null) {
            root = root.right;
            System.out.println(root.key);
            if (root.key == null) {
                return;
            }
        }
    }

    public void displayToLeft() {
        if (root != null) {
            System.out.println(root.key);
        }
        while (root.left != null) {
            root = root.left;
            System.out.println(root.key);
            if (root.key == null) {
                return;
            }
        }
    }

    public void remove(T key) {
        if (root.key.compareTo(key) == 0) {
            if (root.left != null) root = root.left;
            else root = root.right;

            return;
        }
        Node<T, K> second = root;
        while (second.key.compareTo(key) != 0) {
            if (second.key.compareTo(key) > 0) {
                second = second.left;
            } else {
                second = second.right;
            }
            if (second == null) throw new NoSuchElementException();
        }
        if (second.left != null) {
            if (second.parent.key.compareTo(second.key) > 0) {
                second.parent.left = second.left;
            } else second.parent.right = second.left;
        } else {
            if (second.parent.key.compareTo(second.key) > 0) {
                second.parent.left = second.right;
            } else second.parent.right = second.right;
        }
    }
}
