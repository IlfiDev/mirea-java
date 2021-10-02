package com.ilfidev.Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu{
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    JMenuBar mb=new JMenuBar();
    TextArea textArea;
    Saver saveFile;
    Opener opener;
    boolean doSave = false;
    Menu(TextArea ta){
        saveFile = new Saver();
        opener = new Opener();
        textArea = ta;
        menu=new JMenu("File");
        submenu=new JMenu("Sub Menu");
        i1=new JMenuItem("save as");
        i2=new JMenuItem("save");
        i3=new JMenuItem("Open");
        i4=new JMenuItem("Item 4");
        i5=new JMenuItem("Item 5");
        menu.add(i1); menu.add(i2); menu.add(i3);
        submenu.add(i4); submenu.add(i5);
        menu.add(submenu);
        i1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String path = JOptionPane.showInputDialog(null,"Insert some path");
                saveFile.saveThisFile(path, textArea.textArea.getText());
                saveFile.path = path;
            }
        });
        i2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                if(saveFile.isSaved == false){
                    String path = JOptionPane.showInputDialog(null,"Insert some path");
                    saveFile.saveThisFile(path, textArea.textArea.getText());
                    saveFile.path = path;
                }
                else{
                    saveFile.saveThisFile(textArea.textArea.getText());
                }

            }
        });
        i3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String path = JOptionPane.showInputDialog(null,"Insert some path");
                String textToOpen = opener.openFile(path);
                textArea.textArea.setText(textToOpen);
                saveFile.path = path;
            }
        });
        mb.add(menu);
    }
}
