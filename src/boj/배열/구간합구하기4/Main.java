package boj.배열.구간합구하기4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()) + 1;   // 수의 개수 N
        int M = Integer.parseInt(st.nextToken());       // 합을 구해야 하는 횟수 M
        int[] numbers = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N; i++) {
            numbers[i] = numbers[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            bw.write((numbers[end] - numbers[start - 1]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
