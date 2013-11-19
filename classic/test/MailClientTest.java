import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MailClientTest {

    private MailService mailService;
    private MailClient mailClient;

    @Before
    public void setup(){
        mailService = new MailService();
        mailClient = new MailClient(mailService);
    }

    @Test
    public void shouldReturnSuccess() {
        String result = mailClient.send("This is a email.");

        assertThat(result, equalTo("success"));
    }

    @Ignore("Has to turn off network, and then run following test")
    @Test
    public void shouldReturnFailed() {
        String result = mailClient.send("This is a email.");

        assertThat(result, equalTo("failed"));
    }
}
