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
public class Q8Calculator {
    public Q8Calculator(){
        Frame f= new Frame();
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }});
        
        Label l1= new Label("Num1",Label.LEFT);
        Label l2= new Label("Num2",Label.LEFT);
        Label l3= new Label("Result",Label.LEFT);
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();

        Panel p1= new Panel(new GridLayout(3,2));
        Panel p2= new Panel(new GridLayout(1,2));
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        t3.setEditable(false);


        Button b1= new Button("+");
        Button b2= new Button("-");  
        
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int sum=n1+n2;
            t3.setText(""+sum);
        }      
        });
         b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int sum=n1+n2;
            t3.setText(""+sum);
        }      
        });
        b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int diff=n1-n2;
            t3.setText(""+diff);
        }      
        });

        p2.add(b1);
        p2.add(b2);

        f.add(p1);
        f.add(p2);


        f.setSize(600,300);
        f.setLayout(new GridLayout(2,1));
        f.setLocationRelativeTo(null);
        f.setVisible(true);;   
        }
        public static void main(String[] args){
            new Q8Calculator();
        }
    
}