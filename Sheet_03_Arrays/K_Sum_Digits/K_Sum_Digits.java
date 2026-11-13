/*
 * Problem: K. Sum Digits
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/K
 * Language: Java 21
 */
import java.util.Scanner;
public class q11 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();
String p = s.next();
int sum=0;

for (int i=0;i<n;i++){

sum = sum  + (p.charAt(i)-48);


}
System.out.println(sum);

}

}

