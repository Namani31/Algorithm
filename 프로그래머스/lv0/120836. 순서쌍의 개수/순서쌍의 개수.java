import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int loop = 1; loop <= n; loop++) {
            if (n % loop == 0)  // n을 loop로 나누었을 때 나머지가 0 이면 순서쌍 해당
                answer++;
        }
        
        return answer;
    }
}
