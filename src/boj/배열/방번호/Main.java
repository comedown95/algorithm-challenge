package boj.배열.방번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumbers = br.readLine();
        int[] count = new int[10];

        for (char ch : roomNumbers.toCharArray()) {
            count[ch - '0']++;
        }

        int sixNine = (count[6] + count[9] + 1) / 2;

        int max = sixNine;
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                max = Math.max(max, count[i]);
            }
        }

        System.out.println(max);
    }
}
