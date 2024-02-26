import java.io.*;
import java.util.*;

public class Main {

    public static int[] stack;
    public static int dataSize = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        while(N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;

            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[dataSize] = item;
        dataSize++;
    }

    public static int pop() {
        if(dataSize == 0) {
            return -1;
        }

        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치함
        else {
            int top = stack[dataSize - 1];
            stack[dataSize - 1] = 0;
            dataSize--;
            return top;
        }
    }

    public static int size() {
        return dataSize;
    }

    public static int empty() {
        if(dataSize == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if(dataSize == 0) {
            return -1;
        } else {
            return stack[dataSize - 1];
        }
    }
}