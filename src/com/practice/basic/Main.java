package com.practice.basic;

import com.practice.devmatching.LottoPrize;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  Scanner 에 입력받은 숫자만큼 별표라인 찍기
         *  ex ) 3
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
//                ascii = ascii + ascii;
            }
            System.out.println();
        }
    }
}
