import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        // 홀수를 넣기 위해 1에서 2씩 증가하도록 함 (index += 2)
        for (int index = 1; index <= n; index += 2) {
            oddList.add(index);
        }

        return oddList;
    }
}