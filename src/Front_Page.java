/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import java.lang.Thread;
/**
 *
 * @author Reshma
 */
 abstract class Front_Page implements ActionListener{
    JFrame f;
    JLabel id,ll;
    JButton b;
    
    Front_Page(){
        
        f=new JFrame("Examination Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel ll= new JLabel(i3);
        
        ll.setBounds(0,150,1360,530);
        f.add(ll);
        
        b=new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        
        
        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
        JLabel lid=new JLabel("EXAMINATION MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(lid);
        
        id.add(b);
        f.add(id);
        
        f.getContentPane().setBackground(Color.WHITE);
        
        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
        
        while(true){
            boolean False = false;
            lid.setVisible(False);
            try{
                Thread.sleep(500); //1000=1 sec
            }catch(Exception e){
                lid.setVisible(true);
            }
            try{
                Thread.sleep(500);
            }catch(Exception e){}
            
        }
        
       }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            boolean False = false;
            f.setVisible(False);
            //new login();
        }
    }
    
    public static void main(String args[]){
        Front_Page f = new Front_Page() {};
    }
   
        }
                     
    
    
    

