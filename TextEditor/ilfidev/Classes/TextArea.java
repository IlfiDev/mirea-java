package com.ilfidev.Classes;

import javax.swing.*;
import java.awt.*;

public class TextArea {
    JTextArea textArea = new JTextArea();
    //JPanel jPanel = new JPanel();
    Font font = new Font("Comic Sans MS", Font.PLAIN, 25);
    JScrollPane scrollPane = new JScrollPane(textArea);
    public TextArea(){
        textArea.setBounds(0,0, 1000, 1000);
        Font updFont = textArea.getFont();

        textArea.setFont(font.deriveFont(100));
    }
}
