package Codes;


import java.util.ArrayList;

public class MergeSort {
	public static void merge(int[] arr, int st, int mid, int end) {
		ArrayList<Integer> list = new ArrayList<>();
		int left=st;
		int right=mid+1;
		while(left<=mid && right<=end) {
			if(arr[left]<=arr[right]) {
				list.add(arr[left]);
				left++;
			}
			else {
				list.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			list.add(arr[left]);
			left++;
		}
		while(right<=end) {
			list.add(arr[right]);
			right++;
		}
		for(int i=st;i<=end;i++) {
			arr[i]=list.get(i-st);
		}
	}
	public static void  mergeSort(int arr[],int st,int end) {
		if(st>=end) {
			return;
		}
		int mid=st+(end-st)/2;
		mergeSort(arr,st,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,st,mid,end);
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {11,1,2,5,9,6};
		mergeSort(arr,0,arr.length-1);
		printArray(arr);
	}


}
