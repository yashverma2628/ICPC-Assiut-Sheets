/*
 * Problem: G. Conversion
 * Sheet: ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/G
 * Language: Java 21
 */
import java.util.Scanner;
public class q7 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);
String p=s.next();
int n=p.length();
char[] arr = new char[n];
arr=p.toCharArray();
for(int i=0;i<n;i++){
    
    if(Character.isLowerCase(arr[i])){ System.out.print(Character.toUpperCase(arr[i]));}
    if(Character.isUpperCase(arr[i])){System.out.print(Character.toLowerCase(arr[i]));}
    if(arr[i]==','){System.out.print(" ");}
}




}

}

