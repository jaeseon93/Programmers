package com.practice.basic.array;

public class Main {
    public static void main(String[] args) {
        ArraySum arr = new ArraySum();
        int arraySum = arr.solution(123);
        System.out.println("ArraySum :"+ arraySum);

        CheckLengthNum arr2 = new CheckLengthNum();
        boolean checkLength = arr2.solution(new int[]{4,1,3,2});
        System.out.println("checkLength :"+ checkLength);

        IncreaseXandhadN arr3 = new IncreaseXandhadN();
        long[] increasexn = arr3.solution(2, 5);
        System.out.println("increasexn:" + increasexn);

    }
}
