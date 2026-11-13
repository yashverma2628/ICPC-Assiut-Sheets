/*
 * Problem: U. Is B a subsequence of A
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/U
 * Language: Java 21
 */
import java.util.Scanner;


public class q21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();
        int m =s.nextInt();
        
int[] arr = new int[n];
int[] arr2 = new int[m+1];
for(int i=0;i<n;i++){ arr[i]= s.nextInt();}



    for(int j=0;j<n;j++){

       
            
            if (arr[j] >= 1 && arr[j] <= m) {
                arr2[arr[j]]++;
            } 

    
}

     for(int j=1;j<=m;j++){
        System.out.println(arr2[j]);
     }
      
        

        
        
        
        
  
    }
}