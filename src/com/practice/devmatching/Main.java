package com.practice.devmatching;

public class Main {
    public static void main(String[] args) {

        /**
         * 로또 최고 순위 최저 순위 구하기
         * win_nums 배열 중복체크
         * 배열을 끝까지 돌면서 몇개나 맞는 숫자가 있는지 카운트 하기
         */

        int[] picNum = {44, 1, 0, 0, 31, 25};
        int[] lottoNum = {31, 10, 45, 1, 6, 19};
        int[] lotto_result = LottoPrize.solution(picNum, lottoNum);
        for(int i : lotto_result) System.out.println("lotto_result : " + i);

    }
}
