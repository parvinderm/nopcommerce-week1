package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/";  //Storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");   //setting webdriver
        WebDriver driver = new FirefoxDriver();   //Creating object of chrome driver
        driver .get(baseurl);   //method to invoke url
        driver.manage().window().maximize();    //maximise windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("Title of the page :"+ title);   //Printing title in console
        String url = driver.getCurrentUrl(); //Predefined method
        System.out.println("current URL :"+url);
        driver.findElement(By.className("ico-login")).click();  //clicking on login button
        WebElement emailIdField = driver .findElement(By.id("Email"));  //storing email id field
        emailIdField .sendKeys("parvinderm767@gmail.com");    //sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); //storing password field
        passwordField .sendKeys("Jignesh89@");  //sendkeys to password field
        driver.close();  //Closing browser

    }
}
