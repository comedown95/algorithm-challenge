package boj.배열.두수의합;

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

        int S = Integer.parseInt(br.readLine());

        Arrays.sort(numbers);

        bw.write(Integer.toString(sumCount(numbers, S)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int sumCount(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1, count = 0;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}