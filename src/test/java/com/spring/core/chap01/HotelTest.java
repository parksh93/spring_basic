package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

public class HotelTest {

    //테스트 영역에서는  @Test가 붙은 메서드를 하나하나 실행하거나
    //클레스명 왼쪽의 버튼을 이용해 한 번씩 전체적으로 실핼할 수 있음.
    @Test
    public void HotelTest(){
        Hotel hotel = new Hotel();
        hotel.inform();
    }
}
