package com.practice.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class EacnIndexValCompare {

    public static List<Integer> compareTriplets(List<Integer> list1, List<Integer> list2) {
        // Write your code here
        // a ,b 의 각 자리끼리 서로 더했을 때, 누가 더 큰지 알고리즘 짜기
        // 큰 문자에게 1 포인트가 추가
        // 만약 두개가 같다면 아무도 포인트를 가져갈 수 없음
        // 리턴할 때 , array[a score , b score] 로 리턴하기
        List<Integer> result = new ArrayList<>();
        int aScore = 0;
        int bScore = 0;

        for(int n=0; n<list1.size(); n++) {
            for(int m=0; m<list2.size(); m++) {
                // 두 리스트의 인덱스가 일치한다면
                if(n == m) {
                    // 비교해라
                    if(list1.get(n) > list2.get(m)) {
                        aScore += 1;
                    } else if (list1.get(n) < list2.get(m)) {
                        bScore += 1;
                    }
                }

            }
        }
        result.add(0,aScore);
        result.add(1,bScore);
        return result;
    }
}
