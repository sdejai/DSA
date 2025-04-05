package Codes;

public class RainWater {
	public static int rainWaterTrapped(int arr[]) {
		int totalWater=0;
		for(int i=1;i<arr.length-1;i++) {
			int leftMax=arr[i];
			for(int j=0;j<i;j++) {
				leftMax=Math.max(leftMax, arr[j]);
			}
			int rightMax=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				rightMax=Math.max(rightMax, arr[j]);
			}
			if(arr[i]<leftMax && arr[i]<rightMax) {
				totalWater+=Math.min(rightMax,leftMax)-arr[i];
//				totalWater=totalWater+Math.min(rightMax,leftMax)-arr[i];
			}
		}
		return totalWater;
	}
	public static void main(String[] args) {
//		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int arr[]= {4,2,0,3,2,5};
		System.out.println(rainWaterTrapped(arr));
	}

}
