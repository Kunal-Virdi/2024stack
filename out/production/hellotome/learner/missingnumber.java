package learner;

import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        missingNumber(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]<nums.length && nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }

//        for(int i = 0; i<nums.length;i++){
//
//            if(nums[i] < nums.length && nums[i]!= i){
//                swap(nums,i,nums[i]);
//            }
//        for(int index = 0; index <nums.length; index++){
//            if(nums[index]!=index){
//                return index;
//            }
//        }
    }

    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

