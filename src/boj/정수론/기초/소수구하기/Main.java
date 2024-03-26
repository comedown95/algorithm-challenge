package boj.정수론.기초.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 1929 - 소수 구하기
 * https://www.acmicpc.net/problem/1929
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[end + 1]; // 소수 판별 배열
        java.util.Arrays.fill(isPrime, true); // 모두 소수로 초기화

        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        // 에라토스테네스의 체 적용
        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) sb.append(i).append('\n');
        }
        System.out.print(sb);
    }
}
