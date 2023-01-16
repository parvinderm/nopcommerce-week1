package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String  baseurl ="https://demo.nopcommerce.com/";  //storing base url
        System.setProperty("webdriver .edgedriver.driver","src/drivers/msedgedriver.exe");  //setting webdriver
        WebDriver driver = new EdgeDriver();  //Creating object of edge webdriver
        driver.get(baseurl);   //method to invoke url
        driver.manage().window().maximize();  //maximise windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));  //timeout session
        String title = driver.getTitle();
        System.out.println("Title of the page :"+title);
        String url = driver.getCurrentUrl();
        System.out.println("current URL :"+ url);  //getting url
        String source =driver.getPageSource();   //storing source
        System.out.println("page source :"+source);  //printing source in console
        driver .findElement(By.className("ico-login")).click(); //clicking on login button
        WebElement emailIdField = driver.findElement(By.id("Email"));  //storing emailid
        emailIdField .sendKeys("parvinderm767@gmail.com");  //sending keys to email id field
        WebElement passwordField = driver.findElement((By.id("Password")));
        passwordField .sendKeys("Jignesh89@");   //sendKeys to password field
        driver.close();   //closing browser


    }
}
