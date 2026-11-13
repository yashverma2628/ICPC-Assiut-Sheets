/*
 * Problem: R. Permutation with arrays
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/R
 * Language: Java 21
 */
import java.util.Scanner;
import java.util.Arrays;

public class q18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();

        long[] arr = new long[n];
         long[] arr2 = new long[n];

        for(int i=0;i<n;i++){ arr[i] = s.nextLong();}
        
        for(int j=0;j<n;j++){ arr2[j] = s.nextLong();}

        

        Arrays.sort(arr);
        Arrays.sort(arr2);

       
        if(Arrays.equals(arr, arr2)){ System.out.println("yes");}
        else{ System.out.println("no");}

        
        
        
    }
}