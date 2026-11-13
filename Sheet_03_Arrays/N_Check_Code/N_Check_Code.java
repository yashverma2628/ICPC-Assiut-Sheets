/*
 * Problem: N. Check Code
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/N
 * Language: Java 21
 */
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String p = s.next();

        if (p.charAt(a) != '-') {
            System.out.println("No");
            return;
        }

              for (int i = 0; i < p.length(); i++) {
            if (i == a) continue; 

            if (!Character.isDigit(p.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
