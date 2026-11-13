/*
 * Problem: F. Reversing
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/F
 * Language: Java 21
 */
import java.util.Scanner;
public class q6 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; 

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}


for (i=0;i<n;i++){

System.out.print(arr[n-i-1] + " ");



}



}

}


