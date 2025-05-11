package esercizi.abstract_factory;

import esercizi.abstract_factory.email.EmailFactory;
import esercizi.abstract_factory.sms.SMSFactory;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailFactory());
        emailService.notify("alice@example.com", "Hello Email!", "invoice.pdf");

        NotificationService smsService = new NotificationService(new SMSFactory());
        smsService.notify("+123456789", "Hello SMS!", "invoice.pdf");
    }
}
