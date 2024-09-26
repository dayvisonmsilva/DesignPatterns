package adapter.SmsSender;
import adapter.MessageSender.MessageSender;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS enviado: " + message);
    }
}