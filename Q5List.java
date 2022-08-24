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
 * @author Prabin
 */
public class Q5List {
    Q5List(){
        Frame f=new Frame("List Demo");
        f.setLayout(new FlowLayout());
        Panel p1= new Panel();
        Panel p2= new Panel();
        Label la=new Label("Choose the planet:",Label.RIGHT);
        
        List lst= new List(4,false);
       
        
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("Uranus");
        lst.add("Neptune");
        lst.add("Pluto");
        
        p1.add(la);
        p2.add(lst);
        f.add(p1);
        f.add(p2);
        
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(400,400);
    }
    public static void main(String[] args) {
        new Q5List();
    }
}
