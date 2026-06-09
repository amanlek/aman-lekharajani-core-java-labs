package com.aman.lab8.ex1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

    private FileInputStream fis;
    private FileOutputStream fos;

    public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
        this.fis = fis;
        this.fos = fos;
    }

    @Override
    public void run() {

        int ch;
        int count = 0;

        try {
            while ((ch = fis.read()) != -1) {

                fos.write(ch);
                count++;

                if (count % 10 == 0) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);
                }
            }

            System.out.println("File copied successfully.");

            fis.close();
            fos.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}