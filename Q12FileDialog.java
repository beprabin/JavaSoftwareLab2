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
public class Q12FileDialog {
    Q12FileDialog() {
        Frame f = new Frame("File Dialog");
        f.setSize(300, 300);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowevent) {
                System.exit(0);
            }
        });
        Button b1 = new Button("Open File");
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(f, "File Dialog");
                fd.setVisible(true);
            }});
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q12FileDialog();
    }
}
