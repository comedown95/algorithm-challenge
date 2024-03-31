package boj.자료구조.연습.단어뒤집기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [백준 온라인 저지] 17413 - 단어뒤집기2
 * https://www.acmicpc.net/problem/17413
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        boolean inTag = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '<') {
                // 태그 시작 전에 스택에 남은 문자가 있다면 뒤집어서 결과에 추가
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                inTag = true;
                result.append(ch);
            } else if (ch == '>') {
                inTag = false;
                result.append(ch);
            } else if (inTag) {
                result.append(ch);
            } else {
                if (ch == ' ') {
                    // 공백을 만나면 스택에 남은 문자를 뒤집어서 결과에 추가하고, 공백도 추가
                    while (!stack.isEmpty()) {
                        result.append(stack.pop());
                    }
                    result.append(ch);
                } else {
                    // 태그 밖에서는 스택에 문자를 계속 푸시
                    stack.push(ch);
                }
            }
        }

        // 마지막에 스택에 남은 문자가 있다면 뒤집어서 결과에 추가
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result.toString());
    }
}