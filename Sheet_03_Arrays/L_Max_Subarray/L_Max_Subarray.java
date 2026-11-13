/*
 * Problem: L. Max Subarray
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/L
 * Language: Java 21
 */
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt(); 

        while (t > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

         
            for (int i = 0; i < n; i++) {
                int maxVal = arr[i];

              
                for (int j = i; j < n; j++) {
                    maxVal = Math.max(maxVal, arr[j]);
                    System.out.print(maxVal + " ");
                }
            }


            System.out.println(); 
            t--;
        }

       
    }
}