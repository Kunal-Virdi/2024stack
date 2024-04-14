package learner;

import java.util.HashMap;

public class hashmapping {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Maths",75);
        examScores.put("Science",85);
        examScores.put("English",95);
        System.out.println(examScores.toString());

    }
}
