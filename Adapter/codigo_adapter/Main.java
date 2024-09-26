package Adapter.codigo_adapter;

import Adapter.EmailSender.EmailSender;
import Adapter.MessageSender.MessageSender;
import Adapter.SmsSender.SmsSender;

public class Main {
    public static void main(String[] args) {
        // Usando o Adapter para Email
        EmailSender emailSender = new EmailSender();
        MessageSender emailAdapter = new MessageAdapter(emailSender);
        emailAdapter.sendMessage("Olá, Adapter!");

        // Usando o SMS diretamente
        MessageSender smsSender = new SmsSender();
        smsSender.sendMessage("Olá, SMS!");
    }
}
