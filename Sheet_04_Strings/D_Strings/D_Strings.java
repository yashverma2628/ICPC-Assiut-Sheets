/*
 * Problem: D. Strings
 * Sheet: ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/D
 * Language: Java 21
 */
import java.util.Scanner;
public class q4 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);
String n= s.next();
String m= s.next();

    System.out.println(n.length() + " " + m.length());
    System.out.println(n+m);

   char[] arr = new char[n.length()];
   char[] arr2 = new char[m.length()];

   arr=n.toCharArray();
   arr2=m.toCharArray();

    char temp=n.charAt(0);
    arr[0]=m.charAt(0);
    arr2[0]=n.charAt(0);

    for(int i=0;i<n.length();i++){
        System.out.print(arr[i]);
    }

    System.out.print(" ");
    for(int i=0;i<m.length();i++){
        System.out.print(arr2[i]);
    }


}

}
