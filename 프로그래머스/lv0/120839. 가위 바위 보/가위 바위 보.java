import java.util.*;

import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";

        for (int index = 0; index < rsp.length(); index++) {
            char currentChar = rsp.charAt(index);
            
            if (currentChar == '2')
                answer += "0";
            else if (currentChar == '0') 
                answer += "5";
            else
                answer += "2";
        }
        return answer;
    }
}
