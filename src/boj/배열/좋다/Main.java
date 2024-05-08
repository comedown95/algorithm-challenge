package boj.배열.좋다;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) numbers[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(numbers);

        int count = 0;

        for (int i = 0; i < N; i++) {
            int left = 0, right = N - 1, target = numbers[i];

            while(left < right) {
                if (left == i) left++;
                if (right == i) right--;
                if (left >= right) break;

                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
