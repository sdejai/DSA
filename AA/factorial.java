
import java.io.*;
import java.util.*;
public class Main {
    public static int factorial(int number){
        int result=1;
        for(int i=number;i>0;i--){
            result=result*i;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
}