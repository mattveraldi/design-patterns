package esercizi.abstract_factory.email;

import esercizi.abstract_factory.IMessage;

class EmailMessage implements IMessage {
    public void send(String to, String content) {
        System.out.println("Email to " + to + ": " + content);
    }
}
