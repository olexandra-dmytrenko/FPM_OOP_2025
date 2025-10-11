package creational_patterns;

import creational_patterns.factory.DocumentFactory;

public class RunSingleton {
    public static void main(String[] args) {
        System.out.println(SignSingleton.tellYourState());
        SignSingleton director = SignSingleton.getInstance();

        System.out.println(director.tellYourState());
        SignSingleton directorHelper = SignSingleton.getInstance();
        System.out.println(SignSingleton.tellYourState());
        DocumentFactory documentProducer = new DocumentFactory();
        directorHelper.signDocument(documentProducer.createDocument(ProductSupplyDocument.class.getSimpleName()));
        director.signDocument(documentProducer.createDocument("NewEmployeeDocument"));

    }
}
