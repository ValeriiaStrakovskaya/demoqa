import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsDemo {
    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.navigate().to("https://demoqa.com/");
        // wd.get("https://demoqa.com/");
    }

    @Test
    public void testURL(){

    }


}
