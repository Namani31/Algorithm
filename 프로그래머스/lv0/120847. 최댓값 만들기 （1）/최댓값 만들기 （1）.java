import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] max = numbers;
        
        Arrays.sort(max);   // 배열 자체를 정렬된 순서로 변경
        
        answer = max[max.length - 1] * max[max.length - 2];
        
        return answer;
    }
}