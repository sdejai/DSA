package code;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp =arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	public static void printSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {12,99,7833,1,3,65,9,13};
		selectionSort(arr);
		printSort(arr);
	}

}
