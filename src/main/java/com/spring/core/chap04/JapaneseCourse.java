package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("jco")
public class JapaneseCourse implements Course {
    public void combineMenu(){
        System.out.println("------오마카세 메뉴 구성--------");
        System.out.println("1. 일본 계란찜");
        System.out.println("2. 장어알을 얹은 초밥");
        System.out.println("3. 계절생선을 얹은 초밥");
        System.out.println("4. 숙성농어를 얹은 초밥");
        System.out.println("5. 장어구이를 얹은 초밥");
    }
}
