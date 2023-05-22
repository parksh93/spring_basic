package com.spring.core.chap02;

import com.spring.core.chap02.config.HotelManager;
import org.junit.jupiter.api.Test;

public class HotelManagerTest {
    @Test
    public void diTest() {
        HotelManager hotelMan1ager = new HotelManager();

//        Hotel hotel = hotelMan1ager.hotel();
//        hotel.inform();
        hotelMan1ager.hotel().inform();
    }
}
