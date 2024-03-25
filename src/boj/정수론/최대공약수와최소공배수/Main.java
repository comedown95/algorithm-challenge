package boj.정수론.최대공약수와최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 2609 - 최대공약수와 최소공배수
 * https://www.acmicpc.net/problem/2609
 */
public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b; // 최소공배수 계산
    }
}
