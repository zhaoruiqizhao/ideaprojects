import java.util.Stack;

public class preSort {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.right = new Node(6);

		preSort2(head);
	}

	public static void preSort2(Node head) {
		Stack<Node> stack = new Stack<>();
		stack.push(head);
		while (!stack.isEmpty()) {
			Node curNode = stack.pop();
			System.out.print(curNode.value + "-");
			if (curNode.right != null) {
				stack.push(curNode.right);
			}
			if (curNode.left != null) {
				stack.push(curNode.left);
			}
		}
	}
	public static void preSort1(Node head) {
		if (head != null) {
			System.out.print(head.value + "-");
			preSort1(head.left);
			preSort1(head.right);
		}
	}
}

