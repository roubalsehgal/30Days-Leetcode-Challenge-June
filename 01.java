/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

	// Iterative
	public TreeNode invertTree(TreeNode root) {
		Queue < TreeNode > queue = new LinkedList < >();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node != null) {
				queue.add(node.left);
				queue.add(node.right);
				TreeNode tmp = node.left;
				node.left = node.right;
				node.right = tmp;
			}
		}
		return root;
	}

	// Recursive
	public TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		TreeNode tmp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		return root;
	}
}

