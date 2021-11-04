package com.practice.basic.array;

public class SumNegativePositive {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++) {
            if(!signs[i]) {
                // 음수로 만들어 더하기
                answer += absolutes[i] * -1;
            } else {
                answer += absolutes[i];
            }
        }
        return answer;
    }
}
