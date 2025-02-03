package Codes;

public class Anagram {
	public static Boolean angram(String str1,String str2){
		if(str1.length()!=str2.length()) {
			return false;
		}
		int arr1[]= new int[26];
		int arr2[]= new int[26];
		for(int i=0;i<str1.length();i++) {
			++arr1[str1.charAt(i)-'a'];
		}
		for(int i=0;i<str2.length();i++) {
			++arr2[str2.charAt(i)-'a'];
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1="cat";
		String str2="tac";
		System.out.println(angram(str1,str2));
	}

}
