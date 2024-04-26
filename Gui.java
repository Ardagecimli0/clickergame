/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class Gui implements ActionListener{
    
    
    int count = 0;
   JLabel label;
   JFrame frame;
   JPanel panel;
    
    public Gui () {
        
        JFrame frame = new JFrame();
        
        JButton button = new JButton("Click");
        button.addActionListener(this);
        
        label = new JLabel("Number of clicks: 0");
        
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        
        new Gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

count ++;
label.setText("Number of clicks: " + count);
    }
    
    
    
}
