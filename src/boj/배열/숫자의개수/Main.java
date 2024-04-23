package boj.배열.숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();

        int[] intCount = new int[10];
        String multiplication = String.valueOf(A * B * C);

        for(char i : multiplication.toCharArray()) {
            intCount[i - '0']++;
        }

        for (int count : intCount) {
            System.out.println(count);
        }
    }
}
