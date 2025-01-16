package code;

public class BinarySearch {
	public static boolean binarySearchRecursive(int arr[],int key,int st,int end) {
		if(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]<key) {
				return binarySearchRecursive(arr, key, mid+1, end);
			}
			else {
				return binarySearchRecursive(arr, key, st, mid-1);
			}
		}
		return false;
	}
	public static boolean binarySearchIntr(int arr[],int key) {
		int st=0;
		int end=arr.length-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]<key) {
				st=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {42,47,85,98,106,345};
		int key=3450;
		System.out.println(binarySearchRecursive(arr,key,0,arr.length-1));
		System.out.println(binarySearchIntr(arr,key));

	}

}
