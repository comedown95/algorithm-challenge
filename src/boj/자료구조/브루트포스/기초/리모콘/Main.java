package boj.자료구조.브루트포스.기초.리모콘;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] broken = new boolean[10];
        for (int i = 0; i < M; i++) {
            int b = sc.nextInt();
            broken[b] = true;
        }

        // 최소 버튼 횟수 계산
        int minPress = Math.abs(N - 100); // + 또는 -만 사용하는 경우

        // 모든 채널을 시도 (0부터 999999까지)
        for (int i = 0; i <= 999999; i++) {
            String channel = String.valueOf(i);
            if (canPress(channel, broken)) {
                int press = channel.length() + Math.abs(N - i);
                minPress = Math.min(minPress, press);
            }
        }

        System.out.println(minPress);
        sc.close();
    }

    // 해당 채널을 고장난 버튼 없이 누를 수 있는지 확인
    private static boolean canPress(String channel, boolean[] broken) {
        for (char c : channel.toCharArray()) {
            if (broken[c - '0']) {
                return false;
            }
        }
        return true;
    }
}