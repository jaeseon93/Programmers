package com.practice.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  최대공약수 최소공배수 구하기
         */
        GCDLCM gcdlcm = new GCDLCM();
        gcdlcm.solution(2,5);


        /**
         *  1에서 100까지 더하기
         */
        int sum = 0;

        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("result:" + sum);

        /**
         *  구구단 출력
         */
        int cal = 0;
        for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++ ) {
                cal = i*j;
                System.out.println(i + "x" + j + "=" + cal);
            }
        }




        // 스캐너를 이용한 문제
        Scanner sc = new Scanner(System.in);

        /**
         *  Scanner에 입력받은 숫자 홀수/짝수 출력
         */
        int scanner = sc.nextInt();
        if(scanner % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }


        /**
         *  Scanner 에 입력받은 숫자만큼 별표라인 찍기
         *  ex ) 3
         *  *
         *  **
         *  ***
         */

        String ascii = "*";
        int scan = sc.nextInt();
        for(int i=0; i<scan; i++ ) {
            for(int j=0; j <= i; j++) {
                System.out.print(ascii);
            }
            System.out.println();
        }


        /**
         * Scanner에 받은 숫자 두개를 더하기
         * sum 1+2
         */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("result: "+ result);


        /**
         *  별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
         *  ex) 5 3
         *  *****
         *  *****
         *  *****
         */

        int width = sc.nextInt();
        int height = sc.nextInt();

        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
