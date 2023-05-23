package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fr")
public class FusionRestaurant implements Restaurant {
  // @Autowired   // 컨테이너에 든 자료중 Chef에 대입할 수 있는 걸 자동으로 집어넣어줌
    private Chef chef;
  // @Autowired
    private Course course;

    // 세터주입은 세터 위에 @Autowired 어노테이션은 붙여 설정
//    @Autowired
    public void setChef( Chef chef){
        this.chef = chef;
    }

//    @Autowired
//    public void setCourse(@Qualifier("jco") Course course){
    public void setCourse( Course course){
        this.course = course;
    }
    //setter에서 @Qualifier사용하는 경우 default 생성자가 오버로딩 되어있어야 한다
    //public FusionRestaurant(){}

    @Autowired
    //@Qualifier를 파라미터 왼쪽에 붙이면, 지정된 이름의 객체를 주입할 수 있다.
    public FusionRestaurant(@Qualifier("cc") Chef chef, @Qualifier("cco") Course course){
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
