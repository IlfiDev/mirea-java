package com.ilfidev.Classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Opener {

    public String openFile(String path){
        String text = "";
        try(FileReader fr = new FileReader(path)){
            int c;
            while((c = fr.read()) != -1){
                text += (char)c;
            }
            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
}
