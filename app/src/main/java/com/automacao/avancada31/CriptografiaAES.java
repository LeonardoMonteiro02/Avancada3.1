package com.automacao.avancada31;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CriptografiaAES {
    private static final String CHAVE_SECRETA = "ChaveSecreta1234"; // A chave deve ter 16, 24 ou 32 bytes

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";

    public static String criptografar(String texto) throws Exception {
        SecretKeySpec chave = new SecretKeySpec(CHAVE_SECRETA.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, chave);
        byte[] textoCriptografado = cipher.doFinal(texto.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(textoCriptografado);
    }

    public static String descriptografar(String textoCriptografado) throws Exception {
        if (textoCriptografado == null) {
            return null;
        }
        SecretKeySpec chave = new SecretKeySpec(CHAVE_SECRETA.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, chave);
        byte[] textoBytes = Base64.getDecoder().decode(textoCriptografado);
        byte[] textoDescriptografado = cipher.doFinal(textoBytes);
        return new String(textoDescriptografado, "UTF-8");
    }

}