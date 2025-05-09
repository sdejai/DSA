package Codes;

public class AllSorting {

	public static void main(String[] args) {
		int arr[]= {11,13,1,4,67,8,23};
		selectionSort(arr);
		printArr(arr);
		bubbleSort(arr);
		printArr(arr);
		InsertionSort(arr);
		printArr(arr);
	}

	public static void InsertionSort(int[] arr) {
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

	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}  
		}
	}

	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}

}
