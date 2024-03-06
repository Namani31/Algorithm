import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int changeHourToMinute = 60 * A + B; // 시 -> 분
        changeHourToMinute += C;    // 요리하는데 걸린 시간 더하기
        
        int hour = (changeHourToMinute / 60) % 24;
        int minute = changeHourToMinute % 60;
        
        System.out.println(hour + " " + minute);
        
    }
}