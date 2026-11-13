/*
 * Problem: I. Smallest Pair
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/I
 * Language: Java 21
 */
import java.util.Scanner;
public class q9 {

public static void main( String[] args){

Scanner s = new Scanner (System.in);

int m = s.nextInt();
int sum =0;
int min=0;
    for(int k=0;k<m;k++)
    {
    int n= s.nextInt();
    int i ; 
    int[] arr = new int[n];


    for (i=0;i<n;i++){

    arr[i] = s.nextInt();
 
    }

min = arr[0] + arr[1] + 1;
for ( i=0;i<n;i++){
    
    for(int j=i+1;j<n;j++){
        sum = arr[i] + arr[j] + j - i;
        if(sum<min){ min = sum;}

    }




}
System.out.println(min);
min =0;
}



}

}


