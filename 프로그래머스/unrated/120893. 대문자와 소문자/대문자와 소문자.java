import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int loop = 0; loop < my_string.length(); loop++) {
            // // 아스키코드표에서 대문자 A ~ Z가 65~90임. 소문자 a ~ z는 97 ~ 122;
            // my_string[loop]가 91 보다 작으면 대문자로 판단, 크면 소문자로 판단
            if (my_string.charAt(loop) < 91) {
                answer += my_string.toLowerCase().charAt(loop);
            } else {
                answer += my_string.toUpperCase().charAt(loop);
            }
        }

        System.out.println(answer);

        return answer;
    }
}