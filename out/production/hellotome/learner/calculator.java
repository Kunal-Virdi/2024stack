package learner;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
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
    }
}
