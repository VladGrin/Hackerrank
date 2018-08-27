import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SHA256Ex {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] bytes = sha256.digest(string.getBytes());

        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        System.out.println(builder.toString());
    }
}