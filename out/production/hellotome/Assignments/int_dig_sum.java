package Assignments;

import java.util.Scanner;

public class int_dig_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = in.nextInt();
        int i, count = 0;
        int n = num;
        while (num > 0) {
            i = num%10;
            count += i;
            num/= 10;
        }
        System.out.println("Sum of the digits of "+ n + "= "+ count);
    }
}
