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
 * @author PRABIN
 */
public class Q10FlowLayout {
    public Q10FlowLayout(){
     Frame f= new Frame("FlowLayout Demo");
    f.setSize(350,100);
     
    Label l= new Label("Counter");
    
   TextField t= new TextField(10);
   t.setEditable(false);
   t.setText("0");
   
   Button b1=new Button("Up");
   Button b2=new Button("Down"); 
   Button b3 =new Button("Reset");
   
   f.setLayout(new FlowLayout());
   f.add(l);
   f.add(t);
   f.add(b1);
   f.add(b2); 
   f.add(b3);
   f.setVisible(true);
   
   f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }});
    }
    public static void main(String[] args) {
        new Q10FlowLayout();
    }
    }

