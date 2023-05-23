package com.spring.core.chap03;

public class JapaneseRestaurant implements Restaurant {
    private Chef chef;
    private Course course;
    public JapaneseRestaurant(){
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }

    @Override
    public void order() {
        System.out.println("일식 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
