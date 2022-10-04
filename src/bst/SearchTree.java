package bst;

public class SearchTree<E> {
    private Node<E> overallRoot;

    // post: constructs an empty tree
    public SearchTree() {
        overallRoot = null;
    }

    // pre : the tree satisfies the binary search tree property
    //finds the value in this BST and returns the node containing the value  (if not found return null)
    public Node<E> find(E value){
        return null;
    }

    // pre : the tree satisfies BST property
    // post: value is added so as to preserve BST property
    // use x = foo(x) for modification of tree
    public void add(E value) {
    }

    // pre : the tree satisfies BST property
    // post: value is removed from the tree preserving BST property
    // use x = foo(x) for modification of tree
    public void delete(E value){
    }

}

//https://github.com/mikiehan/CS314H-CSB-AVL-Solution/blob/master/src/bst/BinarySearchTree.java
//<E extends Comparable<? super E>>
//List<? super Integer> foo3 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
//List<? super Integer> foo3 = new ArrayList<Number>();   // Number is a superclass of Integer
//List<? super Integer> foo3 = new ArrayList<Object>();   // Object is a superclass of Integer

//public class SearchTree<E extends Comparable<E>> {

//    // pre : the tree satisfies the binary search tree property
//    // post: value is added so as to preserve the binary search tree property
//    public void add(E value) {
//        overallRoot = add(overallRoot, value);
//    }
//
//    // pre : the tree with given root satisfies the binary search tree property
//    // post: value is added so as to preserve the binary search tree property
//    private Node<E> add(Node<E> root, E value) {
//        if (root == null)
//            root = new Node<E>(value);
//        else if (value.compareTo(root.data) <= 0)
//            root.left = add(root.left, value);
//        else
//            root.right = add(root.right, value);
//        return root;
//    }