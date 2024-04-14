package fptplay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FptPlay {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fptplay.vn/");

        driver.findElement(By.id("dang-nhap")).click();
        driver.findElement(By.id("phone-input")).sendKeys("0974303989");
        Thread.sleep(1000);
        driver.findElement(By.id("password-input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='btn notice-btn btn-none btn-block']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("otp-input-focus")).sendKeys("9");
        Thread.sleep(1000);
        driver.findElement(By.id("otp-input-focus")).sendKeys("9");
        Thread.sleep(1000);
        driver.findElement(By.id("otp-input-focus")).sendKeys("9");
        Thread.sleep(1000);
        driver.findElement(By.id("otp-input-focus")).sendKeys("9");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='btn btn-secondary active']")).click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://fptplay.vn/");
        driver.quit();
    }
}
