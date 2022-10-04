package bst;

public class Node<E> {
    public E data;      // data stored at this Node<E>
    public Node<E> left;  // reference to left subtree
    public Node<E> right; // reference to right subtree

    // post: constructs a leaf node with given data
    public Node(E data) {
        this(data, null, null);
    }

    // post: constructs a Node<E> with the given data and links
    public Node(E data, Node<E> left, Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}