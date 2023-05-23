package com.spring.core.chap03;

public class KoreanRestaurant implements Restaurant {
    private Chef chef;
    private Course course;

    public KoreanRestaurant(){
        this.chef = new KoreanChef();
        this.course = new KoreanCourse();
    }

    @Override
    public void order() {
        System.out.println("한국 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
