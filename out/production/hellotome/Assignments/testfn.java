package Assignments;

import java.util.Scanner;

public class testfn {
    public static void main(String[] arg){
        System.out.println("Enter 1 -> calculator");
        System.out.println("Enter 2 -> check greater of 3 integers");
        System.out.println("Enter 3 -> whether num is odd or even");
        System.out.println("Enter 4 -> whether prime or not");
        System.out.println("Enter 5 -> whether pythagoras triplets or not ");
        Scanner in =  new Scanner(System.in);
        int input = in.nextInt();
        switch(input){
            case 1 -> calculator();
            case 2 -> greater();
            case 3 -> odeve();
            case 4 -> isprime();
            case 5 -> pythagoras();
            default -> System.out.println("Must enter integer from the menu!!!");
        }
    }
    public static int calculator(){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            System.out.print("Enter a number: ");
            int num2 = in.nextInt();
            if(op == '+'){
                System.out.println(num1 + num2);
            }
            if(op == '-'){
                System.out.println(num1 - num2);
            }
            if(op == '*'){
                System.out.println(num1 * num2);
            }
            if(op == '/' && num2 != 0){
                System.out.println(num1 / num2);
            }
            if(op == '%' && num2 != 0) {
                System.out.println(num1 % num2);
            }
        }
        else{
            System.out.println("Invalid Operation!!");
        }
        return 0;
    }
    public static void greater(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greatest.");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + " is greatest.");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(num3 + " is greatest.");
        } else{
            System.out.println("all are equal.");
        }
    }
    public static void odeve(){
        System.out.println("enter any number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num%2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
    public static void isprime(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 2;
        while(i<num){
            if(num % i == 0){
                System.out.println("not prime");
                break;
            }
            else if(num % i != 0){
                if(i == num-1){
                    System.out.println("is prime");
                }
                i++;
            }
        }
        }
    public static void pythagoras(){
        System.out.println("enter three nums: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int H=0,P=0,B=0;
        if(a>b && a>c){
             H = a;
             P = b;
             B = c;
        }
        else if(b>a && b>c){
             H = b;
             P = a;
             B = c;
        }
        else if(c>a && c>b){
             H = c;
             P = a;
             B = b;
        }
        if(H*H == (P*P) + (B*B) ){
            System.out.println(a+" "+b+" "+c+" are pythagoras triplets ");
        }
        else if(H*H != (P*P) + (B*B) ){
            System.out.println(a+" "+b+" "+c+" are not pythagoras triplets ");
        }
    }
    }

