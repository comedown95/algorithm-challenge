package boj.lv1.약수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [백준 온라인 저지] 17425 - 약수의 합
 * https://www.acmicpc.net/problem/17425
 */
public class Main {
    private static final int MAX = 1000000;
    private static long[] f = new long[MAX + 1];
    private static long[] g = new long[MAX + 1];

    public static void main(String[] args) throws IOException {
        calculateFandG();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // 각 테스트 케이스의 N
            sb.append(g[N]).append('\n'); // g(N)의 값을 누적하여 StringBuilder에 추가
        }

        System.out.println(sb); // 결과 출력
    }

    private static void calculateFandG() {
        // 각 수의 약수의 합을 계산 (f(x) 계산)
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; i * j <= MAX; j++) {
                f[i * j] += i;
            }
        }

        // g(x) 계산
        for (int i = 1; i <= MAX; i++) {
            g[i] = g[i - 1] + f[i];
        }
    }
}

