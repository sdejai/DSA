package code;

public class FactorialRecursion {
	public static int factorialIterative(int num) {
		int result=1;
		for(int i=num;i>=1;i--) {
			result=result*i;
		}
		return result;
	}
	
	public static int factorialRecursive(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*factorialRecursive(num-1);
	}
	public static void main(String[] args) {
		int num=4;
		System.out.println(factorialIterative(num));
		System.out.println(factorialRecursive(num));

	}

}
