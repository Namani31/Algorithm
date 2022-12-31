import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int index = 0; index < my_string.length(); index++){
            if(!answer.contains(String.valueOf(my_string.charAt(index)))){
                answer += my_string.charAt(index);
            }
        }
        return answer;
    }
}

