import java.util.*;

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int coordX = dot[0], coordY = dot[1];

        for (int loop = 0; loop < dot.length; loop++) {
            if (coordX > 0 && coordY > 0) {
                answer = 1;
            }
            else if (coordX < 0 && coordY > 0) {
                answer = 2;
            }
            else if (coordX < 0 && coordY < 0) {
                answer = 3;
            }
            else
                answer = 4;
        }
        return answer;
    }
}