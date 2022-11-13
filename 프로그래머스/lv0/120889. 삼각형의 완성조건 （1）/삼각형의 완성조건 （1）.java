import java.util.*;


class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int[] triangel = sides;

        Arrays.sort(triangel);

        if (triangel[triangel.length - 1] < triangel[0] + triangel[1])
            return answer = 1;
        else
            return answer = 2;
    }
}
