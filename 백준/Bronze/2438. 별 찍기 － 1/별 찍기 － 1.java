import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int rowNum = 0; rowNum < num; rowNum++) {  // 가로 찍기
            for (int colNum = 0; colNum <= rowNum; colNum++)    // 세로 찍기, colNum < rowNum 을 하면 맨 처음에 안 찍고 두번째줄부터 찍음
                System.out.print("*");
            System.out.print("\n"); // 별 다 찍고나면 줄 개행
        }
    }
}
