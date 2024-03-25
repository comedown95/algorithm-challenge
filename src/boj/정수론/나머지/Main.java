package boj.정수론.나머지;

import java.io.*;

/*
* [백준 온라인 저지] 10430 - 나머지
* https://www.acmicpc.net/problem/10430
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력: 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
        String[] value = br.readLine().split(" ");
        int A = Integer.parseInt(value[0]);
        int B = Integer.parseInt(value[1]);
        int C = Integer.parseInt(value[2]);

        // 출력: 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        sb.append((A+B)%C).append("\n");
        sb.append(((A%C) + (B%C))%C).append("\n");
        sb.append((A*B)%C).append("\n");
        sb.append(((A%C) * (B%C))%C);
        System.out.println(sb.toString());
    }
}