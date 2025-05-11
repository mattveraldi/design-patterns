package esercizi.abstract_factory.sms;

import esercizi.abstract_factory.IMessage;

class SMSMessage implements IMessage {
    public void send(String to, String content) {
        System.out.println("SMS to " + to + ": " + content);
    }
}
