/*
 * Problem: B. Searching
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/B
 * Language: Java 21
 */
import java.util.Scanner;
public class q2 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; long sum=0; int found=0;

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}
int x = s.nextInt();

for (i=0;i<n;i++){

if(x==arr[i]){ System.out.println(i);  found =1;break;}


}
if(found==0){ System.out.println("-1");}






}

}