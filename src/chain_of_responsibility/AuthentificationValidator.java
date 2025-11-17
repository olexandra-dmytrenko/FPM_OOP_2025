package chain_of_responsibility;


import java.io.IOException;

public class AuthentificationValidator implements Validation{

    Validation next;
    // повертати MyResponse у випадку збору інформації про результати кожного етапу.
    @Override
    public void handle(MyRequest request) throws IOException {
        System.out.println("Authentification: All passed");
            next.handle(request);
    }

    @Override
    public void addHandler(Validation validation) {
        this.next = validation;
    }
}
