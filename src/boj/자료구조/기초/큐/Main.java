package boj.자료구조.기초.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
 * [백준 온라인 저지] 10845 - 큐
 * https://www.acmicpc.net/problem/10845
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        LinkedList<String> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch (command) {
                case "push" -> queue.offer(st.nextToken());
                case "pop" -> sb.append(queue.isEmpty() ?-1 :queue.poll()).append("\n");
                case "size" -> sb.append(queue.size()).append("\n");
                case "empty" -> sb.append(queue.isEmpty() ?1 :0).append("\n");
                case "front" -> sb.append(queue.isEmpty() ?-1 :queue.peek()).append("\n");
                case "back" -> sb.append(queue.isEmpty() ?-1 :queue.getLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
