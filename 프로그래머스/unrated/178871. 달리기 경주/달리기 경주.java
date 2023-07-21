import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> mappedByPlayer = new HashMap<>();
        HashMap<Integer, String> mappedByRank = new HashMap<>();

        // 각각의 맵을 초기화
        for (int mapReset = 0; mapReset < players.length; mapReset++) {
            mappedByPlayer.put(players[mapReset], mapReset);
            mappedByRank.put(mapReset, players[mapReset]);
        }

        for (int loop = 0; loop < callings.length; loop++) {
            // 추월한 유저 순위, 추월한 유저 이름
            // get() = Map 안의 값 가져오기
            int currentRank = mappedByPlayer.get(callings[loop]);
            String outrunPlayer = mappedByRank.get(currentRank);

            // 바로 앞 플레이어
            String frontPlayer = mappedByRank.get(currentRank - 1);

            // Swap
            mappedByPlayer.put(outrunPlayer, currentRank - 1);
            mappedByPlayer.put(frontPlayer, currentRank);

            mappedByRank.put(currentRank - 1, outrunPlayer);
            mappedByRank.put(currentRank, frontPlayer);
        }

        for (int print = 0; print < players.length; print++) {
            answer[print] = mappedByRank.get(print);
        }

        return answer;
    }
}