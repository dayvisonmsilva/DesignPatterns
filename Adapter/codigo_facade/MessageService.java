package Adapter.codigo_facade;

import Adapter.EmailSender.EmailSender;
import Adapter.SmsSender.SmsSender;

public class MessageService {
    private EmailSender emailSender;
    private SmsSender smsSender;

    public MessageService() {
        this.emailSender = new EmailSender();
        this.smsSender = new SmsSender();
    }

    public void sendEmail(String message) {
        emailSender.sendEmail(message);
    }

    public void sendSms(String message) {
        smsSender.sendMessage(message);
    }
}