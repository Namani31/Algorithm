import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int count = 0;

        for (int firstArrayIndex = 0; firstArrayIndex < s1.length; firstArrayIndex++) {
            for (int secondArrayIndex = 0; secondArrayIndex < s2.length; secondArrayIndex++) {
                if (s1[firstArrayIndex].equals(s2[secondArrayIndex])) {
                    count++;
                }
            }
        }
        answer = count;

        return answer;
    }
}
