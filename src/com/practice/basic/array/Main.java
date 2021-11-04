package com.practice.basic.array;

public class Main {
    public static void main(String[] args) {

        /**
         *  2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환
         */

//        SumArrays arr = new SumArrays();
//        arr.solution(new int[][]{ {1, 2}, {2, 3} }, new int[][]{{3, 4}, {5, 6}});
//        int[][] a = new int[][]{ {1, 2}, {2, 3} };
//        int[][] b = new int[][]{ {3, 4}, {5, 6} };
//        arr.solution(a,b);


        /**
         * 배열의 길이만큼 숫자 들어있도록 하기
         */
        CheckLengthNum arr2 = new CheckLengthNum();
        boolean checkLength = arr2.solution(new int[]{4,1,3,2});
        System.out.println("checkLength :"+ checkLength);

        /**
         * x부터 시작해서 x만큼 증가하는 n자리의 배열 출력
         */
        IncreaseXandhadN arr3 = new IncreaseXandhadN();
        long[] increasexn = arr3.solution(2, 5);
        System.out.println("increasexn:" + increasexn);

        /**
         * 지원해 줄 수 있는 부서 수 출력 ( 부서별 신청한 금액 ,예산 )
         */
        CountDepForBudget arr4 = new CountDepForBudget();
        int countDep = arr4.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println("지원해 줄 수 있는 부서수 : " + countDep);
    }
}
