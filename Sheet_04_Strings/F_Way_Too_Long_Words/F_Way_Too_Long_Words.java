/*
 * Problem: F. Problem
 * Sheet: ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/F
 * Language: Java 21
 */
import java.util.Scanner;
public class q6 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);
int p=s.nextInt();
String[] arr = new String[p];

for(int i=0;i<p;i++){

    arr[i]=s.next();

}

for(int i=0;i<p;i++){

    if(arr[i].length()>10){ System.out.println(arr[i].charAt(0) + "" + (arr[i].length()-2) + "" + arr[i].charAt(arr[i].length()-1));}
    else{System.out.println(arr[i]);}

}




}

}
