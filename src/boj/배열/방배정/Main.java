package boj.배열.방배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int K = Integer.parseInt(st.nextToken()); // 방 최대 인원
        int[][] students = new int[7][2];
        int answer = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken()); // 성별 [0:여자, 1:남자]
            int Y = Integer.parseInt(st.nextToken()); // 학년 [1 ~ 6 학년]
            students[Y][S]++;
        }

        for(int i = 1; i < students.length; i++) {
            int female = students[i][0];
            int male = students[i][1];
            answer += (female % K != 0) ?(female / K) + 1 :female / K; // 여학생 방 계산
            answer += (male % K != 0) ?(male / K) + 1 :male / K; // 남학생 방 계산
        }

        System.out.println(answer);
    }
}
