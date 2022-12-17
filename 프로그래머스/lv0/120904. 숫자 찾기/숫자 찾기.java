import java.util.*;

class Solution {
    public int solution(int num, int k) {
        String numToString = Integer.toString(num);
        String stringK = Integer.toString(k);

        if (numToString.indexOf(stringK) == -1) {
            return -1;
        } else {
            return numToString.indexOf(stringK) + 1;
        }
    }
}
