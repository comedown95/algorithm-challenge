package boj.정수론.연습.팔진수이진수;

import java.util.Scanner;

/**
 * [백준 온라인 저지] 1373 - 8진수 2진수
 * https://www.acmicpc.net/problem/1373
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 8진수 입력 받기
        String octal = scanner.nextLine();
        scanner.close();

        // 8진수를 2진수로 변환
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < octal.length(); i++) {
            // 각 8진수 숫자를 2진수로 변환하고, 앞에 0을 채워 3자리로 만든다
            String binPart = Integer.toBinaryString(Integer.parseInt(octal.substring(i, i + 1), 8));
            while (binPart.length() < 3) {
                binPart = "0" + binPart;
            }
            binary.append(binPart);
        }

        // 맨 앞의 불필요한 0들 제거 (단, 0만 있는 경우는 0을 유지)
        while (binary.length() > 1 && binary.charAt(0) == '0') {
            binary.deleteCharAt(0);
        }

        // 결과 출력
        System.out.println(binary.toString());
    }
}