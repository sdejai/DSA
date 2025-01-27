package Codes;

public class QuickSort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int partition(int[] arr, int st, int end) {
		int pivot=arr[st];
		int i=st+1;
		int j=end;
		while(i<=j) {
			while(i<=end && arr[i]<=pivot) {
				i++;
			}
			while(j>=st && arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[st];
		arr[st]=arr[j];
		arr[j]=temp;
		return j ;
	}
	public static void quickSort(int[] arr, int st, int end) {
		if(st<end) {
			int pi=partition(arr,st,end);
			quickSort(arr,st,pi-1);
			quickSort(arr,pi+1,end);
		}
	}

	public static void main(String[] args) {
		int arr[]= {11,1,2,5,9,6,23,22,3345,987};
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}



	

}
