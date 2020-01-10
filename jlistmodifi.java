import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class jlistmodifi extends JFrame implements ActionListener{
  JPanel p1, p2, p3 ,p4;
  JLabel label1, label2, label3, label4;
  JTextField t1, t2, t3;
  JButton add, delete, modify;
  JScrollPane scroll;
  File file1, file2;
  PrintWriter out=null;
  DefaultListModel model1;
  JList list1;
  
  public static void main(String[ ] args)
  {
    new jlistmodifi ();
  }
  public jlistmodifi  ()
  {
    p1=new JPanel();
    label1=new JLabel("Highscore recorder");
    p1.add(label1);
    p1.setBounds(10,10,490,70);
    this.add(p1);
    
    p2=new JPanel();
    this.add(p2);
    label2=new JLabel("Enter the name of the game");
    label3=new JLabel("what is your highscore?");
    label4=new JLabel("In which year.");
    t1=new JTextField("add text here");
    t2=new JTextField("add text here");
    t3=new JTextField("add text here");
    
    p2.add(label2);
    p2.add(t1);
    p2.add(label3);
    p2.add(t2);
    p2.add(label4);  
    p2.add(t3);
    p2.setLayout(new GridLayout(3,2));
    p2.setBounds(10,90,490,200);
    
    p3=new JPanel();
    add=new JButton("add"); 
    add.addActionListener(this);
    delete=new JButton("delete"); 
    delete.addActionListener(this);
    modify=new JButton("modify");
    modify.addActionListener(this);
    this.add(p3);
    p3.add(add);
    p3.add(delete);
    p3.add(modify);
    p3.setLayout(new GridLayout(1,3));
    p3.setBounds(40,300,400,50);
    
    model1=new DefaultListModel();
    list1=new JList(model1);
    scroll=new JScrollPane(list1);
    p4=new JPanel();
    this.add(p4);
    p4.setBounds(10,400,490,200);
    p4.setBackground(Color.WHITE);
    
    
    this.setSize(500,600);
    this.setVisible(true);
    this.setLayout(null);
  }  
  
  public void actionPerformed(ActionEvent e) {
  }
}

