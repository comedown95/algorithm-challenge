package boj.배열.알파벳개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] words = sc.nextLine().toCharArray();
        int[] alphabetCount = new int[26];

        for (char word : words) alphabetCount[word - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (int count : alphabetCount) sb.append(count).append(" ");

        System.out.println(sb.toString());

        sc.close();
    }
}
