package Adapter.codigo_facade;

public class Main {
    public static void main(String[] args) {
        // Usando a Facade para enviar mensagens
        MessageService messageService = new MessageService();
        
        messageService.sendEmail("Olá, Facade!");
        messageService.sendSms("Olá, SMS com Facade!");
    }
}
