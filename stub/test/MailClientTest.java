import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MailClientTest {

    private MailService mailService;
    private MailClient mailClient;

    @Test
    public void shouldReturnSuccess() {
        mailService = new MailService();
        mailClient = new MailClient(mailService);

        String result = mailClient.send("This is a email.");

        assertThat(result, equalTo("success"));
    }

    @Test
    public void shouldReturnFailed() {
        mailService = new MockMailService();
        mailClient = new MailClient(mailService);

        String result = mailClient.send("This is a email.");

        assertThat(result, equalTo("failed"));
    }
}
