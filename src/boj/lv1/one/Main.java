package boj.lv1.one;

import java.util.Scanner;

/*
 * [백준 온라인 저지] 4375 - 1
 * https://www.acmicpc.net/problem/10430
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int number = 1;
            int length = 1;

            // 2와 5로 나누어 떨어지는 경우는 제외
            if (n % 2 == 0 || n % 5 == 0) continue;

            while (number % n != 0) {
                number = (number * 10 + 1) % n; // 큰 수를 다루기 위해 모듈로 연산 사용
                length++;
            }

            System.out.println(length);
        }
        scanner.close();
    }
}