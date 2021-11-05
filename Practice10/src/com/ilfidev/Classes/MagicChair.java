package com.ilfidev.Classes;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Венгардиум левиосА");
    }

    @Override
    public void sitOnTheChair() {
        System.out.println("На магический стул сели");
    }
}
