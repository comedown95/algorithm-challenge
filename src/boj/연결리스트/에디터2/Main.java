package boj.연결리스트.에디터2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // LinkedList 사용하여 좌, 우 커서 이동 및 추가, 삭제에 효율적으로 대응
        LinkedList<Character> list = new LinkedList<>();
        for(char ch : br.readLine().toCharArray()) {
            list.add(ch);
        }

        // ListIterator를 사용하여 커서 위치 관리
        ListIterator<Character> iterator = list.listIterator();
        while(iterator.hasNext()) {
            iterator.next(); // 커서를 문자열의 맨 끝으로 이동
        }

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            String command = br.readLine();
            switch(command.charAt(0)) {
                case 'L':
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;
                case 'D':
                    if(iterator.hasNext()) {
                        iterator.next();
                    }
                    break;
                case 'B':
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case 'P':
                    iterator.add(command.charAt(2)); // 명령어에서 추가할 문자를 추출하여 추가
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : list) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}