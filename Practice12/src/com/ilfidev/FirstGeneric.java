package com.ilfidev;

import java.io.File;
import java.util.ArrayList;

public class FirstGeneric {

    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst){
        for (E e : a){
            lst.add(e);
        }
    }

}
