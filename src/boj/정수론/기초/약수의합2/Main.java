package boj.정수론.기초.약수의합2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * [백준 온라인 저지] 17427 - 약수의 합 2
 * https://www.acmicpc.net/problem/17427
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 테스트 케이스

        long sumOfDivisors = 0;

        for (int i = 1; i <= N; i++) {
            sumOfDivisors += (N / i) * i;
        }

        System.out.println(sumOfDivisors);
    }
}



