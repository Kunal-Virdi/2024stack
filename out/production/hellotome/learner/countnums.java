package learner;

public class countnums {
    public static void main(String[] args) {
        int i = 356344;
        int count = 0;
        while(i>0){
            int rem = i % 10;
            if (rem == 3){
                count++;
            }
            i /= 10;
        }
        System.out.println(count);
    }
}
