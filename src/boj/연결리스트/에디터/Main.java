package boj.연결리스트.에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        LinkedList<Character> leftWords = new LinkedList<>();
        LinkedList<Character> rightWords = new LinkedList<>();

        for (char c : br.readLine().toCharArray()) leftWords.addLast(c);

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "L" -> {
                    if (!leftWords.isEmpty()) rightWords.addFirst(leftWords.removeLast());
                }
                case "D" -> {
                    if(!rightWords.isEmpty()) leftWords.addLast(rightWords.removeFirst());
                }
                case "B" -> {
                    if (!leftWords.isEmpty()) leftWords.removeLast();
                }
                case "P" -> {
                    leftWords.addLast(st.nextToken().charAt(0));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : leftWords) sb.append(c);
        for (char c : rightWords) sb.append(c);
        System.out.println(sb.toString());
    }
}
