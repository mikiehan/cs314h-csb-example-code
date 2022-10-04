package tree;

import java.util.Stack;

//No recursion using stack
public class TreeTraversal3 {

    public static void preOrderTraversal(TreeNode root) {
        preOrderTraversal(root, false);
    }

    public static void preOrderTraversal(TreeNode root, boolean reset) {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.empty()) {
            TreeNode node = s.pop();
            if (reset) node.visited = 0;
            else
                System.out.print(node.data + " ");
            if (node.right != null)
                s.push(node.right);
            if (node.left != null)
                s.push(node.left);
        }
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.empty()) {
            TreeNode node = s.pop();
            node.visited++;
            if (node.visited == 1) {
                if (node.right != null)
                    s.push(node.right);
                s.push(node);
                if (node.left != null)
                    s.push(node.left);
            } else {
                System.out.print(node.data + " ");
            }
        }
    }

    public static void resetVisited(TreeNode root) {
        preOrderTraversal(root, true); //reset visited to 0 using pre-order traversal
    }

    public static void postOrderTraversal(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        //System.out.println("pushing " + root.data);
        while (!s.empty()) {
            TreeNode node = s.pop();
            node.visited++;
            //System.out.println("popping " + node.data + " " + node.visited);
            if (node.visited == 1) {
                s.push(node);
                //System.out.println("pushing " + node.data);
                if (node.right != null) {
                    s.push(node.right);
                    //System.out.println("pushing " + node.right.data);
                }
                if (node.left != null) {
                    s.push(node.left);
                    //System.out.println("pushing " + node.left.data);
                }
            } else {
                System.out.print(node.data + " ");
            }
        }
    }
}
