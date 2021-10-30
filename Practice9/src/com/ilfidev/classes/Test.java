package com.ilfidev.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private Execution exe;
    private StudentInserter studentInserter;
    BufferedReader br;
    public Test(){
        //exe = new Execution(studentInserter.getStudentsArray());
        InputStreamReader isr = new InputStreamReader(System.in);
        this.br = new BufferedReader(isr);
    }
    public void start() throws IOException, NoSuchNameException {

        int answer = 1;
        while(answer != 0){
            System.out.println("Students sorter\n1 - Insert Students\n2 - InsertionSort(id)\n3 - Quick sort(gpa)\n4 - Find Student\n0 - Exit");
            answer = getAnswer();
            switch (answer){

                case 1:
                    System.out.println("Enter the amount of students");
                    String size = br.readLine();
                    studentInserter = new StudentInserter(Integer.parseInt(size));
                    studentInserter.insertStudents();
                    break;
                case 2:
                    exe = new Execution(studentInserter.getStudentsArray());
                    exe.executeFirst();
                    break;
                case 3:
                    exe = new Execution(studentInserter.getStudentsArray());
                    exe.executeSecond();
                    break;
                case 4:
                    String nameToFind = br.readLine();
                    try{
                        FindByName(nameToFind);
                    }catch(NoSuchNameException ex){
                        System.out.println(ex.getMessage());
                        System.out.println(ex.getName());
                    }
                    break;

                case 0:
                    return;

            }

        }
    }
    void FindByName(String nameToFind) throws NoSuchNameException {
        for(int i = 0; i < studentInserter.getStudentsArray().length; i++){
            if(studentInserter.getStudentsArray()[i].getName().equals(nameToFind)){
                System.out.println("Found Student " + nameToFind + " id:" + studentInserter.getStudentsArray()[i].getID());
            }
        }
        throw new NoSuchNameException("No Such Student:", nameToFind);
    }
    private int getAnswer() throws IOException {
        String answer = br.readLine();
        return Integer.parseInt(answer);
    }
}
