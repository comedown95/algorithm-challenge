package boj.정수론.연습.GCD합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [백준 온라인 저지] 9613 - GCD 합
 * https://www.acmicpc.net/problem/9613
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            long answer = 0; // int에서 long으로 변경
            for (int j = 1; j < N; j++) { // j <= N에서 j < N으로 변경
                for (int k = j+1; k <= N; k++) { // k <= N에서 k < N으로 변경
                    int a = Integer.parseInt(arr[j]);
                    int b = Integer.parseInt(arr[k]);
                    answer += gcd(a, b);
                }
            }
            System.out.println(answer);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

