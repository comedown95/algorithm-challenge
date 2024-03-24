package boj.lv1.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 1978 - 소수 찾기
 * https://www.acmicpc.net/problem/1978
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : 첫 줄에 수의 개수 N, 다음으로 N개의 수
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            if ( isPrime(number) ) count++;
        }

        // 출력 : 주어진 수들 중 소수의 개수
        System.out.println(count);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
