package com.ilfidev;

public class AnyArraySaver<E> {
    private E[] array;
    public AnyArraySaver(E[] array){
        this.array = array;
    }
    public void showArray(){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public E getElement(int index){
        return array[index];
    }

}
