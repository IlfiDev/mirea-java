package com.ilfidev.Classes;

public class ChairFactory implements AbstractChairFactory{

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(500);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
