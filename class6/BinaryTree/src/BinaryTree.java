import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    private void preorderTraversal(TreeNode node, List<Integer> result) {
        if (node==null) {
            return;
        }
        result.add(node.val);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    List<Integer> postorderTraversal() {
        return null;
    }

    List<Integer> inorderTraversal() {
        return null;
    }
}
