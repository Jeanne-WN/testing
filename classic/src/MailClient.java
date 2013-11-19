public class MailClient {
    private MailService mailService;

    public MailClient(MailService mailService) {
        this.mailService = mailService;
    }

    public String send(String mailContent) {
        return mailService.send(mailContent) ? "success" : "failed";
    }
}
