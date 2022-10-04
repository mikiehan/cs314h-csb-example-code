package tree;

public class Main {
    public static void main(String[] args) {
        //         10
        //    /          \
        //  20           30
        //    \          / \
        //    40       60  90
        //    /       / \    \
        // 50        70 80    100
        TreeNode<Integer> intTree = new TreeNode<>(10,
                new TreeNode(20), new TreeNode(30));
        intTree.left.right = new TreeNode(40, new TreeNode(50), null);
        intTree.right.left = new TreeNode(60, new TreeNode(70), new TreeNode(80));
        intTree.right.right = new TreeNode(90, null, new TreeNode(100));
        TreeTraversal2.inOrderTraversal(intTree);
        System.out.println();
        TreeTraversal3.inOrderTraversal(intTree);
        System.out.println();
        System.out.println("------");
        TreeTraversal2.preOrderTraversal(intTree);
        System.out.println();
        TreeTraversal3.preOrderTraversal(intTree);
        System.out.println();
        System.out.println("------");

        //Make sure to reset visited to all 0
        TreeTraversal3.resetVisited(intTree);
        TreeTraversal2.postOrderTraversal(intTree);
        System.out.println();
        TreeTraversal3.postOrderTraversal(intTree);
        System.out.println();
        System.out.println("------");
    }
}
