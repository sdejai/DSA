package Tree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.maxm());
		System.out.println(bt.find(100));
		System.out.println(bt.height());
		bt.postOrder();
		bt.preOrder();
		bt.inOrder();
	}
}
