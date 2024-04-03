package boj.정수론.기초.팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [백준 온라인 저지] 10872 - 팩토리얼
 * https://www.acmicpc.net/problem/10872
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(1);
        } else {
            int answer = 1;
            for (int i = N; i > 0; i--) {
                answer *= i;
            }
            System.out.println(answer);
        }
    }
}
