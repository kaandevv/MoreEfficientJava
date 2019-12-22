package ders3.javaio;

import java.io.*;

///home/huskev/Downloads/sample
public class JavaIO {

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        JavaIO javaIO = new JavaIO();

        Player player = new Player(112, "Kaan", Boolean.TRUE, 344);
//        javaIO.writeObjectToFile(player);
        javaIO.readObjectFromFile();
    }

    private void readObjectFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("/home/huskev/Downloads/ders.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Object obj = objectIn.readObject();
        System.out.println(obj);
    }

    public void writeObjectToFile(Object serObj) {

        try {
            FileOutputStream fileOut = new FileOutputStream("/home/huskev/Downloads/ders.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
