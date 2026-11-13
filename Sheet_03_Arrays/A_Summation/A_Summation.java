/*
 * Problem: A. Summation
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/A
 * Language: Java 21
 */
import java.util.Scanner;
public class q1 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; long sum=0;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
sum = sum +arr[i];

}

if(sum<0){ sum = sum + -2*sum;}
System.out.println(sum);





}

}