package Class_0713.Confirmation_question;

import java.util.*;

public class No9 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        // 방법1
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            totalScore += value;
            maxScore = (maxScore < value) ? value : maxScore;
            name = (maxScore <= map.get(key)) ? key : name;
        }

        System.out.println("평균 점수 : " + totalScore / map.size());
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("최고 점수를 받은 아이디 : " + name);
        System.out.println();
        totalScore = 0;
        maxScore = 0;
        name = null;

        // 방법2
        /*
         * Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
         * Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
         * while(iterator1.hasNext()) {
         * Map.Entry<String, Integer> entry = iterator1.next();
         * String key = entry.getKey();
         * int value = entry.getValue();
         * totalScore += value;
         * maxScore = (maxScore <= value)? value:maxScore;
         * name = (maxScore<= value)? key:name;
         * }
         * System.out.println("평균 점수 : " + totalScore/map.size());
         * System.out.println("최고 점수 : " + maxScore);
         * System.out.println("최고 점수를 받은 아이디 : " + name);
         */
    }
}
