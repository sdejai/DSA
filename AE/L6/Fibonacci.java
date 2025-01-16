package code;

public class Fibonacci {
	
	public static int fibonacciRecursive(int num) {
		if(num<=1) {
			return num;
		}
		return fibonacciRecursive(num-1)+fibonacciRecursive(num-2);
	}
	public static void main(String[] args) {
		int num=10;
		System.out.println(fibonacciRecursive(num));
	}

}
