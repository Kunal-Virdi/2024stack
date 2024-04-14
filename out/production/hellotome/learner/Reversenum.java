package learner;

import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int ans = 0;
        while(i>0){
            int rem = i%10;
            i /= 10;
            ans = (ans*10) + rem;
        }
        System.out.println(ans);
    }
}
