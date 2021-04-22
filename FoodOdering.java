/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Talha's PC
 */
public class FoodOdering implements ActionListener {
    JFrame f= new JFrame("Food Odering Management System");
    JComboBox box;
    JButton b1= new JButton("Order");
    JButton b2=new JButton("Delivered");
    JTextArea a= new JTextArea();
    JLabel l= new JLabel("Customer Name");
    JLabel l2 =new JLabel("Food Item");
    JLabel l3=new JLabel ("Price");
    JLabel l4 =new JLabel ("Address");
    JLabel l5 =new JLabel("Phone Number");
   
     JTextField f4= new JTextField();
      JTextField f5= new JTextField();
    JTextField f3= new JTextField();
    JTextField f1= new JTextField();
    
    Queue<Object> foodqueue= new LinkedList<>();
    String s1,s2,s3 ,s4,s5,s6;
    int i=0; 
    
    FoodOdering(){
        String [] food ={"Zinger","Roll","Chicken Burger"};
        box =new JComboBox(food);
        f.setSize(700,700);
    f.setLayout(null);
    f.setVisible(true);
    l.setBounds(10,10, 150,50);
    l2.setBounds(10,70, 130,50);
    l3.setBounds(10, 140,130 , 50);
    l4.setBounds(10,220 ,150,30);
    l5.setBounds(10,300 ,150,30);
    f1.setBounds(120,20,150,30);
    box.setBounds(120, 80,150,30);
    f3.setBounds(120,150,150,30);
    f4.setBounds(120, 220,150,30);
    f5.setBounds(120, 300, 150,30);
    
    b1.setBounds(340, 610,100,50);
    b2.setBounds(30,610,100,50);
     a.setBounds(1, 350,700,250);
    a.setBackground(Color.CYAN);
    f.add(l);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
f.add(f1);
f.add(box);
f.add(f3);
f.add(f4);
f.add(f5);
f.add(b1);
f.add(b2);
//a.setLayout(new GridLayout());
b1.addActionListener(this);  
b2.addActionListener(this);
f.add(a);
   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==b1){
          i++;
            s1=f1.getText();
        
        s2=(String) box.getSelectedItem();
        s3=f3.getText();
        s5=f4.getText();
        s6=f5.getText();
        s4=i+"\t"+s1+"\t"+s2+"\t"+s3+"\t"+s5+"\t"+s6+"\n";
        foodqueue.add(s4);
        a.setText(foodqueue.toString());
        f1.setText(null);
        f3.setText(null);
        f4.setText(null);
        f5.setText(null);
   }
   else if(e.getSource()==b2){
       if(foodqueue.isEmpty()){
                JOptionPane.showMessageDialog(f,"No Order is Placed Currently");
            }
            foodqueue.remove();
            a.setText(foodqueue.toString());
        }
   }
    }

