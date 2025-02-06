package Codes;

public class GenerateParantheses {
	public static void generateParanthesis(int n,int open,int close,String ans){
		if(n==open && n==close) {
			System.out.print(ans+" ");
		}
		if(open<n) {
			generateParanthesis(n,open+1,close,ans+"(");
		}
		if(close<open) {
			generateParanthesis(n,open,close+1,ans+")");
		}
	}
	public static void main(String[] args) {
		int n=3;
		generateParanthesis(n,0,0,"");
	}

}
