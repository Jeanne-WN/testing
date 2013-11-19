import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class MailClientTest {

    private MailService mailService;
    private MailClient mailClient;
    private String mailContent;

    @Before
    public void setup(){
        mailService = mock(MailService.class);
        mailClient = new MailClient(mailService);
        mailContent = "This is a email.";
    }

    @Test
    public void shouldReturnSuccess() {
        when(mailService.send(mailContent)).thenReturn(true);

        String result = mailClient.send(mailContent);

        assertThat(result, equalTo("success"));
    }

    @Test
    public void shouldReturnFailed() {
        when(mailService.send(mailContent)).thenReturn(false);

        String result = mailClient.send(mailContent);

        assertThat(result, equalTo("failed"));
    }
}
