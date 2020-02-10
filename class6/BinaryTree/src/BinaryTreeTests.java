import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class BinaryTreeTests {
    @Test
    public void preorderTraversal() {
        List<BinaryTree> trees = getTestCases();
        int[][] expected = {
                {},
                {1},
                {1, 2},
                {1, 2, 4, 5, 3, 6},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 4, 7, 9, 5, 8, 3, 6}
        };

        for (int i = 0; i < expected.length; i++) {
            List<Integer> actual = trees.get(i).preorderTraversal();
            assertTrue(actual.equals(getListFromArray(expected[i])));
        }
    }

    @Test
    public void postorderTraversal() {
    }

    @Test
    public void inorderTraversal() {
    }

    private List<BinaryTree> getTestCases() {
        List<BinaryTree> trees = new ArrayList<>();

        // empty (root==null) tree
        trees.add(new BinaryTree());

        //      1
        //     / \
        //    N   N
        TreeNode root = new TreeNode(1);
        trees.add(new BinaryTree(root));

        //      1
        //     / \
        //    2   N
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        trees.add(new BinaryTree(root));

        //      1
        //     /  \
        //    2    3
        //   / \    \
        //  4   5    6
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        trees.add(new BinaryTree(root));

        //          1
        //         /
        //        2
        //       /
        //      3
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        trees.add(new BinaryTree(root));

        //          1
        //           \
        //            2
        //             \
        //              3
        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        trees.add(new BinaryTree(root));

        //             1
        //            /  \
        //           2    3
        //          /  \    \
        //         4    5    6
        //        /    /
        //       7    8
        //      /
        //     9
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.left.left = new TreeNode(9);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        trees.add(new BinaryTree(root));

        return trees;
    }

    private List<Integer> getListFromArray(int [] data) {
        return Arrays.stream(data).boxed().collect(Collectors.toList());
    }
}
