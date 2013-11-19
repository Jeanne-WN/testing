public class MailClient {
    private MailService mailService;

    public MailClient(MailService mailService) {
        this.mailService = mailService;
    }

    public String send(String mailContent) {
        if (mailService.checkNetwork()) {
            return mailService.send(mailContent) ? "success" : "failed";
        }
        return "failed";
    }
}
