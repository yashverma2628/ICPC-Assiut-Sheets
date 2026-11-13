/*
 * Problem: Z. Binary Search
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Z
 * Language: Java 21
 */
import java.util.Scanner;
import java.util.Arrays;

public class q26 {
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
       
      Arrays.sort(arr1);
       
       int key=0;

       for(int i=0;i<m;i++){

         key=arr2[i];

         int start=0;
         int end = n-1;
         int found =0;

         

         while(start<=end){

            int mid = start +(end-start)/2;
            if(arr1[mid]>key){end=mid-1;}
            if(arr1[mid]<key){start = mid +1;}
            if(arr1[mid]==key){ found =1; break;}
         }

         if(found==0){System.out.println("not found");}
         else {System.out.println("found");}
       }
    }
}