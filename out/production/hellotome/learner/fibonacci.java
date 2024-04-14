package learner;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        if(n == 0)
            System.out.println(n);
        if(n>=1)
            System.out.print(0+" ");
            System.out.print(1+" ");
        while (count <= n){
            int t = b;
            b = b + a;
            a = t;
            count++;
            System.out.print(b+" ");
        }
        System.out.println("\nyour desired fibonacci no. is: " + b);
    }
}
