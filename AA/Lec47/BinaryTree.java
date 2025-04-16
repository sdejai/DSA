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

	public void display() {
		display(root);
	}

	private void display(Node newNode) {
		if (newNode == null) {
			return;
		}
		String s = "<----" + newNode.data + "---->";
		if (newNode.left != null) {
			s = newNode.left.data + s;
		} else {
			s = "." + s;
		}
		if (newNode.right != null) {
			s = s + newNode.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		display(newNode.left);
		display(newNode.right);
	}

	public int maxm() {
		return maxm(root);
	}

	private int maxm(Node newNode) {
		if (newNode == null) {
			return Integer.MIN_VALUE;
		}
		int leftMax = maxm(newNode.left);
		int rightMax = maxm(newNode.right);
		return Math.max(newNode.data, (Math.max(leftMax, rightMax)));
	}
	public boolean find(int element) {
		 boolean res=find(this.root, element);
		 return res;
	}
	private boolean find(Node node,int element) {
		if(node==null) {
			return false;
		}
		if(node.data==element) {
			return true;
		}
		boolean leftSide=find(node.left,element);
		boolean rightSide=find(node.right,element);
		return leftSide || rightSide;
	}
	public int height() {
		return height(this.root);
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		int leftHeight=height(node.left);
		int rightHeight=height(node.right);
		return Math.max(leftHeight,rightHeight)+1;
	}
}
