/*
 * Problem: Y. Range sum query
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Y
 * Language: Java 21
 */
import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        
       int[] arr1 = new int[n];
       
    
       for(int i=0;i<n;i++){
        arr1[i]=s.nextInt();
       
    }

    int a;
    int b;
    
    for(int i=0;i<m;i++){
        int sum=0;
        a=s.nextInt();
        b=s.nextInt();

        for(int j=a-1;j<b;j++){
            sum =  sum + arr1[j];
        }
        System.out.println(sum);
    }
}
}