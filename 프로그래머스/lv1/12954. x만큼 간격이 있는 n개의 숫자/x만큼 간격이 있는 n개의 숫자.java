import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int loop = 0; loop < n; loop++) {
            answer[loop] = (long) x * (loop + 1);
        }
        return answer;
    }
}
