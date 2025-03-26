package Codes;

import java.util.Stack;

public class VaildParentheses {

	public static void main(String[] args) {
		String s="{{}}(";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
	    Stack<Character> st = new Stack<>();
	    for(int i=0;i<s.length();i++){
	    	if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
	    		st.push(s.charAt(i));
	        }
	    else{
	          if (!st.empty() && 
	             ((st.peek() == '(' && s.charAt(i) == ')') ||
	             (st.peek() == '{' && s.charAt(i) == '}') ||
	             (st.peek() == '[' && s.charAt(i) == ']'))){
	                            st.pop(); 
	           }
	           else{
	        	   return false;
	           }
	        }
	     }
	     return st.empty();
	}
}
