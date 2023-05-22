package com.spring.core.chap01;

public class FusionRestaurant implements Restaurant{
    private Chef chef;
    private Course course;

    public FusionRestaurant(){
        chef = new ChineseChef();
        course = new ChineseCourse();
    }
    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
