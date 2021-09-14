package com.practice.hash;

import java.util.Arrays;

public class Lev1_Marathon {
    /**
     * Level1 : 완주하지못한 완주자
     *  a b c 라는 참가자가 있을 때, a , b 는 통과 c는 완주못함
     *
     */

    public static String solution(String[] participant, String[] completion) {
        // 초기화
        String answer = "";

        // leo만 뽑아내기 위해 오름차순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        while (i<completion.length) {
            // 만약에 참가자들 배열과 완료한사람의 배열을 각각 한자리씩 비교할때, 맞지 않는 사람이 나온다면
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            } else {
                i++;
            }
        }

        // 만약 맞는게 없다면
        if(answer.equals("")) {
            // -1 하는 이유는 배열의 자리수때문
            answer = participant[participant.length-1];
        }

        return answer;
    }
}
