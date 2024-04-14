package learner;

import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
//        to print n numbers using for loop
//        for (int n = 1; n <= 6 ; n++) {
//            System.out.println(n);
//        }
//        to print hello world n no. of times
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        for (int num = 0; num < n ; num++) {
//            System.out.println("Hello World!");
//        to print n numbers using while loop
//        int num = 0;
//        while (num <= n){
//            System.out.println(num);
//            num++;

        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=n);
    }
}
