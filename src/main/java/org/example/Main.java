package org.example;

import org.example.util.StringProvider;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String content = StringProvider.getString();
        Scanner scanner = new Scanner(System.in);

        String[] lines = content.split("\n");

        System.out.println("사용할 기능을 입력하세요.");
        System.out.println("1 순차 질문 2 랜덤 질문 : ");
        int button = Integer.parseInt(scanner.nextLine());
        cls();

        int[] order;
        if (button == 2) order = generateRandomArray(lines.length);
        else order = IntStream.range(0, lines.length).toArray();

        for (int item : order) {
            System.out.println(lines[item]);
            System.out.println("계속하려면 엔터를 눌러주세요.");
            scanner.nextLine();
            cls();
        }
    }

    public static void cls() {
        for (int i = 0; i < 25; i++) System.out.println();
    }

    public static int[] generateRandomArray(int n) {
        // 배열 생성
        int[] arr = new int[n];

        // 배열에 0부터 n - 1까지의 숫자 채우기
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // 배열 섞기
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int randomIndexToSwap = rand.nextInt(n);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}