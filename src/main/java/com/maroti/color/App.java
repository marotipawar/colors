package com.maroti.color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class App {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.color-hex.com/color-names.html");
        List<WebElement> nameList=driver.findElements(By.xpath("//tbody/tr/td[1]"));
        List<WebElement> codeList=driver.findElements(By.xpath("//tbody/tr/td[3]"));
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<nameList.size(); i++){
            String color=nameList.get(i).getText().replaceAll(" ", "").trim().toUpperCase()+"(\""+codeList.get(i).getText().trim().toUpperCase()+"\"),";
            System.out.println(color);
        }


    }
}
