/*
 * Problem: G. Palindrome Array
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/G
 * Language: Java 21
 */

import java.util.Scanner;
public class q7 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; int p=1;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}


for (i=0;i<n/2;i++){

if(arr[i]!=arr[n-i-1]){p=0; }



}
if(p==0){ System.out.println("NO");}
else {System.out.println("YES");}


}

}


