/*
 * Problem: V. Frequency Array
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/V
 * Language: Java 21
 */
import java.util.Scanner;


public class q22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();
        int m =s.nextInt();
        
        int[][] arr = new int[n][m];
            for(int j=0;j<n;j++)
                {
                    for(int i=0;i<m;i++)
                        { arr[j][i]= s.nextInt();}
                }



    for(int j=0;j<n;j++){

        for(int i=0;i<m;i++){

        System.out.print(arr[j][m-1-i] + " ");
        }
        System.out.println();
       
          
    
}

    
      
        
        
  
    }
}
