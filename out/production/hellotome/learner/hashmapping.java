package learner;

import java.util.HashMap;

public class hashmapping {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Maths",75);
        examScores.put("Science",85);
        examScores.put("English",95);
        System.out.println(examScores.toString());
//        to display a particular set of key and value
        System.out.println(examScores.get("Maths"));

        examScores.putIfAbsent("IP",96);
        System.out.println(examScores.size());
        System.out.println(examScores.getOrDefault("Punjabi",-1));
        examScores.replace("Maths",80);
        examScores.forEach((subject ,score) ->{
            examScores.replace(subject, score-10);
        });
        System.out.println(examScores.toString());

    }
}
