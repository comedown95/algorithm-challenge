package boj.배열.주몽;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] parts = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) parts[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(parts);

        int left = 0, right = N - 1, count = 0;

        while (left < right) {
            int sum = parts[left] + parts[right];
            if (sum == M) {
                count++;
                left++;
            } else if (sum < M) {
                left++;
            } else {
                right--;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
