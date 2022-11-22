import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> multipleList = new ArrayList<>();   // for문이 끝나고서 값이 사라지면 안되므로 외부에 선언

        for (int index = 0; index < numlist.length; index++) {
            if (numlist[index] % n == 0)
                multipleList.add(numlist[index]);
        }

        int[] answer = multipleList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
