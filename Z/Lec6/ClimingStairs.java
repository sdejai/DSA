package Codes;

public class ClimingStairs {
	
    public static int climbStairs(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
	public static void main(String[] args) {
		int n=2;
		System.out.println(climbStairs(n));
	}

}
