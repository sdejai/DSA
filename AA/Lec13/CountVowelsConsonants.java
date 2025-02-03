package Codes;

public class CountVowelsConsonants {
	public static void countVowelsConsonants(String str){
		int countVowels=0;
		int countConsonsnts=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||
			   str.charAt(i)=='e' ||
			   str.charAt(i)=='i' ||
			   str.charAt(i)=='o' ||
			   str.charAt(i)=='u' ||
			   str.charAt(i)=='A' ||
			   str.charAt(i)=='E' ||
			   str.charAt(i)=='I' ||
			   str.charAt(i)=='O' ||			   
			   str.charAt(i)=='U'){
				countVowels++;
			}
			else {
				countConsonsnts++;
			}
		}
		System.out.println("Vowels---> "+countVowels);
		System.out.println("Consonants---> "+countConsonsnts);
	}
	public static void main(String[] args) {
		String str="CodingBlocks";
		countVowelsConsonants(str);
	}

}
