import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = (int) Math.sqrt(n);

        if (Math.pow(answer, 2) == n) {
            return answer = 1;
        }
        else
            return answer = 2;
    }
}