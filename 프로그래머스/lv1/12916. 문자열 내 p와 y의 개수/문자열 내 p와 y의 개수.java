class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String lowStr = s.toLowerCase();
        int pCount = 0, yCount = 0;

        for (int loop = 0; loop < lowStr.length(); loop++) {
            if (lowStr.charAt(loop) == 112)
                pCount++;
            else if (lowStr.charAt(loop) == 121)
                yCount++;
        }

        if (pCount != yCount)
            answer = false;

        return answer;

    }
}