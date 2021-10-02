package com.ilfidev.Classes;


import java.io.FileWriter;
import java.io.IOException;

public class Saver {
boolean isSaved;
String path;
    Saver() {
        isSaved = false;

    }
    void saveThisFile(String path, String text){

        try (FileWriter writer = new FileWriter(path)) {
            isSaved = true;
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveThisFile(String text){
        try (FileWriter writer = new FileWriter(path)) {
            isSaved = true;
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
