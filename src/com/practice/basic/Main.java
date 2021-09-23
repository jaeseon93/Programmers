package com.practice.basic;

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
//        Scanner sc = new Scanner(System.in);
//
//        String ascii = "*";
//        int scan = sc.nextInt();
//        for(int i=0; i<scan; i++ ) {
//            for(int j=0; j <= i; j++) {
//                System.out.print(ascii);
////                ascii = ascii + ascii;
//            }
//            System.out.println();
//        }


        /**
         * Scanner에 받은 숫자 두개를 더하기
         * sum 1+2
         */

//        Scanner sca = new Scanner(System.in);
//
//        int a = sca.nextInt();
//        int b = sca.nextInt();
//        int result = a+b;
//        System.out.println("result: "+ result);

        /**
         *  별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
         *  ex) 5 3
         *  *****
         *  *****
         *  *****
         */

        Scanner sc2 = new Scanner(System.in);
        int width = sc2.nextInt();
        int height = sc2.nextInt();

        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
