package boj.자료구조.연습.오큰수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * [백준 온라인 저지] 17298 - 오큰수
 * https://www.acmicpc.net/problem/17298
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수열의 크기 N
        int[] A = new int[N]; // 수열 A
        int[] NGE = new int[N]; // 각 원소의 오큰수를 저장할 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            /* 스택이 비어있지 않고, 현재 스택의 top에 있는 인덱스의 수열 값이 현재 수열의 값보다 작은 경우
             * 해당 인덱스의 오큰수를 현재 수열의 값으로 업데이트 하고 스택에서 그 인덱스를 제거합니다. */
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                NGE[stack.pop()] = A[i];
            }
            // 현재 인덱스를 스택에 저장합니다.
            stack.push(i);
        }

        // 스택에 남아 있는 인덱스의 오큰수는 -1입니다.
        while (!stack.isEmpty()) {
            NGE[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(NGE[i]).append(' ');
        }

        System.out.println(sb);
    }
}
