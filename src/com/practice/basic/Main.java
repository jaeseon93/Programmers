package com.practice.basic;

import com.practice.devmatching.LottoPrize;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  별표 찍기
         *  Scanner에 숫자만큼 라인 찍기
         *  *
         *  **
         *  ***
         */

        Scanner sc = new Scanner(System.in);
        String ascii = "*";
        int scan = sc.nextInt();

        for(int i=0; i<scan; i++ ) {
            for(int j=0; j <= i; j++) {
                System.out.print(ascii);
            }
            System.out.println();
        }

    }
}
