/*
 * Problem: M. Replace MinMax
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/M
 * Language: Java 21
 */
import java.util.Scanner;
public class q13 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; int indmax=0; int indmin =0;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}
 int min =arr[0];
 int max=arr[0];


for (i=1;i<n;i++){

if(arr[i]<min){min = arr[i] ; indmin = i;   }
if(arr[i]>max){max = arr[i] ; indmax=i;  }


}

arr[indmax]=min;
arr[indmin]=max;

for (i=0;i<n;i++){

System.out.print(arr[i] + " ");


}









}

}

