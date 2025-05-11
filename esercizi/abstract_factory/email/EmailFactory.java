package esercizi.abstract_factory.email;

import esercizi.abstract_factory.IAttachment;
import esercizi.abstract_factory.IMessage;
import esercizi.abstract_factory.INotifierFactory;

public class EmailFactory implements INotifierFactory {
    public IMessage createMessage() {
        return new EmailMessage();
    }

    public IAttachment createAttachment() {
        return new EmailAttachment();
    }
}
