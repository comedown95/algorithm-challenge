package boj.자료구조.기초.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * [백준 온라인 저지] 9012 - 괄호
 * https://www.acmicpc.net/problem/9012
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T를 입력받습니다.

        for (int i = 0; i < T; i++) {
            String input = br.readLine(); // 괄호 문자열을 입력받습니다.
            Stack<Character> stack = new Stack<>(); // 문자를 저장할 스택을 생성합니다.
            boolean isVPS = true; // 현재 괄호 문자열이 VPS인지 아닌지를 나타내는 변수입니다.

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j); // 문자열의 j번째 문자를 가져옵니다.

                if (c == '(') { // 여는 괄호인 경우 스택에 푸시합니다.
                    stack.push(c);
                } else if (stack.isEmpty()) { // 닫는 괄호인데 스택이 비어있으면 VPS가 아닙니다.
                    isVPS = false;
                    break; // 더 이상 확인할 필요가 없으므로 반복문을 종료합니다.
                } else { // 닫는 괄호인데 스택이 비어있지 않으면 스택에서 하나를 팝합니다.
                    stack.pop();
                }
            }

            // 모든 문자를 확인한 후 스택이 비어있지 않으면 VPS가 아닙니다.
            if (!stack.isEmpty()) isVPS = false;

            // VPS 여부에 따라 결과를 출력합니다.
            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}
