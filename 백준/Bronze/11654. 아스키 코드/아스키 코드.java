import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char userInput = scanner.next().charAt(0);
        int asciiNum = (int)userInput;

        System.out.println(asciiNum);
    }
}