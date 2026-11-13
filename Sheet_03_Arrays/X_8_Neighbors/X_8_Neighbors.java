/*
 * Problem: X. 8 Neighbors
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/X
 * Language: Java 21
 */
import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        
       int[] arr1 = new int[n];
       int [] arr2 = new int[m];
      

       for(int i=0;i<n;i++){
        arr1[i]=s.nextInt();
       }
       for(int i=0;i<m;i++){
        arr2[i]=s.nextInt();
       }
       int ptr=0;
       int ptr2=0;
       
       

       while (ptr<n && ptr2<m ){

       if(arr1[ptr]==arr2[ptr2]){

        ptr2++;
       }

       ptr++;

       }

       if(ptr2==m){System.out.println("YES");}
       else{System.out.println("NO");}

        
       
    }
}