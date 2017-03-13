package pkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class OddOneOut {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 2, 3, 4, 5, 6, 7, 5, 4, 4, 5, 4, 5, 6, 7, 8, 8, 6, 5, 4, 3, 2, 3, 4, 5, 6, 7, 8, 8,
				3, 4 };
		System.out.println(findOdd(input));
		System.out.println(powerOfTwo(9));
	}

	private static int findOdd(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++)
			result ^= input[i];
		return result;
	}

	private static boolean powerOfTwo(int n) {
		return ((n & n - 1) == 0) ? true : false;
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> first = new LinkedList<TreeNode>();
		Queue<TreeNode> second = new LinkedList<TreeNode>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root != null) {
			first.add(root);
			while (!(first.isEmpty() && second.isEmpty())) {
				TreeNode current = null;
				List<Integer> level1 = new ArrayList<Integer>();
				List<Integer> level2 = new ArrayList<Integer>();
				while (!first.isEmpty()) {
					current = second.poll();
					level1.add(current.val);
					list.add(level1);
					if (current.left != null)
						second.add(current.left);
					if (current.right != null)
						second.add(current.right);
				}
				while (!second.isEmpty()) {
					current = second.poll();
					level2.add(current.val);
					list.add(level2);
					if (current.left != null)
						first.add(current.left);
					if (current.right != null)
						first.add(current.right);
				}
			}
			Collections.reverse(list);
			return list;
		}
		return null;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
