package com.practice.basic.array;

public class CheckLengthNum {
    public boolean solution(int[] arr) {

        //배열의 길이가 곧 1-배열의길이까지 들어가있어야함
        // 배열 [4,1,3,2] == true
        // 배열 [4,1,3] == false -> 2가 들어가있어야하는데 3이있기 때문에

        // 배열의 길이만큼 만들기
        int[] int_value = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            // 배열의 길이보다 크거나
            if(arr[i] > arr.length || int_value[arr[i] -1 ] != 0 ) {
                return false;
            }
        }

        return true;
    }
}
