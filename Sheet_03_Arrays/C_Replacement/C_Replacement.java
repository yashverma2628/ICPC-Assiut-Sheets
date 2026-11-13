/*
 * Problem: C. Replacement
 * Sheet: Sheet #3 (Arrays) — ICPC Assiut University Community
 * Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/C
 * Language: Java 21
 */
import java.util.Scanner;
public class q3 {

public static void main( String[] args){


Scanner s = new Scanner (System.in);


int n= s.nextInt();


int i ; 

int[] arr = new int[n];


for (i=0;i<n;i++){

 arr[i] = s.nextInt();
 
}


for (i=0;i<n;i++){

if(arr[i]<0){ arr[i]=2;System.out.print("2 ");  }
else if(arr[i]>0){ arr[i]=1;System.out.print("1 ");  }
else { arr[i]=0;System.out.print("0 ");  }


}







}

}
