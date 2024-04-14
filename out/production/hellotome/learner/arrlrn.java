package learner;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class arrlrn {
    public static void main(String[] args) {
//        int [] arr = new int[5]; // or directly int [] arr = {1,2,3,4,5};
        Scanner in = new Scanner(System.in);
//        arr[0] = in.nextInt();
//        arr[1] = in.nextInt();
//        arr[2] = in.nextInt();
//        arr[3] = in.nextInt();
//        arr[4] = in.nextInt();
//        System.out.println(Arrays.toString(arr));
//        String [] chars = new String[10];
//        for (int i = 0; i < 10; i++) {
//            chars[i] = in.next();
//        }
//        System.out.println(Arrays.toString(chars));
//        MULTIDIMENSION
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] arr = new int[3][3];
//        System.out.println(arr[0].length);
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }

//        }

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]) + " ");
//        Enhanced for:
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        int[] sum = new int[arr.length];
        for (int m = 0; m < arr.length; m++) {
            int sos = 0;
            for (int n = 0; n < arr[m].length; n++) {
                sos += arr[m][n];
            }
            sum[m] = sos;
            System.out.println(sum[m]);
        }
        OptionalInt max = Arrays.stream(sum).max();
        int x = max.getAsInt();
        System.out.println(x);
        System.out.println(Arrays.toString(sum));
    }
}
