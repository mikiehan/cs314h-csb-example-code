package tree;

public class TreeTraversal<E> {
    private TreeNode<E> overallRoot;

    public TreeTraversal(TreeNode<E> overallRoot) {
        this.overallRoot = overallRoot;
    }

    public void preOrderTraversal() {
        preOrderTraversal(overallRoot);
        System.out.println();
    }

    private void preOrderTraversal(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal() {
        inOrderTraversal(overallRoot);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode<E> root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal() {
        preOrderTraversal(overallRoot);
        System.out.println();
    }

    private void postOrderTraversal(TreeNode<E> root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data + " ");
    }
}
