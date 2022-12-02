import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        int j = 0;
        int count = 0;

        for (int loop = 1; loop <= n; loop++) {
            if (n % loop == 0) {
                count++;
            }
        }
        
        answer = new int[count];

        for (int loop2 = 1; loop2 <= n; loop2++) {
            if (n % loop2 == 0) {
                answer[j] = loop2;
                j++;
            }
        }
        return answer;
    }
}
