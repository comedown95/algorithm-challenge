package boj.배열.연속된숫자의합;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");
        int k = Integer.parseInt(br.readLine());
        int sum = 0, windowSum = 0;

        // 초기 윈도우의 합을 계산
        for (int i = 0; i < k; i++) {
            windowSum += Integer.parseInt(numbers[i]);
        }
        sum = windowSum;

        // 슬라이딩 윈도우를 이용한 합의 업데이트
        for (int i = k; i < numbers.length; i++) {
            windowSum += Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[i - k]);
            sum = Math.max(sum, windowSum);
        }

        System.out.println(sum);
    }
}
