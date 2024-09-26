package adapter.codigo_adapter;
import adapter.EmailSender.EmailSender;
import adapter.MessageSender.MessageSender;

public class MessageAdapter implements MessageSender {
    private EmailSender emailSender;

    public MessageAdapter(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void sendMessage(String message) {
        emailSender.sendEmail(message);
    }
}