package boj.배열.애너그램만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstWord = br.readLine();
        String secondWord = br.readLine();

        int[] fristAlphabets = new int[26];
        int[] secondAlphabets = new int[26];

        // 첫 번째 단어의 각 문자 빈도 계산
        for (char c : firstWord.toCharArray()) {
            fristAlphabets[c - 'a']++;
        }

        // 두 번째 단어의 각 문자 빈도 계산
        for (char c : secondWord.toCharArray()) {
            secondAlphabets[c - 'a']++;
        }

        // 최소 제거해야 할 문자의 수 계산
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(fristAlphabets[i] - secondAlphabets[i]);
        }

        System.out.println(count);
    }
}
