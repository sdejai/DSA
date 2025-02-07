package Codes;

public class CoinToss {
	public static void coinToss(int n,String ans) {
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		coinToss(n-1, ans+"H");
		coinToss(n-1, ans+"T");
	}
	public static void main(String[] args) {
		int n=3;
		coinToss(n,"");
	}

}
