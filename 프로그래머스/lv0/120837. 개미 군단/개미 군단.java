import java.util.*;

class Solution {
    public int solution(int hp) {
        int answer = 0;

        int leaderAnt = hp / 5;
        int soliderAnt = (hp % 5) / 3;
        int workerAnt = (hp % 5) % 3;
        
        answer = leaderAnt + soliderAnt + workerAnt;
        
        return answer;
    }
}
