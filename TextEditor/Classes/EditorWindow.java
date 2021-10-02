package com.ilfidev.Classes;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class EditorWindow extends JFrame {
//JFrame frame = new JFrame("Text Editor");


    public EditorWindow() {
        super("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextArea textArea = new TextArea();
        Menu menu = new Menu(textArea);
        setSize(800,500);
        setJMenuBar(menu.mb);
        add(textArea.textArea);
        add(textArea.scrollPane);
        setVisible(true);
    }

}
