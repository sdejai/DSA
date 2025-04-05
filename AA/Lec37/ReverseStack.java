package Codes;

import java.util.Stack;
public class ReverseStack {
	static Stack<Integer> st = new Stack<>();
	public static void insertElement(int element) {
		if (st.isEmpty()) {
			st.push(element);
		} else {
			int temp = st.peek();
			st.pop();
			insertElement(element);
			st.push(temp);
		}
	}
	public static void reverse() {
		if (st.size() > 0) {
			int temp = st.pop();;
			reverse();
			insertElement(temp);
		}
	}
	public static void main(String[] args) {
		st.push(1234);
		st.push(123);
		st.push(12);
		st.push(1);
		System.out.println(st);
		reverse();
		System.out.println(st);
	}
}
