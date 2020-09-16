package seg;
import java.security.*;
import java.math.*;

public class Cript {
    public static String md5(String texto) throws Exception{
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(texto.getBytes("utf8"),0,texto.length());
        return "MD5: " + new BigInteger(1,m.digest()).toString(16);
    }
    
    public static String sha256(String texto) throws Exception{
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(texto.getBytes("utf8"));
        return "SHA-256: " + String.format("%064x", new BigInteger(1,m.digest()));
    }
    
    public static String sha512(String texto) throws Exception{
        MessageDigest m = MessageDigest.getInstance("SHA-512");
        m.reset();
        m.update(texto.getBytes("utf8"));
        return "SHA-512: " + String.format("%0128x", new BigInteger(1,m.digest()));
    }
}
