/*
 * Problem: I. Palindrome
 * Sheet: ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/I
 * Language: Java 21
 */
import java.util.Scanner;
public class q9 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);

String n = s.next();

int p=1;

for(int i=0;i<n.length();i++){

    if(n.charAt(i)!=n.charAt(n.length()-1-i)){ p=0; break; }

}

if(p==0){System.out.println("NO");}
else {System.out.println("YES");}






}

}
