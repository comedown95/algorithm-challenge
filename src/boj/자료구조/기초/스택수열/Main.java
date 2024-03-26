package boj.자료구조.기초.스택수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * [백준 온라인 저지] 1874 - 스택수열
 * https://www.acmicpc.net/problem/1874
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 수열의 길이 n을 입력받습니다.
        int[] sequence = new int[n]; // 수열을 저장할 배열입니다.
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine()); // 수열의 각 요소를 입력받습니다.
        }

        StringBuilder sb = new StringBuilder(); // 연산을 저장할 StringBuilder 객체입니다.
        Stack<Integer> stack = new Stack<>(); // 스택을 초기화합니다.
        int num = 1; // 스택에 push할 현재 숫자를 나타냅니다.

        for (int i = 0; i < n; i++) {
            int current = sequence[i]; // 현재 처리해야 할 수열의 요소입니다.
            if (num <= current) { // 현재 숫자가 수열의 요소보다 작거나 같으면, 해당 숫자까지 스택에 push합니다.
                while (num <= current) {
                    stack.push(num++);
                    sb.append("+\n");
                }
            }
            if (stack.peek() == current) { // 스택의 top이 현재 수열의 요소와 같다면 pop합니다.
                stack.pop();
                sb.append("-\n");
            } else { // 스택의 top이 현재 수열의 요소와 다르면 해당 수열을 만들 수 없습니다.
                System.out.println("NO");
                return; // 프로그램을 종료합니다.
            }
        }

        System.out.println(sb.toString()); // 가능한 경우, 저장된 연산들을 출력합니다.
    }
}