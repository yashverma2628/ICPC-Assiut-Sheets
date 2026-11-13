/*
 * Problem: T. Matrix
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/T
 * Language: Java 21
 */
import java.util.Scanner;


public class q20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();
        

        int[][] arr = new int[n][n];
         
        for(int i=0;i<n;i++){ 
        for(int j=0;j<n;j++){ arr[i][j] = s.nextInt();}}

        int total1=0;
        int total2=0;
        for(int i=0;i<n;i++){ total1=total1+arr[i][i];}
        for(int i=0;i<n;i++){ total2=total2+arr[n-1-i][i];}

        int result = total1-total2;
        result=Math.abs(result);
        
        System.out.println(result);

        
        
        
        
  
    }
}