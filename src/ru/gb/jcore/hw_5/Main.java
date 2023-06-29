package ru.gb.jcore.hw_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Backup.createBackup("C:/Users/musli/IdeaProjects/GB-HW-java-core/src/ru/gb/jcore/hw_4", "./backup");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
