package ders3.javaio;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class JavaIO2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JavaIO2 javaIO2 = new JavaIO2();
        Calendar openTime = Calendar.getInstance();
        openTime.set(2014, Calendar.FEBRUARY, 15, 20, 59);

        Calendar closeTime = Calendar.getInstance();
        closeTime.set(2018, Calendar.JANUARY, 12, 19, 59);

        Starbucks starbucks = new Starbucks();
        starbucks.setAllObject(openTime.getTime(), closeTime.getTime());

        javaIO2.writeObjectToFile(starbucks);
//        javaIO2.readObjectFromFile();
        System.out.println(starbucks);
    }

   /* private void readObjectFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("/home/huskev/Downloads/ders.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Object obj =  objectIn.readObject();
        System.out.println(obj);
    }*/


    public void writeObjectToFile(Object serObj) throws FileNotFoundException {
        FileOutputStream fileOut = new FileOutputStream("/home/huskev/Downloads/ders.txt");

        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
