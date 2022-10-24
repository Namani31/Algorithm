class Solution {
    public int[] solution(int[] num_list) {
        int[] reverseAnswer = new int[num_list.length];

        for (int loop = 0; loop < num_list.length; loop++) {
            reverseAnswer[num_list.length - 1 - loop] = num_list[loop];
        }

        return reverseAnswer;
    }
}