package boj.자료구조.기초.요세푸스문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 1158 - 요세푸스 문제
 * https://www.acmicpc.net/problem/1158
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cursor = K - 1;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) queue.add(i);

        while (!queue.isEmpty()) {
            cursor %= queue.size();
            sb.append(queue.remove(cursor));
            if (!queue.isEmpty()) sb.append(", ");
            cursor += K - 1;
        }

        System.out.println("<" + sb + ">");
    }
}
