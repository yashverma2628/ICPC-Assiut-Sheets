/*
 * Problem: J. Lucky Array
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/J
 * Language: Java 21
 */
import java.util.Scanner;
public class q10 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; int index=0;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}
 int min =arr[0];


for (i=0;i<n;i++){

if(arr[i]<min){min = arr[i] ;   }


}

for (i=0;i<n;i++){

if(arr[i]==min){index++;  }


}
if(index%2==0){System.out.println("Unlucky");}
else {System.out.println("Lucky");}







}

}

