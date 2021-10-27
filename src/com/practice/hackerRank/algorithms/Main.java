package com.practice.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         *  a ,b 의 각 자리끼리 서로 더했을 때, 누가 더 큰지 알고리즘 짜기
         *  1. 큰 문자에게 1 포인트 추가
         *  2. 만약 두개가 같다면 아무도 포인트를 가져갈 수 없음
         *  3. 리턴할 때 , array[a score , b score] 로 리턴하기
         */
        // 임의로 값 추가
        List<Integer> a = new ArrayList<>();
        a.add(0,3);
        a.add(1,2);
        a.add(2,22);
        List<Integer> b = new ArrayList<>();
        b.add(0,3);
        b.add(1,6);
        b.add(2,10);
        List<Integer> result = EacnIndexValCompare.compareTriplets(a, b);


    }
}
