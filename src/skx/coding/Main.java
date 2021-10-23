package skx.coding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        Base64.encode("./10mb.jpg", result -> {
            System.out.println(result);
        });
    }
}
