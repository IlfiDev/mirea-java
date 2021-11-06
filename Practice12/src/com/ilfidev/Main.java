package com.ilfidev;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void ReadDirectory(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        for(int i = 0; i < 5; i++){
            System.out.println(files[i]);
        }
    }
    public static void main(String[] args) {

        Integer[] arrInt = {1,2,3};
        ArrayList<Integer> lst = new ArrayList<Integer>();
        FirstGeneric.ArrayToArrayList(arrInt, lst);

        AnyArraySaver<Integer> aas = new AnyArraySaver<Integer> (arrInt);
        System.out.println(aas.getElement(1));
        Double[] arrDouble = {1.1,1.2,1.3};
        AnyArraySaver<Double> aas2 = new AnyArraySaver<Double>(arrDouble);
        System.out.println(aas2.getElement(1));

        ReadDirectory("C:\\");
    }
}
