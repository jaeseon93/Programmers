package com.practice.hash;

import java.util.HashMap;

public class Lev1_PhoneBook {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,String> map = new HashMap<String,String>();

        // map 사이즈만큼 돌려서 키에 받은 숫자 넣기
        for(int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i],"");
        }

        for(String s : phone_book) {
            for(int i=0; i<s.length(); i++) {
                if(map.containsKey(s.substring(0,i))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
