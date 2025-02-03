

import java.io.*;
import java.util.*;
public class Main {
    public static void printNumber(int num){
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printRevNumber(int num){
        for(int i=num;i>=1;i--){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        printNumber(num);
        printRevNumber(num);
        // System.out.println("Hello World!");
    }
}