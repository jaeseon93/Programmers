package com.practice.basic.array;

import java.util.Arrays;
import java.util.Comparator;

public class StringsArray {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char str1 = o1.charAt(n);
                char str2 = o2.charAt(n);

                if(str1 > str2) {
                    System.out.println(str1 + "이" + str2 + "보다 더 크다.");
                    return 1;
                }
                else if (str1 < str2) {
                    System.out.println(str2 + "이" + str1 + "보다 더 크다.");
                    return -1;
                }
                else
                    System.out.println("둘이 같다");
                return 0;
            }
        };

        // 알파벳순으로 정렬
        Arrays.sort(strings);
        // 원하는 조건대로 정렬하고 싶을때
        Arrays.sort(strings, comp);
        for(int i=0; i<strings.length; i++) {
            answer[i] = strings[i];
        }
        return answer;
    }
}
