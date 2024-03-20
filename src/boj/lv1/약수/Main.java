package boj.lv1.약수;

import java.io.*;
import java.util.StringTokenizer;

/*
 * [백준 온라인 저지] 1037 - 약수
 * https://www.acmicpc.net/problem/1037
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N의 진짜 약수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // N의 진짜 약수

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println(min * max);
    }
}
