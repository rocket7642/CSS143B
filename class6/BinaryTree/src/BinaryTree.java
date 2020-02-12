import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public List<Integer> preorderRecursive() {
        // exercise
        return Arrays.asList(1);
    }

    public List<Integer> inorderRecursive() {
        // exercise

        TreeNode node = root;

        if (node.left==null && node.right==null) {

        }

        return Arrays.asList(1);
    }

    List<Integer> postorderRecursive() {
        // exercise
        return Arrays.asList(1);
    }

    public List<Integer> preorderIterative() {
        // exercise
        return Arrays.asList(1);
    }

    public int height() {
        // exercise
        return 0;
    }

    public int LCA_BST(int v1, int v2) {
        // exercise
        return 0;
    }
}
