package com.practice.basic.array;

public class SumArrays {

    /**
     *  행렬의 덧셈
     *  두 행렬의 같은 행, 같은열의 값을 서로 더한 값 반환
     *  -> 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환
     *  ex)  arr1	            arr2	        return
     *      [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
     */

    public int[][] solution(int[][] arr1, int[][] arr2) {
        System.out.println("arr1:" + arr1.length);
        System.out.println("arr[0]:" + arr1[0].length);
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i< arr1.length; i++) {
            for(int j=0; i< arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }


}
