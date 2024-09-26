package Adapter.codigo_adapter;
import Adapter.EmailSender.EmailSender;
import Adapter.MessageSender.MessageSender;

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