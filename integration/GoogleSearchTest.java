import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GoogleSearchTest {
    @Test
    public void shouldReturnTW() {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://127.0.0.1:8080/bbs_team_a");
        chromeDriver.findElement(By.id("j_username")).sendKeys("juntao");
        chromeDriver.findElement(By.id("j_password")).sendKeys("123456");

        chromeDriver.findElement(By.tagName("button")).click();

        assertThat(chromeDriver.getCurrentUrl(), equalTo("http://127.0.0.1:8080/bbs_team_a/"));
        assertThat(chromeDriver.getTitle(), equalTo("Home"));

        chromeDriver.close();
    }
}
