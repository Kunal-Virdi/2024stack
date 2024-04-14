package learner;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = in.nextInt();
        if(salary >= 10000)
        {
            salary += 1000;
        }
        if(salary >= 20000)
        {
            salary += 2000;
        }
        if(salary >= 30000)
        {
            salary += 2500;
        }
        System.out.println(salary);
    }
}
