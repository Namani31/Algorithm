class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];

        for (int loop = 0; loop < answer.length; loop++) {
            if (loop % 2 == 0)
                answer[loop] = money / 5500;
            else
                answer[loop] = money % 5500;
        }

        return answer;
    }
}
