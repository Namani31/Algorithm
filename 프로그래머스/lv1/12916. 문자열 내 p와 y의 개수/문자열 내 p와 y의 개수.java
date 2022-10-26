class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String lowStr = s.toLowerCase();    // 대문자, 소문자 구별 안 하지만 아스키코드 판별하기 쉽게 문자열 전부 소문자로 만듦
        int pCount = 0, yCount = 0;

        for (int loop = 0; loop < lowStr.length(); loop++) {
            if (lowStr.charAt(loop) == 112) // 112는 아스키 코드로 p에 해당
                pCount++;
            else if (lowStr.charAt(loop) == 121)    // 121은 아스키 코드로 y에 해당
                yCount++;
        }

        if (pCount != yCount)   // p와 y의 개수 일치하지 않을 경우, false 반환
            answer = false;

        return answer;

    }
}