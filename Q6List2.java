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
public class Q6List2{
    Q6List2(){
        Frame f=new Frame("List");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Label la=new Label("Select your favoutie sports from the list:",Label.RIGHT);
        List lst=new List(7,false);
        lst.add("Badminton");
        lst.add("Hockey");
        lst.add("Tennis");
        lst.add("Football");
        lst.add("Cricket");
        lst.add("Formula One");
        lst.add("Rugby");
        
        f.add(la);
        f.add(lst);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,400);
    }
    public static void main(String[] args) {
        new Q6List2();
    }
}
