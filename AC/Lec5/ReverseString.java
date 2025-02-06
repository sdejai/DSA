package Codes;

public class ReverseString {
	public static void reverseString(char stringArr[]){
		int st=0;
		int end=stringArr.length-1;
		while(st<=end) {
			char temp=stringArr[st];
			stringArr[st]=stringArr[end];
			stringArr[end]=temp;
			st++;
			end--;
		}
	}
	public static void printReverseString(char[] stringArr) {
		for(int i=0;i<stringArr.length;i++) {
			System.out.print(stringArr[i]+" ");
		}
	}
	public static void main(String[] args) {
		char stringArr[]= {'h','e','l','l','o'};
		reverseString(stringArr);
		printReverseString(stringArr);
	}

}
