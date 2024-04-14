package learner;

import java.util.Arrays;
import java.util.Scanner;

public class Allsorts {
    public static void main(String[] args) {
        int[] arr = {2,6,4,8,3,5,1,7};
        System.out.println("Enter 1 to use insertion sort\n Enter 2 to use selection sort\n Enter 3 to use bubble sort" +
                "\n Enter 4 to use cycle sort");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch (x){
            case 1:
                insertion(arr);
                break;
            case 2:
                selection(arr);
                break;
            case 3:
                bubble(arr);
                break;
            case 4:
                cycle(arr);
            default:
                System.out.println("404");
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycle(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= i+1){
                swap(arr,i,correct);
            }else i++;
        }
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else break;
            }
        }
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr,maxindex,last);
        }
    }
    static void bubble(int[] arr){
//        the swapped bool is introduced in this function to optimise the code
//        if we run the code w/o this bool, it will run every single step even when the array is already sorted
//        debug the code for better understanding
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j= 0; j < arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//    the following function is used to find the index of the largest element in the array
    static int getMaxIndex(int[] arr, int first, int last){
        int max = first;
        for (int i = first; i <= last; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}