package boj.배열.숫자의합;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        String numberStr = br.readLine();
        int sum = 0;

        for (int i = 0; i < N; i++) numbers[i] = (numberStr.charAt(i) - '0');

        for (int number : numbers) sum += number;

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
