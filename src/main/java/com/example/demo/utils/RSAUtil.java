package com.example.demo.utils;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.Logger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RSAUtil {
    private static final Logger log = Logger.getLogger(RSAUtil.class);

    public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        return generator.generateKeyPair();
    }

    public static PrivateKey loadPrivateKey(String privateKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        log.debugv("privateKey: {0}", privateKey);
        String standardKey = privateKey
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace(" ", "")
                .trim();
        log.debugv("standard privateKey: {0}", standardKey);
        byte[] decoded = Base64.getDecoder().decode(standardKey);
        KeySpec keySpec = new PKCS8EncodedKeySpec(decoded);
        return KeyFactory.getInstance("RSA").generatePrivate(keySpec);
    }

    public static String decrypt(String privateKey, String encryptedText) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeySpecException, BadPaddingException, InvalidKeyException {
        try {
            if (StringUtils.isNotEmpty(encryptedText)) {
                byte[] bytes = Base64.getDecoder().decode(encryptedText);
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(Cipher.DECRYPT_MODE, loadPrivateKey(privateKey));
                byte[] decryptedText = cipher.doFinal(bytes);
                return new String(decryptedText, StandardCharsets.UTF_8);
            }
        } catch (Exception ex) {
            log.error("error when decrypt text", ex);
            throw ex;
        }
        return "";
    }
}
