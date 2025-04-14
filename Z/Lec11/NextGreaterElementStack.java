package Codes;

import java.util.*;

public class NextGreaterElementStack {

	public static void nextGreaterElement(int[] arr) {
		Stack<Integer> st = new Stack();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.empty() && arr[i] > arr[st.peek()]) {
				ans[st.peek()] = arr[i];
				st.pop();
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 35, 22, 5 };
		nextGreaterElement(arr);
	}


}
