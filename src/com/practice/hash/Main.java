package com.practice.hash;

public class Main {
    public static void main(String[] args) {

        /**
         * 1. 완주하지 못한 완주자
         * participants 의 참가자중, done 한 사람들을 뺀 나머지 사람, 즉 완주하지 못한 사람을 출력하기
         */
        String[] participants = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] done = {"josipa", "filipa", "marina", "nikola"};
        String marathon_result = Lev1_Marathon.solution(participants, done);
        System.out.println("marathon_result : " + marathon_result);



        /**
         * Level2 : 전화번호 목록
         * ex) ["119", "976", "825" ] 일경우 -> true
         * [ "12", "123", "456" ] 일경우 -> false
         */
        String[] phonebook = {"123","456","789"};
        boolean phonebook_result = Lev1_PhoneBook.solution(phonebook);
        System.out.println("phonebook_result :" + phonebook_result);



    }
}
