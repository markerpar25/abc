import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MavenTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeAll() throws IOException, ParserConfigurationException, SAXException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgotl\\Downloads\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://translate.google.com");
    }


    @Test
    public void test01() {
        driver.findElement(By.id("abc")).sendKeys("green");


    }
}
