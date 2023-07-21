import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentNum = 0;
        // 출석을 1부터 세므로 1~30이 필요함, 따라서 31 크기 배열 선언
        // boolean 타입은 선언하면서 false 로 초기화 됨
        boolean[] checkStudent = new boolean[31];

        for (int submit = 0; submit < 28; submit++) {
            // 번호 입력하면서 해당 위치 배열값은 true 로 지정
            checkStudent[scanner.nextInt()] = true;
        }

        for (int notSubmit = 1; notSubmit <= 30; notSubmit++) {
            if (!checkStudent[notSubmit]) {
                System.out.println(notSubmit);
            }
        }
    }
}