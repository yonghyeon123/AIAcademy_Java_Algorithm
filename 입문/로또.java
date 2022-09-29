package 입문;
/*
문제출처: https://ssnack655.tistory.com/31
 
 
1. 서로 겹치지 않는 숫자 6개를 생성
2. 각 숫자는 1 ~ 45 범위 내의 숫자
3. 매번 실행 시 다른 숫자 출력
4. 오름차순 정렬
-> 랜덤수 : Math 사용
 
결과)
**********************************
로또 번호
**********************************
2 11 25 27 35 38
**********************************
 */

import java.util.*;
public class 로또 {
    public static void main(String[] args) {
        로또 solution = new 로또();
        System.out.println(solution.solution());
    }

    public String solution(){
        String result = "";
        int[] arr = new int[6];

        Random random = new Random();
        for(int i = 0; i < 6; i++){
            int number = random.nextInt(10) + 1;

            //로또번호 중복체크
            boolean check = false; //false가 중복되지 않은 값
            for(int j = 0; j < 6; j++){
                if(arr[j] == number)
                    check = true;
            }
            if(!check)
                arr[i] = number; //중복되지 않았으니 배열에 담기
            else
                i--; //중복됐으면 다시 돌아가 뽑기
        }

        for(int i = 0; i < arr.length; i++){
            result += arr[i] + "\t";
        }

        String title = " ### 로또 생성기 ### \n";
        String answer = String.format(
        "**********************************************\n"
        +"로또 번호\n"
        +"**********************************************\n"
        +"%s\n"
        +"**********************************************", 
        result);
        return title + answer;
    }
}
