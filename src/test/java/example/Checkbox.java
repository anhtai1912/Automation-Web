package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkbox {
    @Test
    void validateCheckSuccess() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        check(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")));
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected());

        check(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")));
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());

        driver.quit();
    }

    @Test
    void validateUnCheckSuccess() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        uncheck(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")));
        Assert.assertFalse(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected());

        uncheck(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")));
        Assert.assertFalse(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());

        driver.quit();
    }

    static void check(WebElement element){
        if(!element.isSelected()) element.click();
    }

    static void uncheck(WebElement element) {
        if(element.isSelected()) element.click();
    }
}

