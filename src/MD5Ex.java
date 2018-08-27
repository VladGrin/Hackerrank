import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class MD5Ex {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(string.getBytes());

        StringBuilder builder = new StringBuilder();
        for(byte b : bytes){
            builder.append(String.format("%02x", b));
        }
        System.out.println(builder.toString());
    }
}