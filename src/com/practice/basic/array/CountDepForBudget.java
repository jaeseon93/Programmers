package com.practice.basic.array;

import java.util.Arrays;

public class CountDepForBudget {
    /**
     *  매개변수 )
     *  int [] : 부서별 신청한 금액
     *  budget : 예산
     *
     *  result : 총 몇개의 부서가 지원을 받을 수 있는지
     *
     */

    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        // 배열 정렬
        Arrays.sort(d);

        for(int i=0; i<d.length; i++) {
            // 반복될수록 더하는 예산과 그다음 더할 예산이 budget을 넘기지 않거나 같다면
            if(sum+d[i] <= budget) {
                sum += d[i];
                answer ++;
            }
        }
        return answer;
    }

}
