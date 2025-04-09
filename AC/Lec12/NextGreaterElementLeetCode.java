package Codes;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementLeetCode {
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int ans[] = new int[nums1.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < nums2.length; i++) {
			while (!st.isEmpty() && st.peek() < nums2[i]) {
				map.put(st.pop(), nums2[i]);
			}
			st.push(nums2[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			ans[i] = map.getOrDefault(nums1[i], -1);
		}
		return ans;
	}

	public static void main(String[] args) {
//		int nums1[] = {4,1,2};
//		int nums2[] = {1,3,4,2};
		int nums1[] = {2,4}; 
		int nums2[] = {1,2,3,4};
		int output[]=nextGreaterElement(nums1,nums2);	
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
	}

}
