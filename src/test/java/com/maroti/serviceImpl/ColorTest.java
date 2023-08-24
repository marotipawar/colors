package com.maroti.serviceImpl;

import com.maroti.color.ColorImpl;
import com.maroti.color.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
*
* @Author Maroti Pawar
* */
public class ColorTest {

    private Color color;
    @BeforeTest
    public void setUp() {
    color= new ColorImpl();
    }

    @Test
    public void testGetColorHex() {
        Color.Name colorName =color.getColorName("rgba(128,0,128)");
        System.out.println(colorName);
        Assert.assertEquals(colorName, Color.Name.PURPLE);
    }

    @Test
    public void testGetColorName() {
    }
}