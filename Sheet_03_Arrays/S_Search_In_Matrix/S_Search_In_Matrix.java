/*
 * Problem: S. Search In Matrix
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S
 * Language: Java 21
 */
import java.util.Scanner;
import java.util.Arrays;

public class q19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();
        int m =s.nextInt();

        int[] arr = new int[n*m];
         

        for(int i=0;i<n*m;i++){ arr[i] = s.nextInt();}
        int key =s.nextInt();
        
        
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr, key);
       
       if(result<0){ System.out.println("will take number");}
       else {System.out.println("will not take number");}

        
        


       
        

        
        
        
    }
}