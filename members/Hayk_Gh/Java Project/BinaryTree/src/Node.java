public class Node <T extends Comparable,K>{
    Node right;
    Node left;
    Node parent;
    T key;
    K value;

    public Node(Node left, Node right, Node parent, T key, K value) {
        this.right = left;
        this.left = right;
        this.parent = parent;
        this.key = key;
        this.value = value;
    }
}
