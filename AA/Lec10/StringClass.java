package allCodes;

import java.util.Scanner;

public class StringClass {
	public static void stringBasic(String name) {
		int len=name.length();
		for(int i=0;i<len;i++) {
			System.out.print(name.charAt(i)+" ");
		}
	}
	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		stringBasic(name);
	}

}
