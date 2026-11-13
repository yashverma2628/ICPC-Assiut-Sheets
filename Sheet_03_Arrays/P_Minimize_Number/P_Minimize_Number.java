/*
 * Problem: P. Minimize Number
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/P
 * Language: Java 21
 */
import java.util.Scanner;
import java.lang.Integer;
public class q16 {
public static void main( String[] args){
Scanner s = new Scanner (System.in);
int i ;

int n= s.nextInt();
int div=0;
int operation=0;
int minop=Integer.MAX_VALUE;

int []arr = new int[n];


for(i=0;i<n;i++){

    arr[i] = s.nextInt();

}
i=0;
for(int j=0;j<n;j++){
for(;arr[i]>0;){
    
    if(arr[i]%2==0){div=1; arr[i]=arr[i]/2; operation++; }
    else {div =0; break;}

} i++;
if(minop>operation){ minop=operation;}

operation=0;
}

System.out.println(minop);
}

}