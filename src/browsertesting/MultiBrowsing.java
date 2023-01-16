package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {

    static String browser = "Chrome";
    static String baseURL = "https://demo.nopcommerce.com/";

    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe");
            driver= new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else{
            System.out.println("not valid browser");
        }
        driver.get(baseURL); //method to invoke url
        driver.manage().window().maximize();  //maximise windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //timeout session
        String title = driver.getTitle();  //starting title
        System.out.println("Title of the page  : " + title);   //printing title in console
        String url = driver.getCurrentUrl();    //Predefined method
        System.out.println("current URL :"+url);  //getting url
        String source=driver.getPageSource();    //storing source
        System.out.println("page source :"+source);   //printing source in console
        driver.findElement(By.className("ico-login")).click();   //clicking on login button
        WebElement emailIdField = driver.findElement(By.id("Email"));    //storing emaifield
        emailIdField .sendKeys("parvinderm767@gmail.com");  //sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password"));   //storing password field
        passwordField.sendKeys("Jignesh89@");    //sendkeys to password field
        driver.close();   //closing browser
    }
}
