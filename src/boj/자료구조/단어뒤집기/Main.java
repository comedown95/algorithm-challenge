package boj.자료구조.단어뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * [백준 온라인 저지] 9093 - 단어 뒤집기
 * https://www.acmicpc.net/problem/9093
 * */
public class Main {
    /**
     * 입력
     * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다.
     * 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
     *
     * 출력
     * 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
     *
     * 예제 입력 1
     * 2
     * I am happy today
     * We want to win the first prize
     *
     * 예제 출력 1
     * I ma yppah yadot
     * eW tnaw ot niw eht tsrif ezirp
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = null;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sb = new StringBuilder();
            String[] words = br.readLine().split(" ");
            for (String word : words) {
                Stack<Character> stack = new Stack<>();
                for (char c : word.toCharArray()) {
                    stack.push(c);
                }

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }

            System.out.println(sb);
        }
    }


//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = null;
//
//        int T = Integer.parseInt(br.readLine());
//        for (int i = 0; i < T; i++) {
//            String[] words = br.readLine().split(" ");
//            for (String word : words) {
//                System.out.print(new StringBuilder(word).reverse().toString() + " ");
//            }
//        }
//    }

}
