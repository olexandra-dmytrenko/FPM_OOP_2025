package chain_of_responsibility;


import java.io.IOException;

public class Controller {
    private AuthentificationValidator authentificationValidator = new AuthentificationValidator();
    private AuthorisationValidator authorisationValidator = new AuthorisationValidator();

    public Controller() {
        authentificationValidator.addHandler(authorisationValidator);
    }

    public String handleRequest(MyRequest request) {
        try {
            authentificationValidator.handle(request);
            return "All passed";
        } catch (IOException e) {
            System.out.println("exception in the validation element:" + e.getMessage());
            return "Validation problem";
        }
    }
}
