package Codes;

public class SlidingWindowMaximum {
	
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int ans[]=new int[arr.length-k+1];
        for (int start=0;start<ans.length;start++) {
            int end = start + k - 1;
            int maxVal = arr[start];
            for (int j = start + 1; j<= end;j++) {
                if (arr[j] > maxVal) { 
                    maxVal = arr[j];
                }
            }
            ans[start] = maxVal;
        }
    return ans; 
    }
    
	public static void main(String[] args) {
//		int arr[]= {1,3,-1,-3,5,3,6,7};
		int arr[]= {1};
		int k=1;
//		int =3;
		int res[]=maxSlidingWindow(arr,k);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
