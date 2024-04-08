package boj.정수론.연습.이진수팔진수;

import java.util.Scanner;

/**
 * [백준 온라인 저지] 1373 - 2진수 8진수
 * https://www.acmicpc.net/problem/1373
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine(); // 이진수 입력 받기
        scanner.close();

        // 이진수 문자열의 길이를 3의 배수로 만들기 위해 왼쪽에 0을 추가
        int lengthMod = binaryString.length() % 3;
        if (lengthMod != 0) {
            binaryString = "0".repeat(3 - lengthMod) + binaryString;
        }

        StringBuilder octalString = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 3) {
            // 3자리씩 끊어서 해당하는 8진수 값 찾기
            String binarySubString = binaryString.substring(i, i + 3);
            octalString.append(binaryToOctal(binarySubString));
        }

        System.out.println(octalString);
    }

    // 3자리 이진수 문자열을 8진수 값으로 변환
    public static char binaryToOctal(String binaryString) {
        return switch (binaryString) {
            case "000" -> '0';
            case "001" -> '1';
            case "010" -> '2';
            case "011" -> '3';
            case "100" -> '4';
            case "101" -> '5';
            case "110" -> '6';
            case "111" -> '7';
            default -> throw new IllegalArgumentException("Invalid binary string");
        };
    }
}