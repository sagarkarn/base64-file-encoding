package skx.coding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class Base64 {
    public static void encode(String path, OnCompleteListener listener) {
        new Thread(() -> {
            byte[] bytes = new byte[0];
            try {
                bytes = Files.readAllBytes(Paths.get(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
//        encode to base 64
            String base64String = java.util.Base64.getEncoder().encodeToString(bytes);
            listener.onComplete(base64String);
        }).start();
    }
}
