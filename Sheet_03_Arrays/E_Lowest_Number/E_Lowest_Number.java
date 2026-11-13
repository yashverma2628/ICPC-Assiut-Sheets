/*
 * Problem: E. Lowest Number
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/E
 * Language: Java 21
 */
import java.util.Scanner;
public class q5 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; int index=0;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}
 int min =arr[0];


for (i=1;i<n;i++){

if(arr[i]<min){min = arr[i] ;   }


}

for (i=0;i<n;i++){

if(arr[i]==min){index =i; break;   }


}



System.out.println(min + " " + (index+1));





}

}

