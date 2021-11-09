package com.hmmloo.javacodingproblems;

import java.io.*;

public class Cloning {
    private static <T> T cloneThroughSerialization(T t) {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(t);

            ByteArrayInputStream bais
                    = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            return (T) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            // log exception
            return t;
        }
    }
}
