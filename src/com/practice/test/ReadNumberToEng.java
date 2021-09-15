package com.practice.test;

public class ReadNumberToEng {

    public String solution(int num) {

        /**
         *  숫자를 받아서 1 -> one , 2 -> two 로 변환하기
         */

        // 숫자의 각 자리수를 읽기
        // 0 -9 까지
        String answer = "";

        /**
         * 숫자 자릿수로 각각 뭘 해줘야할때, String 으로 변환해서 해보기
         */
        String toString = Integer.toString(num);
        // 하나씩 자르기위해 "" 으로 자르기
        String[] strArr = toString.split("");

        for (String s: strArr) {
            int i = Integer.parseInt(s);
            String s1 = readNum(i);
            answer += s1;
        }

        return answer;
    }

    public String readNum(int num) {
        String result = "";
        switch (num) {
            case 1 : result = "one"; break;
            case 2 : result =  "two";  break;
            case 3 : result =  "three";  break;
            case 4 : result =  "four";  break;
            case 5 : result =  "five";  break;
            case 6 : result =  "six";  break;
            case 7 : result =  "seven";  break;
            case 8 : result =  "eight";  break;
            case 9 : result =  "nine";  break;
            case 0 : result =  "zero";  break;
        }
        return result;
    }
}
