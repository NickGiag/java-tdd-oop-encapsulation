package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void testChangeColour(){
        Car car = new Car();
        Assertions.assertEquals(car.getColour(),"blue");
        car.setColour("green");
        Assertions.assertEquals(car.getColour(),"green");
    }
    @Test
    void testChangeBattaryType(){
        Car car = new Car();
        Assertions.assertEquals(car.getBattaryType(),"lithium");
        car.setBattaryType("rechargeable");
        Assertions.assertEquals(car.getBattaryType(),"rechargeable");

    }
    @Test
    void testPercentageRemaining(){
        Car car = new Car();
        Assertions.assertEquals(car.getPercentageRemaining(),100);
        car.setPercentageRemaining(84);
        Assertions.assertEquals(car.getPercentageRemaining(),84);

    }
    @Test
    void testChangeIsAdvanced(){
        Car car = new Car();
        Assertions.assertFalse(car.isAdvanced());
        car.setAdvanced(true);
        Assertions.assertTrue(car.isAdvanced());


    }

}
