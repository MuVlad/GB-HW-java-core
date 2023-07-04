package ru.gb.jcore.hw_5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Backup.createBackup("src/ru/gb/jcore/hw_4", "./backup");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        writeToFile(new byte[]{0,1,1,0,2,1,2,0,3});

    }

    private static void writeToFile(byte[] arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/ru/gb/jcore/hw_5/someFile.txt")))) {
            for (byte b : arr) {
                writer.write(String.valueOf(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}