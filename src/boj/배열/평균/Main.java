package boj.배열.평균;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] SubjectScores = new int[N];
        long maxScore = 0;
        long sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            SubjectScores[i] = Integer.parseInt(st.nextToken());
            maxScore = Math.max(maxScore, SubjectScores[i]);
            sum += SubjectScores[i];
        }

        bw.write(Double.toString(sum * 100.0 / maxScore/ N));
        bw.flush();
        bw.close();
        br.close();
    }
}
