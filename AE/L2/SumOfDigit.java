package code;

public class SumOfDigit {
	public static int sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int number=1019;
		System.out.println(sumOfDigit(number));
	}

}
