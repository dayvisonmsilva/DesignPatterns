package Adapter.SmsSender;
import Adapter.MessageSender.MessageSender;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS enviado: " + message);
    }
}