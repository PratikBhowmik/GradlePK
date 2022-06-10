package selenium;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
    private WebDriver driver;

    public void launchleafground(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Exception handled");
        }
        String currenturl = driver.getCurrentUrl();
        String titles = driver.getTitle();
        System.out.println(currenturl);
        System.out.println(titles);
    }

    public void dropdown(){
        WebElement drpone = driver.findElement(By.xpath("//select[@id ='dropdown1']"));
        WebElement drptwo = driver.findElement(By.xpath("//select[@name = 'dropdown2']"));
        WebElement drpthree = driver.findElement(By.xpath("//select[@id = 'dropdown3']"));
        Select selone = new Select(drpone);
        Boolean status = selone.isMultiple();
        if(status) {
            System.out.println("Multiple dropdowns are there");
        }
        else {
            System.out.println("Multiple dropdowns aren't there");
        }
        selone.selectByIndex(2);
        List<WebElement> ele = selone.getOptions();
        System.out.println(ele.size());
    }
}
