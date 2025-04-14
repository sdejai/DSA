package Tree;

import java.util.Scanner;

public class BinaryTree {
	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		root = createTree();
	}

	public Node createTree() {
		int element = sc.nextInt();
		Node newNode = new Node();
		newNode.data = element;
		boolean leftNodeExist = sc.nextBoolean();
		if (leftNodeExist) {
			newNode.left = createTree();
		}
		boolean rightNodeExist = sc.nextBoolean();
		if (rightNodeExist) {
			newNode.right = createTree();
		}
		return newNode;
	}

}
