package Codes;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {11,13,1,4,67,8,23};
		insertionSort(arr);
		printArr(arr);
	}

}
