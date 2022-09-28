package 입문;

import java.util.Scanner;

/*
비만도 측정 문제

질문

개요
1명의 학생정보(이름, 키, 몸무게) 를 입력받아서 신체질량지수와 비만정도를 판단하는 문제이다.

세부 요구 사항은 다음과 같다.
학생 정보는 구조체로 정의한다.
신체질량지수(BMI) 구하는 식은 다음과 같다.

(BMI = 체중kg / 키m^2)
신체질량지수(BMI)는 소수 첫째자리에서 반올림한다.
비만 정도 판별하는 조건은 다음과 같다.

비만(High) : BMI > 30
과체중(Over) : 25 ≦ BMI ≦ 30
정상(Normal) : 19 ≦ BMI ≦ 24
저체중(Low) : BMI < 19
학생 정보 입력 예는 다음과 같다.
01 홍길동 120.8 30.9


출력 예는 다음과 같다.

 

학생 정보 출력

******************************************************************
번호 이름 키(cm) 체중(kg) BMI 비만정도
******************************************************************
01 홍길동 120.8 30.9 21 정상
******************************************************************
 */

public class 비만도측정{
    public static void main(String[] args) {
        비만도측정 solution = new 비만도측정();
        System.out.println(solution.solution());
    }

    public String solution(){
        String title = " ### 비만도 측정 ### \n";
        String name = "";
        float height = 0.0f;
        float weight = 0.0f;
        int bmi = 0;
        String degree = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        name = scanner.next();
        System.out.println("키 입력 : ");
        height = scanner.nextFloat();
        System.out.println("몸무게 입력 : ");
        weight = scanner.nextFloat();
        
        float m = height / 100;
        bmi = (int) (weight / (m * m));

        if(bmi > 30) { degree = "비만"; }
        else if(bmi >= 25) {degree = "과체중"; }
        else if(bmi >= 19) {degree = "정상"; }
        else {degree = "저체중"; }

        String answer = String.format(
            "******************************************************************\n"
            +"이름 키(cm) 체중(kg) BMI 비만정도\n"
            +"******************************************************************\n"
            +"%s %.1f %.1f %d %s\n"
            +"******************************************************************\n"
            ,
            name, height, weight, bmi, degree);
        
        scanner.close();
        return title + answer;
    }
}