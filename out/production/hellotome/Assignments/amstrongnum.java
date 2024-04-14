package Assignments;

import java.util.Scanner;

public class amstrongnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        variables are num-ognum-temp-n-count-rem-result
        int num = in.nextInt();
        int ognum, count = 0, rem;
        double result = 0;
        ognum = num;
        int temp = num;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        while(ognum != 0){
            rem = ognum%10;
//            ???don't know why but result can't be int but double
            result += Math.pow(rem,count);
            ognum /= 10;
        }
        double n = num;
//        can't do result==num coz num is int and result is while so cast num into double by assigning new var n
        if(result == n){
            System.out.println("Armstrong's number");
        }
        else {
            System.out.println("Not an Armstrong's number");
        }
    }
}
