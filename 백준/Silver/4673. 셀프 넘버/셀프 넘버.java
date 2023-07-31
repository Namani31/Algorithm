public class Main {
    public static int d(int number) {
        int sum = number;

        /*
            1234가 들어온다면

            첫 번째 while문
            sum = sum + (1234 % 10) -> 1234 + 4
            number = 123

            두 번째 while문
            sum = sum + (1234 + 4) + 3
            number = 12

            ...
         */
        while (number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
           1 ~ 10000 사이의 셀프 넘버를 구해야 함
           인덱스는 0부터 시작하므로 배열 크기를 10001 로 해야만 0~10000 범위 지정 해야 함
         */
        boolean[] check = new boolean[10001];

        // 셀프 넘버가 아님
        for (int notSelfNum = 1; notSelfNum <= 10000; notSelfNum++) {
            int n = d(notSelfNum);
            if (n < 10001) {
                check[n] = true;
            }
        }

        // 셀프 넘버 출력
        for (int selfNum = 1; selfNum <= 10000; selfNum++) {
            if (!check[selfNum]) {
                System.out.println(selfNum);
            }
        }
    }
}