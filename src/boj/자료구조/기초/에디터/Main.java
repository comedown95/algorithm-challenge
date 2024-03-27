package boj.자료구조.기초.에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * [백준 온라인 저지] 1406 - 에디터
 * https://www.acmicpc.net/problem/1406
 * */
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
                case 'L' -> { if(iterator.hasPrevious()) iterator.previous();}
                case 'D' -> { if(iterator.hasNext()) iterator.next(); }
                case 'B' -> { if (iterator.hasPrevious()) { iterator.previous(); iterator.remove(); }}
                case 'P' -> iterator.add(command.charAt(2)); // 명령어에서 추가할 문자를 추출하여 추가
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : list) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}