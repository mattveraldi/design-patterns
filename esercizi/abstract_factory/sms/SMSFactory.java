package esercizi.abstract_factory.sms;

import esercizi.abstract_factory.IAttachment;
import esercizi.abstract_factory.IMessage;
import esercizi.abstract_factory.INotifierFactory;

public class SMSFactory implements INotifierFactory {
    public IMessage createMessage() {
        return new SMSMessage();
    }

    public IAttachment createAttachment() {
        return new SMSAttachment();
    }
}
