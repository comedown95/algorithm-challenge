package boj.배열.Strfry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            char[] firstWord = st.nextToken().toCharArray();
            char[] secondWord = st.nextToken().toCharArray();
            int fristScore = 0;
            int secondScore = 0;

            if (firstWord.length != secondWord.length) {
                sb.append("Impossible").append("\n");
                continue;
            }

            for(int j = 0; j < firstWord.length; j++) {
                fristScore += firstWord[j] - 'a';
                secondScore += secondWord[j] - 'a';
            }

            sb.append(fristScore == secondScore ?"Possible" :"Impossible").append("\n");
        }

        System.out.println(sb.toString());
    }
}