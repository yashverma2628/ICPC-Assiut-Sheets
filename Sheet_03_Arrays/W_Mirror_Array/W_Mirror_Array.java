/*
 * Problem: W. Mirror Array
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/W
 * Language: Java 21
 */
import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        
        char[][] arr = new char[n][m];
        
        
        for (int j = 0; j < n; j++) {
            String row = s.next();
            for (int i = 0; i < m; i++) {
                arr[j][i] = row.charAt(i);
            }
        }
        
        int p = s.nextInt()-1;
        int q = s.nextInt()-1;

        int yes = 1; 

    
        int startRow = Math.max(0, p - 1);
        int endRow = Math.min(n - 1, p + 1);
        int startCol = Math.max(0, q - 1);
        int endCol = Math.min(m - 1, q + 1);

        for (int j = startRow; j <= endRow; j++) {
            for (int i = startCol; i <= endCol; i++) {
                
                if(j==p && i==q){continue;}
                if (arr[j][i] == 'x') {
                    yes=0;}
                    else { yes=1; break;}
                   
                
            }
            if(yes==1){break;}
        }
        
       
        if (yes == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
       
    }
}