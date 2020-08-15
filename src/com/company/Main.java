package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr [i] = scanner.nextInt();


        }
        if (n >= 2) {
            System.out.println(arr[0] + " " + arr[1]);

        }
    }
}
