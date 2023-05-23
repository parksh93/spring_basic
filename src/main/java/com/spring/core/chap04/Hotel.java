package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //별칭은 주지 않으면 소문자로 구성된 클래스 이름으로 지정된다
public class Hotel {
    // 제어의 역전(IOC) : 객체 생성의 제어권을 Hotel이 아닌 외부로 넘긴다
    // 의존성 주입(DI) : Hotel 생성시 외부에서 이미 생성된 객체를 주입하는 개념

//    @Autowired
    private Restaurant restaurant;

//    @Autowired
    private Chef chef;

    @Autowired  // 생성자 주입은 생성자 상단에  @Autowired 어노테이션을 붙인다.
    public Hotel(Restaurant restaurant,@Qualifier("jc") Chef chef){
        this.restaurant = restaurant;
        this.chef = chef;
    }

    public void inform(){
        String chefName = chef.getClass().getSimpleName();
        String restaurantName = restaurant.getClass().getSimpleName();
        System.out.println("우리 호텔의 레스토랑은 "+ restaurantName + "이며, 수석셰프는 " + chefName + "입니다.");

        restaurant.order();
    }
}
