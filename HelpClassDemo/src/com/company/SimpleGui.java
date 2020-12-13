package com.company;

import org.w3c.dom.events.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui extends JFrame {
    private JButton button=new JButton("Нажми");
    private JTextField input=new JTextField(" ",5);
    private JLabel label=new JLabel("  Напиши: ");
    private JRadioButton radioButton1=new JRadioButton("Выбери эту");
    private JRadioButton radioButton2=new JRadioButton("Выбери этот");
    private JCheckBox checkBox=new JCheckBox("Check", false);

    public SimpleGui(){
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group=new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        container.add(radioButton1);

        radioButton1.setSelected(true);
        container.add(radioButton2);
        container.add(checkBox);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String message="";
            message+="Кнопка была нажата\n";
            message+="Текст: "+input.getText()+"\n";
            message+=(radioButton1.isSelected()?"Rado #1":"Radio#2")+"выбрано\n";
            message+="CheckBox is "+ ((checkBox.isSelected())?"checked":"unchecked");
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SimpleGui app=new SimpleGui();
        app.setVisible(true);
    }
}
