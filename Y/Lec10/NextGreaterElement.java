package Codes;

public class NextGreaterElement {
	
	public static void nextGreaterElement(int arr[],int ans[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					ans[i]=arr[j];
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
//		int arr[]= {2,3,5,1,8};
		int arr[]= {2, 1, 35, 22, 5 };
		int ans[]=new int[arr.length];
		for(int i=0;i<ans.length;i++) {
			ans[i]=-1;
		}
		nextGreaterElement(arr,ans);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
