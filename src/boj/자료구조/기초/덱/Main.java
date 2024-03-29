package boj.자료구조.기초.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 10866 - 덱
 * https://www.acmicpc.net/problem/10866
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        LinkedList<String> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push_front" -> deque.addFirst(st.nextToken());
                case "push_back"  -> deque.addLast(st.nextToken());
                case "pop_front"  -> sb.append(deque.isEmpty() ?"-1" :deque.removeFirst()).append("\n");
                case "pop_back"   -> sb.append(deque.isEmpty() ?"-1" :deque.removeLast()).append("\n");
                case "size"       -> sb.append(deque.size()).append("\n");
                case "empty"      -> sb.append(deque.isEmpty() ?"1" :"0").append("\n");
                case "front"      -> sb.append(deque.isEmpty() ?"-1" :deque.peekFirst()).append("\n");
                case "back"       ->sb.append(deque.isEmpty() ?"-1" :deque.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
