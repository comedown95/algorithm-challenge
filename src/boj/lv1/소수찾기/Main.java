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
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : 첫 줄에 수의 개수 N, 다음으로 N개의 수
        int n = Integer.parseInt(br.readLine());
        final StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 출력 : 주어진 수들 중 소수의 개수
    }
}
