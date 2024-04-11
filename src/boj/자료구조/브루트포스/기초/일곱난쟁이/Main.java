package boj.자료구조.브루트포스.기초.일곱난쟁이;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = -100;

        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            sum += heights[i];
        }

        Arrays.sort(heights);
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if ((heights[i] + heights[j]) == sum) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(heights[k]);
                    }
                    return;
                }
            }
        }

        sc.close();
    }
}
