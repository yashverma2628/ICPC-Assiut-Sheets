/*
 * Problem: Q. Count Subarrays
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Q
 * Language: Java 21
 */
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        if (!s.hasNextInt()) return; 
        int t = s.nextInt(); 
        
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            
            long totalSubarrays = 0; 
            int currentLength = 1;
            
            for (int i = 0; i < n; i++) {
               
                if (i > 0 && arr[i] >= arr[i - 1]) {
                    currentLength++; 
                } else {
                    
                    currentLength = 1;
                }
                
              
                totalSubarrays += currentLength;
            }
          
            System.out.println(totalSubarrays);
        }
        
        
    }
}