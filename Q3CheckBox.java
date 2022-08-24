/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.awt.*;

/**
 *
 * @author nccs
 */
public class Q3CheckBox {
    public Q3CheckBox(){
        Frame f=new Frame();
        Label l=new Label("Choose program to enroll:");
        Checkbox c1=new Checkbox("C");
        Checkbox c2=new Checkbox("Java");
        Checkbox c3=new Checkbox("HTML");
        Checkbox c4=new Checkbox("PHP");
        Label l2=new Label("Payment:");
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox c5=new Checkbox("Now",cg,false);
        Checkbox c6=new Checkbox("Later",cg,true);
        f.add(l);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(l2);
        f.add(c5);
        f.add(c6);
        f.setLayout(new GridLayout(8,1));
        f.setSize(300,500);
        f.setVisible(true);
    }  
    public static void main(String[] args) {
        new Q3CheckBox();
    }
}
