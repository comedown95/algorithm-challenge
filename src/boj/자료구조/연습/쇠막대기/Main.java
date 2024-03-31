package boj.자료구조.연습.쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [백준 온라인 저지] 10799 - 쇠막대기
 * https://www.acmicpc.net/problem/10799
 */
public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        char[] arr = br.readLine().toCharArray();
        final Stack<Character> stack = new Stack<>();
        char prev = ' '; // 이전 문자를 저장할 변수를 추가합니다.
        for (char c : arr) {
            if (c == '(') {
                stack.push(c);
            } else { // ')'를 만났을 때
                stack.pop();
                if (prev == '(') { // 레이저인 경우
                    count += stack.size();
                } else { // 쇠막대기의 끝인 경우
                    count += 1;
                }
            }
            prev = c; // 현재 문자를 이전 문자로 저장합니다.
        }
        System.out.println(count);
    }
}
