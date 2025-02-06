package Codes;

public class TowerOfHanoi {
	public static void toh(int n,String  source,String helper,String distin){
		if(n==0){
			return;
		}
		toh(n-1,source,distin,helper);
		System.out.println("Taking disk "+ n + " from "+ source +" To "+ distin);
		toh(n-1,helper,source,distin);
	}
	public static void main(String[] args) {
		int n=2;
		toh(n,"source","helper","distin");
	}

}
