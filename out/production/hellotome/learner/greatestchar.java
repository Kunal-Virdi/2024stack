package learner;
// leeetcode 744: find smallest letter in the array greater than the target
public class greatestchar {
    public static void main(String[] args){
        char[] letters = {'a','c','f','k','m','q'};
        char target = 'b';
        System.out.println(greatestletter2(letters, target));
    }
    static char greatestletter(char[] l, char t){
        int start = 0;
        int end = l.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(t < l[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return l[start % l.length];
    }
    static char greatestletter2(char[] l, char t){
        int start = 0;
        int end = l.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(t > l[mid]){
                start = mid + 1;
            }else if(t < l[mid]){
                end = mid - 1;
            }else{
                return l[mid+1];
            }
        }
        return l[start % l.length];
    }
}
