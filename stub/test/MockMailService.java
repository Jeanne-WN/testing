import java.util.ArrayList;
import java.util.List;

public class MockMailService extends MailService {
    public boolean send(String mailContent) {
        return false;
    }
}

