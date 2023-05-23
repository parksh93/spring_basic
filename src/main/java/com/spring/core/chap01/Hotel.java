package com.spring.core.chap01;
/*
    스프링 의존성 주입이 사용되지 않아서 생기는 문제
    호텔 클래스 내부에서 현재 직접 객체를 생성해주는 코드의 경우
    나중에 의존객체를 변경해야 할 때 직접 호텔클래스 내부를 수정해야함
    이 경우 OCP를 위배하게 됨
    심지어 Hotel에서 셰프를 변경한다면, 레스토랑 내부에서 변셩해야 하므로
    2군데를 수정해야 함.
*/
public class Hotel {
    private Restaurant restaurant;

    private Chef chef;

    public Hotel(){
        this.restaurant = new FusionRestaurant();
        this.chef = new ChineseChef();
    }

    public void inform(){
        String chefName = chef.getClass().getSimpleName();
        String restaurantName = restaurant.getClass().getSimpleName();
        System.out.println("우리 호텔의 레스토랑은 "+ restaurantName + "이며, 수석셰프는 " + chefName + "입니다.");

        restaurant.order();
    }
}
