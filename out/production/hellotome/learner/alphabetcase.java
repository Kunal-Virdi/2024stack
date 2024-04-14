package learner;

import java.util.Scanner;

public class alphabetcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        System.out.println(in.next().trim().charAt(2));
        if (ch > 'a' && ch < 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
