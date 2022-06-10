package selenium;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    public void loginToInsta(){
        Leafground leaf = new Leafground();
        leaf.launchleafground("http://leafground.com/");
        leaf.dropdown();
    }
}
