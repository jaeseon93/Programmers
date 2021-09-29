package com.practice.test;

public class Main {
    public static void main(String[] args) {

        NumSum arr = new NumSum();
        int arraySum = arr.solution(123);
        System.out.println("ArraySum :"+ arraySum);

        ReadNumberToEng solution6 = new ReadNumberToEng();
        String numberToEng = solution6.solution(149);
        System.out.println("numberToEng :" + numberToEng);

        // 콜라츠 추측
        ResultMinusOne minusOne = new ResultMinusOne();
        int solution = minusOne.solution(1);
        System.out.println("solution :" + solution);
    }
}
