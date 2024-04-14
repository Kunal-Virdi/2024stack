package Assignments;

public class patterns {
    public static void main(String[] args){
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            int start = num;
            for (int j = 1; j <= i; j++) {
                int y = ((j+1)*n)-start;
                int x = j % 2 != 0 ? start : y;
                System.out.print(x + " ");
                start += n - j;
            }
            num++;
            System.out.println();
        }
    }

    static void pattern9(int i) {
        int count = 1;
        for (int row = 0; row < i; row++) {
            int num = count;
            for (int column = 0; column <= row; column++) {
                int j = column%2==0? num : i;
                System.out.print(num + " ");
                num += num - column;
            }
            count++;
            System.out.println();
        }
    }

    static void pattern6point2(int row) {
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        for (int i = 0; i < 2*row; i++) {
            int columns = i>row? 2*row - i : i;

            int spaces = row - columns;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern7(int row) {
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int i = 0; i <= 2*row; i++) {
            int columns = i>row? 2*row - i : i;
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern6(int row) {
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
        for (int i = 0; i <= 2*row; i++) {
            int x = (i > row) ? (2 * ((2 * row) - i)) : (2 * i);
            int y = i > row? i-row : row - i;
            for (int j = 0; j < y; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < x; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int row) {
//    *
//   ***
//  *****
// *******
//*********
        for (int i = 0; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int row) {
//    *
//   **
//  ***
// ****
//*****
        for (int i = 0; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int row) {
//*****
// ****
//  ***
//   **
//    *
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = row; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int row) {
//*****
//****
//***
//**
//*
        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int row){
//*
//**
//***
//****
//*****
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
