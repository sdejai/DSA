
import java.io.*;
import java.util.*;
public class Main {
    public static String linearSeacrh(int arr[],int find){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                return "found";
            }
        }
        return"Not Found";
    }
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int find = sc.nextInt();
        System.out.println(linearSeacrh(arr,find));
    }
}