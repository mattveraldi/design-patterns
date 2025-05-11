package esercizi.abstract_factory.email;

import esercizi.abstract_factory.IAttachment;

class EmailAttachment implements IAttachment {
    public void attach(String path) {
        System.out.println("Attaching file to email: " + path);
    }
}
