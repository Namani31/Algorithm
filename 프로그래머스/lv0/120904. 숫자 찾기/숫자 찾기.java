import java.util.*;

class Solution {
    public int solution(int num, int k) {
        String numToStr = String.valueOf(num);
        String kToStr = String.valueOf(k);

        int answer = numToStr.indexOf(kToStr);
        return answer < 0 ? -1 : answer + 1 ;
    }
}
