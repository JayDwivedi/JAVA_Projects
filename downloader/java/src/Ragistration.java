/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.String;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame.*;

import javax.swing.JLabel.*;
import javax.swing.event.*;

 public class Ragistration extends JFrame
{

private JTextField aTF1,aTF2,aTF3;

  JButton aB1,aB2;

Ragistration l1;

public Ragistration()
{
setTitle("Ragistration Form");
setSize(640, 480);
l1=this;
addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        actionExit();

}
});
  
JPanel addPanel1 = new JPanel();
JPanel addPanel2 = new JPanel();
//JPanel addPanel3 = new JPanel();
JPanel addPanel4 = new JPanel();
JLabel l1=new JLabel("User Name",JLabel.LEFT);
l1.setForeground(new Color(0, 0, 255));

addPanel1.add(l1);
aTF1 = new JTextField(30);
    addPanel1.add(aTF1);

JLabel l2=new JLabel("Password",JLabel.LEFT);
l2.setForeground(new Color(0, 0, 255));

addPanel2.add(l2);

 
    aTF2 = new JTextField(16);
addPanel2.add(aTF2);

JLabel l3=new JLabel("Confirm Password",JLabel.RIGHT);
l3.setForeground(new Color(0, 0, 255));

addPanel2.add(l3);

 
    aTF3 = new JTextField(16);
addPanel2.add(aTF3);

   aB1 = new JButton("Submit");
    aB1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        actionAdd();
     

      }
    });
aB2 = new JButton("cancel");
    aB2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        actionExit();
     

      }
    });

    addPanel4.add(aB1);
addPanel4.add(aB2);
 getContentPane().setLayout(new BorderLayout());
    getContentPane().add(addPanel1, BorderLayout.NORTH);
getContentPane().add(addPanel2, BorderLayout.CENTER);
//getContentPane().add(addPanel3, BorderLayout.SOUTH);
getContentPane().add(addPanel4, BorderLayout.SOUTH);
}
private void actionExit() {
    System.exit(0);
  }

private void actionAdd()
{

l1.setVisible(false);
String s=aTF2.getText();
byte buf[]=s.getBytes();
try{
FileOutputStream f1=new FileOutputStream(aTF1.getText());
if(aTF2.getText().equals(aTF3.getText()))
{   
f1.write(buf);
f1.close();
new Login1().setVisible(true);
}
else
{
    new Ragistration().setVisible(true);
        System.out.println("your password is not Matching \n please enter correct");
aTF2.setText("");
aTF3.setText("");
}
     
}
catch(IOException e)
{
    System.out.println("An I/O error generated");
}
   // System.out.println(""+aTF1.getText()+" "+aTF2.getText()+" "+aTF3.getText());
//aTF1.getText();




}
 




}

