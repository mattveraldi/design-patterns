package esercizi.abstract_factory;

public interface INotifierFactory {
    IMessage createMessage();

    IAttachment createAttachment();
}