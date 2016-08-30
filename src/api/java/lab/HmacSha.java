package lab;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Hex;

public class HmacSha {

    private static String toHmacHash(String data, String secretKey, String hashType) {
        String hash = null;
        try {
            // calculate HMAC hash
            Key key = new SecretKeySpec(secretKey.getBytes("UTF-8"), hashType);
            Mac mac = Mac.getInstance(key.getAlgorithm());
            mac.init(key);
            byte[] byteArr = mac.doFinal(data.getBytes("UTF-8"));
            System.out.println("Output length " + hashType + " is  : " + byteArr.length * 8);
            hash = Hex.encodeHexString(byteArr);

        } catch (UnsupportedEncodingException e) {
            // when character encoding parameter of String#getBytes is wrong
            throw new IllegalStateException(e);
        } catch (NoSuchAlgorithmException e) {
            // when algorism parameter of SecretKeySpec#SecretKeySpec is wrong
            throw new IllegalStateException(e);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
        return hash;
    }

    public static void main(String[] args)
            throws NoSuchAlgorithmException,
            UnsupportedEncodingException {
        String str = "Hi there hello world";
        System.out.println("Length of str is : " + str.getBytes("UTF-8").length);
        System.out.println("");

        KeyGenerator generatorHmacSHA256 = KeyGenerator.getInstance("HmacSHA256");
        generatorHmacSHA256.init(512);
        SecretKey keyHmacSHA256 = generatorHmacSHA256.generateKey();

        System.out.println("Key Size of keyHmacSHA256 is : " + keyHmacSHA256.getEncoded().length * 8);
        System.out.println("Key of keyHmacSHA256 is      : " + DatatypeConverter.printHexBinary(keyHmacSHA256.getEncoded()));

        String hashStr = toHmacHash(str, DatatypeConverter.printHexBinary(keyHmacSHA256.getEncoded()), "HmacSHA256");
        System.out.println("Hash of keyHmacSHA256 is     : " + hashStr);
        System.out.println("");

        KeyGenerator generatorHmacSHA384 = KeyGenerator.getInstance("HmacSHA384");
        generatorHmacSHA384.init(1024);
        SecretKey keyHmacSHA384 = generatorHmacSHA384.generateKey();
        System.out.println("Key Size of keyHmacSHA384 is : " + keyHmacSHA384.getEncoded().length * 8);
        System.out.println("Key of keyHmacSHA384 is      : " + DatatypeConverter.printHexBinary(keyHmacSHA384.getEncoded()));
        String hashStrHmacSHA384 = toHmacHash(str, DatatypeConverter.printHexBinary(keyHmacSHA384.getEncoded()), "HmacSHA384");
        System.out.println("Hash of keyHmacSHA384 is     : " + hashStrHmacSHA384);
        System.out.println("");

        KeyGenerator generatorHmacSHA512 = KeyGenerator.getInstance("HmacSHA512");
        generatorHmacSHA512.init(1024);
        SecretKey keyHmacSHA512 = generatorHmacSHA512.generateKey();
        System.out.println("Key Size of keyHmacSHA512 is : " + keyHmacSHA512.getEncoded().length * 8);
        System.out.println("Key of keyHmacSHA512 is      : " + DatatypeConverter.printHexBinary(keyHmacSHA512.getEncoded()));
        String hashStrHmacSHA512 = toHmacHash(str, DatatypeConverter.printHexBinary(keyHmacSHA512.getEncoded()), "HmacSHA512");
        System.out.println("Hash of keyHmacSHA512 is     : " + hashStrHmacSHA512);

    }

}

