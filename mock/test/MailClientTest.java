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
    public void shouldCheckNetwork(){
        mailClient.send(mailContent);
        verify(mailService, times(1)).checkNetwork();
    }
}
