package tree;

public class SomeTree<E> {
    private TreeNode<E> overallRoot;

    public SomeTree(TreeNode<E> overallRoot) {
        this.overallRoot = overallRoot;
    }

    //master method
    public void preOrderTraversal(){
        preOrderTraversal(overallRoot);
    }

    //helper method
    //will do preOrderTraversal from this current "root"
    private void preOrderTraversal(TreeNode<E> root){
        if(root == null) return;
        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //master method
    public void inOrderTraversal(){
        inOrderTraversal(overallRoot);
    }

    //helper method
    //will do inOrderTraversal from this current "root"
    private void inOrderTraversal(TreeNode<E> root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+ " ");
        inOrderTraversal(root.right);
    }
}
