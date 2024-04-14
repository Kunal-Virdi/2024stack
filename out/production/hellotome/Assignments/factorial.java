package Assignments;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = n;
        int temp = 1;
        while(temp<n){
            f = f*temp;
            temp++;
        }
        System.out.println(f);
    }
}
