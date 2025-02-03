package Codes;

public class FirstLargestNumbers {
	
	public static int firstLargestNumber(int arr[]){
		int largestNumber=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestNumber) {
				largestNumber=arr[i];
			}
		}
		return largestNumber;
	}

	public static void main(String[] args) {
		int arr[]= {23,54,7,5,123,987,2,96};
		System.out.println(firstLargestNumber(arr));
	}

}
