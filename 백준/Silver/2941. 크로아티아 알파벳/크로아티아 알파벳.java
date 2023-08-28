import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = 0;

        for (int loop = 0; loop < input.length(); loop++) {
            char alphabet = input.charAt(loop);

            if (alphabet == 'c') {
                if (loop < input.length() - 1) {
                    if (input.charAt(loop + 1) == '=') {
                        // c= 은 하나의 문자이므로 다음 문자 건너뛰기 위해 1 증가시킴
                        loop++;
                    } else if (input.charAt(loop + 1) == '-') {
                        // c- 은 하나의 문자이므로 건너뜀
                        loop++;
                    }
                }
            }

            // dz=, d- 일 경우
            if (alphabet == 'd') {
                if (loop < input.length() - 1) {
                    if (input.charAt(loop + 1) == 'z') {

                        if (loop < input.length() - 2) {
                            if (input.charAt(loop + 2) == '=') {    // dz= 일 경우
                                loop += 2;
                            }
                        }
                    } else if (input.charAt(loop + 1) == '-') {        // d- 일 경우
                        loop++;
                    }
                }
            }

            // lj인 경우
            if (alphabet == 'l') {
                if (loop < input.length() - 1) {
                    if (input.charAt(loop + 1) == 'j') {
                        loop++;
                    }
                }
            }

            // nj 일 경우
            if (alphabet == 'n') {
                if (loop < input.length() - 1) {
                    if (input.charAt(loop + 1) == 'j') {
                        loop++;
                    }
                }
            }

            // s= 일 경우
            if (alphabet == 's') {
                if (loop < input.length() - 1) {
                    if (input.charAt(loop + 1) == '=') {
                        loop++;
                    }
                }
            }

            // z= 일 경우
            if (alphabet == 'z') {
                if (loop < input.length() - 1) {
                    if (input.charAt(loop + 1) == '=') {
                        loop++;
                    }
                }
            }
            count++;
        }
        System.out.print(count);
    }
}