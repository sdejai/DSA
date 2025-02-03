package Codes;

public class SecondLargestNumber {

	public static int secondLargestNumber(int arr[]){
		int largestNumber=0;
		int secondLargestNumber=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestNumber) {
				largestNumber=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largestNumber) {
				if(arr[i]>secondLargestNumber) {
					secondLargestNumber=arr[i];
				}
			}
		}
		return secondLargestNumber;
	}
	
	public static void main(String[] args) {
		int arr[]= {5,12,2,67,8,345};
		System.out.println(secondLargestNumber(arr));
	}

}
