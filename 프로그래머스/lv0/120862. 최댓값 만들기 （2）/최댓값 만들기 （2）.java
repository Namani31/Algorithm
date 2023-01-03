import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int compareNum1 = numbers[0] * numbers[1];
        int compareNum2 = numbers[numbers.length - 1] * numbers[numbers.length -2];
        
        if (compareNum1 < compareNum2) {
            return compareNum2;
        } else {
            return compareNum1;
        }
    }
}
