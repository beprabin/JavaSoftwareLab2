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
 * @author nccs
 */
public class Q1 {
    public Q1(){
        Frame f=new Frame("Label Demo");
        f.setSize(300,150);
        Label name=new Label("Name");
        name.setAlignment(Label.LEFT);
        TextField tf1=new TextField();
        f.add(name);
        f.add(tf1);
        Label address=new Label("Address");
        address.setAlignment(Label.LEFT);
        TextField tf2=new TextField();
        f.add(address);
        f.add(tf2);
        Button b=new Button("OK");
        Button b2=new Button("Cancel");
        f.add(b);
        f.add(b2);
        name.setText("Full name");
        f.setLayout(new GridLayout(3,3));
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
        }});
        f.setVisible(true);
    }
    public static void main(String[] args){
        new Q1();
    }
 }

