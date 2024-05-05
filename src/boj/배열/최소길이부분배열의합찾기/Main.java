package boj.배열.최소길이부분배열의합찾기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) numbers[i] = Integer.parseInt(st.nextToken());

        int S = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(minSubArrayLen(N, numbers, S)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int minSubArrayLen(int n, int[] numbers, int s) {
        int start = 0, end = 0, sum = 0, minLen = Integer.MAX_VALUE;

        while (end < n) {
            sum += numbers[end];

            while (sum >= s) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= numbers[start];
                start++;
            }

            end++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
