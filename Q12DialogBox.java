/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author user
 */
public class Q12DialogBox {
    Q12DialogBox() {
        Frame f = new Frame("Label Demo");
        f.setSize(300, 300);
        f.setLocationRelativeTo(null);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowevent) {
                System.exit(0);
            }
        });
        Dialog d = new Dialog(f, "Dialog Demo", true);
        d.setLocationRelativeTo(null);
        TextArea t1 = new TextArea("This is your TextArea", 20, 20, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
        Button b1 = new Button("Click Here to open TextArea");
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.add(t1);
                d.setSize(300, 300);
                d.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent windowevent) {
                        System.exit(0);
                    }
                });
                d.setVisible(true);
            }
        });
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q12DialogBox();
    }
}
