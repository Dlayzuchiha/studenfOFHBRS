package org.hbrs.s1.ws22.uebung1.control;

import org.hbrs.s1.ws22.uebung1.view.Client;

public class Factory {

    public Translator createTranslator(){
        return new GermanTranslator();
    }

    public static void main(String[] args) {
        Client client = new Client((GermanTranslator) new Factory().createTranslator());
        client.display(0);
    }
}
