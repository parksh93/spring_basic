package com.spring.core.chap03;

public class Hotel {
    // 제어의 역전(IOC) : 객체 생성의 제어권을 Hotel이 아닌 외부로 넘긴다
    // 의존성 주입(DI) : Hotel 생성시 외부에서 이미 생성된 객체를 주입하는 개념

    private Restaurant restaurant;

    private Chef chef;

    public Hotel(Restaurant restaurant, Chef chef){
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
