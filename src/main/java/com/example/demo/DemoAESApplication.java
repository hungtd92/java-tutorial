package com.example.demo;

import com.example.demo.dto.CreditCardBalance;
import com.example.demo.dto.CreditCardDetailDto;
import com.example.demo.test.CrackerWorker;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@Slf4j
public class DemoAESApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(DemoAESApplication.class, args);
    String plainText = "1221";
    String keyString = "hpfr55Aa7ruvEotivZ8qhw==";
    String ivString = "1234567890123456"; // IV length for AES CBC mode is 16 bytes

    try {
      // Convert key and IV strings to byte arrays
      byte[] keyBytes = keyString.getBytes(StandardCharsets.UTF_8);
      byte[] ivBytes = ivString.getBytes(StandardCharsets.UTF_8);

      // Create SecretKeySpec for the key
      SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

      // Create IvParameterSpec for the IV
      IvParameterSpec ivParameterSpec = new IvParameterSpec(ivBytes);

      // Initialize Cipher for encryption
      Cipher encryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      encryptCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

      // Encrypt the plaintext
      byte[] encryptedBytes = encryptCipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));

      // Encode the encrypted bytes to Base64
      String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);

      System.out.println("Encrypted: " + encryptedBase64);

      // Initialize Cipher for decryption
      Cipher decryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      decryptCipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);

      encryptedBase64 = "AcrkItu7+gEVK+2InPY5UA==";
      // Decrypt the encrypted Base64 string
//      byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedBase64));

      // Convert decrypted bytes to string
//      String decryptedText = new String(decryptedBytes, StandardCharsets.UTF_8);

//      System.out.println("Decrypted: " + decryptedText);
    } catch (Exception e) {
      e.printStackTrace();
    }

    KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
    kpg.initialize(1024);
    KeyPair kp = kpg.generateKeyPair();
    Key pub = kp.getPublic();
    Key pvt = kp.getPrivate();
    System.out.println("publicKey: " + Base64.getEncoder().encodeToString(pub.getEncoded()));
    System.out.println("privateKey: " + Base64.getEncoder().encodeToString(pvt.getEncoded()));

    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128); // for example
    SecretKey secretKey = keyGen.generateKey();
    System.out.println("secretKey: " + Base64.getEncoder().encodeToString(secretKey.getEncoded()));

    System.out.println("maskCardNumberWithLast4Digits: " + maskCardNumberWithLast4Digits("5206490057891727"));
    System.out.println("formatCardNumber: " + formatCardNumber("5206490057891727"));
    String originalString = "1526";
    String newString = originalString.substring(0, 2)
            + "/"
            + originalString.substring(2);
    System.out.println("originalString: " + originalString + " newString: " + newString);
    System.out.println("getDate: " + getDate("dd/MM/yyyy - HH:mm:ss"));
    Date date = new Date();
    System.out.println("timestamp: " + date.getTime());
    System.out.println("format date: " + formatDate(date, "dd/MM/yyyy - HH:mm:ss"));

    System.out.println("parseInt: " + (Integer.parseInt("0")));

  }

  public static String maskCardNumberWithLast4Digits(String cardNumber) {
    if (StringUtils.isNotEmpty(cardNumber) && cardNumber.length() == 16)
      return StringUtils.EMPTY
              .concat(cardNumber.substring(8, 12).replaceAll("\\d+", "****"))
              .concat(StringUtils.SPACE)
              .concat(cardNumber.substring(12, 16));
    return cardNumber;
  }

  public static String formatCardNumber(String cardNumber) {
    if (StringUtils.isNotEmpty(cardNumber) && cardNumber.length() == 16)
      return cardNumber.substring(0, 4)
              .concat(StringUtils.SPACE)
              .concat(cardNumber.substring(4, 8))
              .concat(StringUtils.SPACE)
              .concat(cardNumber.substring(8, 12))
              .concat(StringUtils.SPACE)
              .concat(cardNumber.substring(12, 16));
    return cardNumber;
  }

  public static String getDate(String format) {
    String currentDateTime = (new SimpleDateFormat(format)).format(new Date());
    return currentDateTime;
  }

  public static String formatDate(Date date, String format) {
    String currentDateTime = (new SimpleDateFormat(format)).format(date);
    return currentDateTime;
  }

}
