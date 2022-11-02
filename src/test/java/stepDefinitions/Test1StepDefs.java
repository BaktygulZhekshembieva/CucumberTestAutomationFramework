package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.WebEndpoint;
import java.time.Duration;

public class Test1StepDefs {

    WebDriver driver; // с помощью этого интерфейса мы можем управлять драйверами

    @Given("^user is on \"([^\"]*)\" web page$")
    public void user_is_on_web_page(String url)  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    @Given("^user clicks button on Element button$")
    public void user_clicks_on_Element_button()  {
        WebElement element = driver.findElement(By.xpath("(//div[@class=\"avatar mx-auto white\"])[1]"));
        element.click();
    }

    @Given("^user clicks on Text Box button$")
    public void user_clicks_on_Text_Box_button()  {
        WebElement textBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
        textBox.click();
    }

    @Then("^user should see text \"([^\"]*)\"$")
    public void user_should_see_text(String expected)  {
        WebElement text = driver.findElement(By.xpath("//label[@id='userName-label']"));
        Assert.assertEquals(expected,text.getText());
        driver.close();
    }
}
