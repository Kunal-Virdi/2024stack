package Assignments;

import java.util.Arrays;

public class nprarrays {
    public static void main(String[] args) {
//        CONCATENATION OF ARRAY
//        int[] nums = {1,2,3,1};
//        int[] ans = new int[nums.length*2];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[i];
//            ans[i+nums.length] = nums[i];
//        }
//        System.out.println("Array built by you: "+Arrays.toString(nums));
//        System.out.println("Array processed: "+Arrays.toString(ans));

//        RUNNING SUM OF ARRAY
//        int[] nums = {4,7,2,4,2};
//        int[] sum = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if(i == 0){                     // I wouldn't have added the 'if' statement if it accepted [-1] index and assigned sum[-1] = 0, as the array had a null value!
//                sum[i] = nums[i];
//                continue;
//            }
//            sum[i] = sum[i-1] + nums[i];
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(sum));
//      WEALTHIEST CUSTOMER
//        int[][] accounts = {{1,4,2},{2,4,2}};
//        int m = accounts.length;
//        int n = accounts[0].length;
//        System.out.println(Arrays.toString(accounts));
        int[] nums = {4,8,1,5,6,2};
        int[] shuffle = new int[nums.length];
        int n = nums.length/2;
        for (int i = 0; i < 2*n ; i++){
            if(i%2==0) {
                shuffle[i] = nums[i / 2];
            }
        }
        int t =n;
        for (int i = 0; i < 2*n; i++) {
            if(i%2 != 0){
                shuffle[i] = nums[t];
                t++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(shuffle));
    }
}
