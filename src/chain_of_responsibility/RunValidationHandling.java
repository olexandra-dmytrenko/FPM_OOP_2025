package chain_of_responsibility;

import java.io.IOException;

public class RunValidationHandling {

    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        controller.handleRequest(new MyRequest());

        System.out.println(true && true && false);
        System.out.println(null == "" && "fdsfs " == null );
    }
}
