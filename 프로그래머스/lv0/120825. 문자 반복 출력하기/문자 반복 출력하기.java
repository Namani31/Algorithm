import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int loop = 0; loop < my_string.length(); loop++) {
            char currentChar = my_string.charAt(loop);
            answer += String.valueOf(currentChar).repeat(n);
        }
        return answer;
    }
}
