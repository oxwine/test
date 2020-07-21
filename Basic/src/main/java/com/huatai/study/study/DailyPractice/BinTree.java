package com.huatai.study.study.DailyPractice;

import java.util.Arrays;
import java.util.LinkedList;

public class BinTree {

	public static void main(String[] args) {

		LinkedList<Integer> inputList = new LinkedList<Integer>(
				Arrays.asList(new Integer[] { 3, 2, 9, null, null, 10, null, null, 8, null, 4 }));

		TreeNode treeNode = creatBinaTreen(inputList);

		System.out.print("前序遍历");

		preOrderTraveral(treeNode);

	}

	public static TreeNode creatBinaTreen(LinkedList<Integer> input) {

		TreeNode node = null;
//		 Object flag = (input.isEmpty())? null:1;
		if (input == null || input.isEmpty()) {
			return null;
		}

		Integer data = input.removeFirst();

		if (data != null) {
			node = new TreeNode(data);

			node.leftChild = creatBinaTreen(input);

			node.rightChild = creatBinaTreen(input);
		}

		return node;

	}

	public static void preOrderTraveral(TreeNode node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data);
		preOrderTraveral(node.leftChild);
		preOrderTraveral(node.rightChild);
	}

	private static class TreeNode {

		int data;

		TreeNode leftChild;

		TreeNode rightChild;

		TreeNode(int data) {
			this.data = data;
		}
	}

}
