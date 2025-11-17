package chain_of_responsibility;

import java.io.IOException;

public class AuthorisationValidator implements Validation {

    Validation next;
    @Override
    public void handle(MyRequest request) throws IOException {
        throw new IOException("Authorisation handler exception");

    }

    @Override
    public void addHandler(Validation validation) {
        this.next = validation;
    }
}
