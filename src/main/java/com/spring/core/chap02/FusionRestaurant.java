package com.spring.core.chap02;

public class FusionRestaurant implements Restaurant {
    private Chef chef;
    private Course course;

    public FusionRestaurant(Chef chef, Course course){
        this.chef = chef;
        this.course = course;
    }
    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
