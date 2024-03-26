package boj.정수론.기초.골드바흐의추측;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [백준 온라인 저지] 6588 - 골드바흐의 추측
 * https://www.acmicpc.net/problem/6588
 */
public class Main {
    // 에라토스테네스의 체로 1백만 이하의 모든 소수를 찾는 메서드
    private static boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) isPrime[i] = true;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = sieveOfEratosthenes(1000000); // 1백만 이하 소수 미리 계산

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break; // 0이 입력되면 종료

            boolean valid = false;
            for (int a = 3; a <= n / 2; a += 2) {
                if (isPrime[a] && isPrime[n - a]) { // a와 n-a 모두 소수인지 확인
                    sb.append(n).append(" = ").append(a).append(" + ").append(n - a).append('\n');
                    valid = true;
                    break; // 첫 번째 발견되는 쌍으로 출력하고 반복 종료
                }
            }

            if (!valid) { // 유효한 쌍이 없으면
                sb.append("Goldbach's conjecture is wrong.").append('\n');
            }
        }

        System.out.print(sb);
    }
}

