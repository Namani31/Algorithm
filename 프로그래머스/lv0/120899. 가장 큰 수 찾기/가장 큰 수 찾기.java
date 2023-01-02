class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        int max = 0;
        int index = 0;
        
        for (int loop = 0; loop < array.length; loop++) {
            if (max < array[loop]) {
                max = array[loop];
                index = loop;
            }
        }
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}
