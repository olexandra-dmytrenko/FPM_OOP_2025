package creational_patterns;

public class SignSingleton {

    private static SignSingleton instance;
    private static int creationNumber = 0;

    private SignSingleton(){
        creationNumber++;
        System.out.println("Singleton is constructed and ready to sign");
    }

    public static synchronized SignSingleton getInstance(){
         if (instance == null){
             instance = new SignSingleton();
         }
         return instance;
    }

    public static String ifInitialized(){
        return instance == null ? "no" : "yes";
    }

    public static String tellYourState(){
        return "I am initialized " + creationNumber + " times.";
    }

    public void signDocument(Document document){
        System.out.println("Document is signed by " + this.getClass().getName());
    }
}
