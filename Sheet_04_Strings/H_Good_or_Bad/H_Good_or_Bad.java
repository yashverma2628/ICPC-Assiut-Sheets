/*
 * Problem: H. Good or Bad
 * Sheet: ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/H
 * Language: Java 21
 */
import java.util.Scanner;
public class q8 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);
int p=s.nextInt();
String[] arr = new String[p];

for(int i=0;i<p;i++){

    arr[i]=s.next();

}



for(int i=0;i<p;i++){

    

    if(arr[i].contains("010") || arr[i].contains("101")){System.out.println("Good");}
    else {System.out.println("Bad");}

}




}

}
