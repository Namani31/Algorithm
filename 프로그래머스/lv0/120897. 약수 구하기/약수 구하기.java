import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int index = 1; index <= n / 2; index++) {
            if (n % index == 0) {
                answer.add(index);
            }
        }

        answer.add(n);

        return answer.stream().mapToInt(element -> element).toArray();
    }
}
