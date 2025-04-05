package Codes;

import java.util.Stack;

public class RainWaterStack {
	public static int trap(int[] height) {
		int sum = 0;
		Stack<Integer> st = new Stack<>();
		int leftMax = -1;
		int rightMax = -1;
		int currentMax = -1;
		for (int i = 0; i < height.length; i++) {
			while (!st.isEmpty() && height[i] > height[st.peek()]) {
				rightMax = i;
				currentMax = st.pop();
				if (st.isEmpty())
					break;
				leftMax = st.peek();
				int width = rightMax - leftMax - 1;
				sum += (Math.min(height[leftMax], height[rightMax]) - height[currentMax]) * width;
			}
			st.push(i);
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {4,2,0,3,2,5};
		System.out.println(trap(arr));
	}

}
