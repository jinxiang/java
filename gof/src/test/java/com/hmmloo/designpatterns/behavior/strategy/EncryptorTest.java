package com.hmmloo.designpatterns.behavior.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptorTest {
    @Test
    public void testEncrypt() throws Exception {
        EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();
        EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }
}