package tree;

public class TreeNode<E> {
    public E data;		  // data stored at this TreeNode<E>
    public TreeNode left;  // reference to left subtree
    public TreeNode right; // reference to right subtree
    //public int visited;

    // post: constructs a leaf node with given data
    public TreeNode(E data) {
        this(data, null, null);
    }

    // post: constructs a generaltree.TreeNode<E> with the given data and links
    public TreeNode(E data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
        //this.visited = 0;
    }
}