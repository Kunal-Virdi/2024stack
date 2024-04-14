package learner;

public class srchalgo {
    public static void main(String[] args) {
        int[] a = {-25, -22, -20, -18, -12, -5, 0, 2, 4, 12, 25, 42};
        int target = -27;
//        int ans = linearsearch(a,target);
//        System.out.println("index: "+ ans);
//        int anss = lnsearch2(a,target);
//        System.out.println("target: "+ anss);
        int num = binsearch(a, target);
        System.out.println(num);
        System.out.println(a[num]);
    }

    static int lnsearch2(int[] arr, int t) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == t) {
                return element;
            }
        }
        return 0;
    }

    static int linearsearch(int[] arr, int t) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == t) {
                return index;
            }
        }
        return 0;
    }

    //    normal binary search
    static int binsearch(int[] arr, int t) {

//      assuming the array to be ascending in order.
        while(t<arr[arr.length - 1]){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (t < arr[mid]) {
                    end = mid - 1;
                } else if (t > arr[mid]) {
                    start = mid + 1;
                } else if (t == arr[mid]) {
                    return mid;
                }
            }
            t++;
        }

        return -1;
    }
// order-agnostic binary search
    static int OAbinsch(int[] arr,int t){
        int start = 0;
        int end = arr.length - 1;
//        adding an argument to check whether the array is in ascending or descending; assuming it to be sorted!
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == t){
                return mid;
            }

            if(isAsc){
                if (t < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else{
                if (t > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;

    }

}