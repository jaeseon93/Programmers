package com.practice.basic;

public class GCDLCM {

    /**
     * 최대공약수와 최소공배수 구하기
     * 최소 공배수 = 두 자연수의 곱 / 최대 공약수
     * 최대 공약수 : 약수중에서도 서로 공통이되는 약수가 공약수 , 그 공약수안에서 가장 큰수를 최대 공약수
     *
     */

    public int[] solution(int n, int m) {
        int[] answer = {};

        // 최대 공약수 구하기
        int min;
        int gcd = 0;
        // 두 수중에 작은 수 먼저 구하기
        if(n<=m) {
            min = n;
        } else {
            min = m;
        }

        // i를 작은수까지 반복
        for(int i=1; i<=min; i++) {
            // 각각 i로 나누어 나머지가 0 인 값을 구분
            if(n%i==0 && m%i==0) {
                // 마지막 값이 최대 공약수
                gcd = i;
            }
        }
        System.out.println("최대 공약수 :" + gcd);

        // 최소 공배수 구하기
        int lcm;
        lcm = n * m / gcd;
        System.out.println("최대 공배수 :" + lcm);

        answer = new int[] {gcd, lcm};

        return answer;
    }

}
