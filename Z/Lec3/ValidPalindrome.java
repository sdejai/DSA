package code;

public class ValidPalindrome {
	
	    public static boolean isPalindrome(String s) {
	        if(s.length()==0){
	            return true;
	        }
	        int st=0;
	        int end=s.length()-1;
	        while(st<=end){
	            if(!Character.isLetterOrDigit(s.charAt(st))){
	                st++;
	            }
	            else if(!Character.isLetterOrDigit(s.charAt(end))){
	                end--;
	            }
	            else{
	                if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(end))){
	                    return false;
	                }
	                st++;
	                end--;
	            }

	        }
	        return true;
	    }
	
	    public static void main(String[] args) {
	    	String str="race a car";
	    	System.out.println(isPalindrome(str));
	    }
}
