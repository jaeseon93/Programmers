package com.practice.test;

public class NumSum {
    public int solution(int n) {
        int answer = 0;

        /**
         *  방법 1
         */
        // 받은 입력값 int 를 String으로 변환
//        String toString = Integer.toString(n);
//        String[] strArr = toString.split("");

//        for (String s: strArr) {
//            // 숫자 자릿수를 더하기
//            int i = Integer.parseInt(s);
//            answer += i;
//        }

        /**
         *  방법 2
         */

        int mod = 0;
        int sum = 0;
        while(n!=0) {
            // int 자릿수 나누기
            mod = n%10;
            n = n/10;
            sum += mod;
        }
        answer = sum;
//                return answer;


        return answer;
    }
}
