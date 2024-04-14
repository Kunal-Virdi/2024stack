package learner;

public class recursion1 {
    public static void main(String[] args){
        int[] arr = {1,2,6,9,12,15};
        int target = 12;
        System.out.println(binsrch(arr,0,arr.length-1,target));
    }
    static int fibo(int n){
        if(n<2)
            return n;

        return fibo(n-1) + fibo(n-2);

    }
    static int binsrch(int[] nums,int start,int end,int t){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(nums[mid]==t){
            return mid;
        }
        if(t<nums[mid]){
            return(binsrch(nums,start,mid-1,t));
        }
        return binsrch(nums,mid + 1, end,t);
    }
}
