import java.util.Scanner;

public class exercise1
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your marks obtained in Maths out of 100: ");
        int a = S.nextInt();
        System.out.print("Enter your marks obtained in Physics out of 100: ");
        int b = S.nextInt();
        System.out.print("Enter your marks obtained in Chemistry out of 100: ");
        int c = S.nextInt();
        System.out.print("Enter your marks obtained in English out of 100: ");
        int d = S.nextInt();
        System.out.print("Enter your marks obtained in IP out of 100:");
        int e = S.nextInt();
        int sum = a + b + c + d + e;
        float ps = sum * 100/500f;
        System.out.print("Congratulations, your percentage is: ");
        System.out.print(ps);
        System.out.println("%");
    }

}
