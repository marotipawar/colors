package com.maroti.imgColor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement imageElement = driver.findElement(By.xpath("//img[@alt='Facebook']"));
        File screenshotFile = imageElement.getScreenshotAs(OutputType.FILE);
        BufferedImage screenshotImage = ImageIO.read(screenshotFile);
        int pixelColor = screenshotImage.getRGB(50, 50);
       /* Color color = new Color(pixelColor);
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        Color c = new Color(red, green, blue);
        String colorHex = c.getColorHexShorthand();
        String colorName = getColorName(colorHex);
        System.out.println("Color Name is : " + colorName);*/
    }

    public static String getColorName(String color) throws InterruptedException {
        /*ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--headless");
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://colors.artyclick.com/color-name-finder");
        driver.findElement(By.xpath("//input[@id='it_my_col']")).sendKeys(color, Keys.ENTER);
        Thread.sleep(2000);
        return driver.findElement(By.id("nac_adv_col_hue_text")).getText();*/
return null;
    }

    }

