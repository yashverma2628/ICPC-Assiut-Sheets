/*
 * Problem: H. Sorting
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/H
 * Language: Java 21
 */

import java.util.Scanner;
import java.util.Arrays;
public class q8 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; int p=1;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}


Arrays.sort(arr);

for (i=0;i<n;i++){

 System.out.print(arr[i] + " ");
 
}




}

}


