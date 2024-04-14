package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    void DropDown() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        // Cách 1:
//        select.selectByVisibleText("Option 2");
        // Cách 2:
//        select.selectByValue("2");
        // Cách 3:
        select.selectByIndex(2);

//        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[text()='Option 2']")).isSelected());
//        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='2']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[3]")).isSelected());


    }
}
