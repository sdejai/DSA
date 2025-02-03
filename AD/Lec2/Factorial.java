package code;

public class Factorial {
	public static int factorial(int num) {
		int result=1;
		for(int i=num;i>=1;i--) {
			result=result*i;
		}
		return result;
	}
	public static void main(String[] args) {
		int number=6;
		System.out.println(factorial(number));
	}

}
