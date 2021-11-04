package com.practice.basic.array;

public class DotProduct {
    /**
     * a,b의 배열의 값끼리 곱하여 더하기
     */
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

}
