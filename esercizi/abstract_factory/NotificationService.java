package esercizi.abstract_factory;

class NotificationService {
    private final INotifierFactory factory;

    public NotificationService(INotifierFactory factory) {
        this.factory = factory;
    }

    public void notify(String to, String content, String filePath) {
        IMessage msg = factory.createMessage();
        IAttachment att = factory.createAttachment();

        msg.send(to, content);
        att.attach(filePath);
    }
}
