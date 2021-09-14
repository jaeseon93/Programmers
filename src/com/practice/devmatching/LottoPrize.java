package com.practice.devmatching;

public class LottoPrize {
    public static int[] solution(int[] lottos, int[] win_nums) {

        /**
         * 로또 최고 순위 최저 순위 구하기
         * lottos = 내가 고른숫
         * win_nums = 당첨번호
         *
         * win_nums 배열 중복체크하기
         * 배열을 끝까지 돌면서 몇개나 맞는 숫자가 있는지 카운트 하기
         * 카운트가 제일높은걸 배열에 첫번째 담고 , 제일 낮은걸 두번째 자리에 담기
         * 등수 : 총갯수 - 일치하는 수 = 순위
         */

        int[] answer = new int[2];
        int count = 0;
        int count2 = 0;
        int maxPrize = 0;
        int minPrize = 0;

        // 내가 고른 숫자 만큼 돌리기
        for(int i=0; i<lottos.length; i++) {
            System.out.println("내가 고른 로또 수 :"+lottos[i]);
            if(win_nums.length == lottos.length) {
                for(int j=0; j<win_nums.length; j++) {
                    System.out.println("당첨번호:" + win_nums[j]);
                    // 고른숫자와 당첨숫자가 같은게 있을때, 카운트 증가
                    if(lottos[i] == win_nums[j]) {
                        count++;
                    }
                }
            }
            // 0 일경우 , 카운트 시켜주기
            if(lottos[i] == 0) {
                count2++;
            }
        }

        // 최대값
        answer[0] = getPrize(count + count2);
        answer[1] = getPrize(count);

        /**
         * 다른 방법
         */
//        maxPrize = 7 - (count + count2) > 6 ? 6 : 7 - (count + count2);
//        minPrize = 7 - count > 6 ? 6 : 7 - count;
//        answer = new int[] {maxPrize, minPrize};

        return answer;
    }

    public static int getPrize(int count) {
        int prize = 0;
        switch (count) {
            case 6 : prize = 1;
                break;
            case 5 : prize = 2;
                break;
            case 4 : prize = 3;
                break;
            case 3 : prize = 4;
                break;
            case 2 : prize = 5;
                break;
            default: prize = 6;
                break;
        }
        return prize;
    }
}
