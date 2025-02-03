package Codes;

import java.util.Scanner;

public class BasicJava {
	public static void functionHello(int num){
		System.out.println(num);
		for(int i=1;i<=num;i++) {
			System.out.println("Hello");
		}
	}
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();//input
		System.out.println(num);//printing num
		functionHello(num);//funtion
		BasicJava basic = new BasicJava();//creating object 
		int num1=5;
		int num2=10;
		System.out.println(basic.sum(num1, num2));//calling by using object
	}

}
