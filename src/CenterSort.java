import java.util.Stack;

public class CenterSort {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.right = new Node(6);

		centerSort1(head);
		System.out.println();
		centerSort2(head);
	}
	private static void centerSort1(Node head) {
		if (head != null) {
			centerSort1(head.left);
			System.out.print(head.value + "-");
			centerSort1(head.right);
		}
	}
	public static void centerSort2(Node head) {
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		stack1.push(head);
		while (!stack1.isEmpty()) {
			if (!stack2.isEmpty() && stack1.peek() == stack2.peek()) {
				Node curNode = stack1.pop();
				System.out.print(curNode.value + "-");
				stack2.pop();
			} else {
				Node curNode = stack1.pop();
				if (curNode.right != null) {
					stack1.push(curNode.right);
				}
				stack1.push(curNode);
				stack2.push(curNode);
				if (curNode.left != null) {
					stack1.push(curNode.left);
				}
			}
		}
 	}
}
class Node{
	public int value;
	public Node left;
	public Node right;

	public Node(int value) {
		this.value = value;
	}

}

