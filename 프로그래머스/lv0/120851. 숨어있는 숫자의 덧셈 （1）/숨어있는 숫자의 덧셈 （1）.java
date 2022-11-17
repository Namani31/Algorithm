import java.util.*;

class Solution {
    public int solution(String my_string) {
        String removeChar = my_string.replaceAll("[^0-9]", "");
        int answer = 0;

        for (int loop = 0; loop < removeChar.length(); loop++) {
            answer += Integer.parseInt(String.valueOf(removeChar.charAt(loop)));
        }
        
        return answer;
    }
}