package com.maroti.serviceImpl;

import com.maroti.color.Color;
import com.maroti.color.ColorImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/*
 *
 * @Author Maroti Pawar
 * */
public class ColorTest {

    private Color color;

    @BeforeTest
    public void setUp() {
        color = new ColorImpl();
    }

    @Test
    public void testGetColorHex() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
        WebElement button=driver.findElement(By.tagName("h5"));
        String color1=button.getCssValue("color");
        System.out.println("ColorName :"+Color.name(color1));
    }

    @Test
    public void testGetColorName() {
    }
}