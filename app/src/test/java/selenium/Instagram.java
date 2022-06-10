package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {

    public WebDriver driver;

    public void launchBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Exception handled");
        }
    }

    public void loginToInsta() {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("impratikbhowmik@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Patrick@12oct2020");
        WebElement loginbtn = driver.findElement(By.xpath(
                "//body/div[@id='react-root']/section[contains(@class,'_9eogI E3X2T')]/main[contains(@role,'main')]/article[contains(@class,'_4_yKc')]/div[contains(@class,'')]/div[contains(@class,'')]/div[contains(@class,'EPjEi')]/form[@id='loginForm']/div[contains(@class,'')]/div[3]"));
        loginbtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Exception handled");
        }
        WebElement notnow = driver.findElement(By.xpath("//button[normalize-space()='Not Now']"));
        notnow.click();
        WebElement secondnotnow = driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']"));
        secondnotnow.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            System.out.println("Exception handled");
        }
    }
    public void likeApost(){
        WebElement post = driver.findElement(By.xpath("//div[1]//div[1]//article[1]//div[1]//div[3]//div[1]//div[1]//section[1]//span[1]//button[1]//div[2]//span[1]//*[name()='svg']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", post);
        post.click();
    }
}
