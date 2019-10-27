package brick;

import javax.swing.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.awt.*;
import java.sql.*;
import javax.swing.JFrame;





public class Home {

       public static void main(String[]args){
         Font f=new Font("Serif",Font.BOLD,40);
        JFrame j=new JFrame("HOME PAGE");
        JPanel heading;
        heading=new JPanel();
       
        heading.setBounds(0,0,1500,350);
        JLabel name=new JLabel("WELCOME TO BOX BREAKING");
        name.setForeground(Color.BLACK);
        name.setFont(f);
        heading.add(name);
        j.add(heading);
      
        j.setLayout(null);     
        j.setSize(1000,1000);     
        j.setVisible(true); 
       
        
        JButton b1 = new JButton("NEW USER");
        b1.setBounds(400,250,150,50);
        JButton b2 = new JButton("LOGIN");
        b2.setBounds(400,350,150,50);
        
        j.add(b1);
        j.add(b2);
        
         j.setSize(1500, 1000);
         j.setLayout(null);
	 j.setVisible(true);

        
        b1.addActionListener(new ActionListener()
               {
             public void actionPerformed(ActionEvent e)
                   {	
		      j.dispose();
		      Newuser S  = new Newuser();
		    }
             });
        
        	
    		JFrame obj = new JFrame();
            GamePlay gamePlay = new GamePlay();
            
            obj.setBounds(10, 10, 700, 600);
            obj.setTitle("Brick Breaker");
            obj.setResizable(false);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj.add(gamePlay);




}


        


       }
    






