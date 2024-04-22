package boj.자료구조.브루트포스.기초.날짜계산;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int year = E;  // year를 E로 초기화합니다. 이는 (year - 1) % 15 + 1이 E와 일치하도록 합니다.

        while ((year - 1) % 28 + 1 != S || (year - 1) % 19 + 1 != M) {
            year += 15;  // 15년씩 증가합니다. 이는 E의 주기를 유지하면서 연도를 계산합니다.
        }

        System.out.println(year);
    }
}
