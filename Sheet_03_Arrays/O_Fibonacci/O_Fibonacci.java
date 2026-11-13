/*
 * Problem: O. Fibonacci
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/O
 * Language: Java 21
 */
import java.util.Scanner;
public class q15 {
public static void main( String[] args){
Scanner s = new Scanner (System.in);
int i ;



int n= s.nextInt();


long f1=0;
long f2 =1;
if(n==1){ System.out.print(f1 + "");}
else if(n==2){ System.out.print(f2 + "");}
else {
long f3 =0;

        for (i=0;i+2<n;i++){

          f3 = f1 + f2;
          
          f1 = f2;
          f2=f3;  
           
                 
        }
        System.out.println(f3);
    }
       


      

}

}