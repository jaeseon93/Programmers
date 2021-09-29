package com.practice.test;

public class ResultMinusOne {

    /**
     *  콜라츠 추측
     *  1) 입력된 수가 짝수라면 2로 나누기
     *  2) 홀수라면 3을 곱하고 1을 더하기
     *  3) 결과 값이 1이 나올때까지 반복
     *
     *  - 500번 반복해도 1이 안나오면 -1 리턴
     */

    public int solution (int num) {
        int answer = 0;

        if(num == 1) {
            return 0;
        }

        // 처음에 들어가서 홀수짝수 나누기
        long resultNum = checkNum(num);

        for(int i=1; i<=500; i++) {
            // 만약 결과값이 1이 아니라면 다시 checkNum 값에 던져야함
            if(resultNum != 1) {
                System.out.println("i :" + i + "\t" + resultNum);
                resultNum = checkNum(resultNum);
                answer = i;
            } else {
                answer = i;
                break;
            }
            // 500번 이상이라면
            if(i >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public long checkNum(long num) {
        long answer;
        // 짝수
        if(num%2==0) {
            answer = num / 2;
            // 홀수
        } else {
            answer = num * 3;
            answer = answer + 1;
        }
        return answer;
    }
}
