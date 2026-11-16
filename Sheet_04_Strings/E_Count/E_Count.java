/*
 * Problem: E. Count
 * Sheet: ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/E
 * Language: Java 21
 */
import java.util.Scanner;
public class q5 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);
String n= s.next();
int sum=0;

    for(int i=0;i<n.length();i++){

       sum = sum + n.charAt(i) -48;
    }

System.out.println(sum);
}

}

