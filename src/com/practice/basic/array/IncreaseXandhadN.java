package com.practice.basic.array;

public class IncreaseXandhadN {

    /**
     *  x부터 시작해서 x만큼 증가하는 n자리의 배열 출력하기
     *  ex) x =2 ,n = 5
     *  result = [2,4,6,8,10]
     */

    public long[] solution(int x, int n) {
        // n의 자리만큼 리스트 생성
        long[] answer = new long[n];
        long cal = 0;
        // x 수부터 시작
        answer[0] = x;

        for(int i=0; i<n; i++) {
            answer[i] = x * (i+1);
        }
        return answer;
    }

}

