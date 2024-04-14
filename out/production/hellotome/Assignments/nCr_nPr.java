package Assignments;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        int n,r,num,den,f,i=1,ncr,npr,sub;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        n = in.nextInt();
        System.out.print("Enter r:");
        r = in.nextInt();
        f = n;
        while(i<n){
            f *= i;
            i++;
        }
        num = f;
        i = 1;
        f = r;
        while(i<r){
            f *= i;
            i++;
        }
        den = f;
        i = 1;
        sub = n - r;
        f = sub;
        while(i<sub){
            f *= i;
            i++;
        }
        npr = num/f;
        ncr = num/(den*f);
        System.out.println("nPr: "+npr);
        System.out.println("nCr: "+ncr);
    }
}
