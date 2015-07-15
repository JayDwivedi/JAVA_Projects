/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame.*;

import javax.swing.JLabel.*;
import javax.swing.event.*;

 public class Login1 extends JFrame
{

private JTextField addTextField1,addTextField;

  JButton addButton;

Login1 l1;

public Login1()
{
setTitle("Login Form");
setSize(640, 480);
l1=this;
addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        actionExit();

}
});
  
JPanel addPanel = new JPanel();
JPanel addPanel2 = new JPanel();
JPanel addPanel3 = new JPanel();
JLabel l1=new JLabel("User Name",JLabel.LEFT);
l1.setForeground(new Color(0, 0, 255));

addPanel.add(l1);
addTextField1 = new JTextField(30);
    addPanel.add(addTextField1);

JLabel l2=new JLabel("Password",JLabel.LEFT);
l2.setForeground(new Color(0, 0, 255));

addPanel2.add(l2);

 
    addTextField = new JTextField(30);
addPanel2.add(addTextField);

   addButton = new JButton("Login");
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        actionAdd();
     

      }
    });
    addPanel3.add(addButton);
JButton addButton1 = new JButton("Register");
addButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        actionAdd1();
     

      }
    });

addPanel3.add(addButton1);
 getContentPane().setLayout(new BorderLayout());
    getContentPane().add(addPanel, BorderLayout.NORTH);
getContentPane().add(addPanel2, BorderLayout.CENTER);
getContentPane().add(addPanel3, BorderLayout.SOUTH);
}
private void actionExit() {
    System.exit(0);
  }

private void actionAdd()
{
        String s;
    
    try{
    FileInputStream f2=new FileInputStream(addTextField1.getText());
//int size=f2.available();
DataInputStream in=new DataInputStream(f2);
BufferedReader br=new BufferedReader(new InputStreamReader(in));
s=br.readLine();
if(s.equals(addTextField.getText()))
{
DownloadManager manager = new DownloadManager();
l1.setVisible(false);
manager.setVisible(true);

}
else
{
    System.out.println("you enter wrong user name and password");
   // Login1 l=new Login1();
   // actionAdd();
    addTextField1.setText("");
     addTextField.setText("");
     

}
    } catch(IOException e)
    {
        System.out.println("you enter wrong user name");
    }





}
 private void actionAdd1()
{
Ragistration manager = new Ragistration();
l1.setVisible(false);
manager.setVisible(true);




}
 





    
}
