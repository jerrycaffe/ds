package src.main.java.com.sort;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenerateSha {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "TMHE8nQRyO4pxtFFnRqoFy8BO";
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes());
        String hex = bytesToHex(hash);
        System.out.println(hex);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}