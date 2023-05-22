package com.spring.core.chap02.config;


import com.spring.core.chap02.*;

// 현재까지 최상위 객체인 호텔을 운영하기 위해 필요한
// 모든 객체들을 관리하고 주입하는 클래스
// Bean Factory(빈 공장) / Bean이 자바 인스턴스를 부르는 별칭
public class HotelManager {
    public Chef chef(){
        return new JapaneseChef();
    }

    public Course course(){
        return new JapaneseCourse();
    }

    public Restaurant restaurant(){
        return new FusionRestaurant(chef(),course());
    }

    public Hotel hotel(){
        return new Hotel(restaurant(),chef());
    }
}
