package chain_of_responsibility;

import java.io.IOException;

public interface Validation {
    void handle(MyRequest request) throws IOException;
    void addHandler(Validation validation);
}
