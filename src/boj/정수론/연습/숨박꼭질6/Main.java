package boj.정수론.연습.숨박꼭질6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 17087 - 숨박꼭질 6
 * https://www.acmicpc.net/problem/17087
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long N = Long.parseLong(st.nextToken()); // 찾아야 되는 동생의 수
        long S = Long.parseLong(st.nextToken()); // 현재 위치
        String[] arr = br.readLine().split(" ");

        long gcd = Math.abs(S - Long.parseLong(arr[0]));
        for (int i = 1; i < N; i++) {
            gcd = gcd(gcd, Math.abs(S - Long.parseLong(arr[i])));
        }

        System.out.println(gcd);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
