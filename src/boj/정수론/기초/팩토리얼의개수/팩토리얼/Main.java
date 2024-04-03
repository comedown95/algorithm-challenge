package boj.정수론.기초.팩토리얼의개수.팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [백준 온라인 저지] 1676 - 팩토리얼 0의 개수
 * https://www.acmicpc.net/problem/1676
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 5; i <= N; i *= 5) {
            count += N / i;
        }

        System.out.println(count);
    }
}
