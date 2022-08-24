/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.awt.*;
import java.awt.Event.*;
/**
 *
 * @author nccs
 */
public class Q4Choice {
    Q4Choice(){
        Frame f=new Frame();
        Label l=new Label("Which language you like most?");
        f.setSize(200,200);
        Choice c1=new Choice();
        f.setLayout(new GridLayout(1,2));
        f.setVisible(true);
    }
}
