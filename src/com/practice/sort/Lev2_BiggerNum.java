package com.practice.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Lev2_BiggerNum {
    public static String solution(int[] numbers) {
        String answer = "";

        // 받은 파라미터 numbers 배열만큼 String 배열값 변환
        String [] num_str = new String[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            num_str[i] = String.valueOf(numbers[i]);
        }

        // 받은 수 정렬
        Arrays.sort(num_str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(num_str[0].startsWith("0")) {
            answer += "0";
        }

        for( int i=0; i< num_str.length; i++) {
            answer += num_str[i];
        }

        return answer;
    }

}
