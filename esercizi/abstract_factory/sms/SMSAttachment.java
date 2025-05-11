package esercizi.abstract_factory.sms;

import esercizi.abstract_factory.IAttachment;

class SMSAttachment implements IAttachment {
    public void attach(String path) {
        System.out.println("SMS can't attach files.");
    }
}
