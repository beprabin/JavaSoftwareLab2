/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Prabin Don
 */
public class Q2Button {
    Q2Button(){
        Frame f=new Frame();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        b2.setEnabled(false);
        b4.setEnabled(false);
        b1.setLabel("One");
        b3.setLabel("Three");
        f.setSize(300,200);
        f.setLayout(new GridLayout(2,2));
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q2Button();
    }
}
