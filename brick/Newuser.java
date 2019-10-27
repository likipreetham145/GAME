package brick;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*; 
import java.util.*;

public class Newuser {

	

	
	    JFrame Newuser;
	    
	    public Newuser()
	    {
	         Font f=new Font("Serif",Font.BOLD,40);
	   Newuser =new JFrame("Newuser Login");
	   JPanel heading3;
	   heading3=new JPanel();
	   heading3.setBounds(0,0,1050,50);
	   JLabel name = new JLabel("Newuser Login");
	    name.setForeground(Color.BLACK);
	        name.setFont(f);
	        heading3.add(name);
	        Newuser.add(heading3);
	        
	        
	        JLabel s1,s2,s3;
	          s1=new JLabel("Username");
	          s1.setBounds(400,300,150,30);
	          
	         JPasswordField val = new JPasswordField();
	          s2=new JLabel("Password");
	          s2.setBounds(400,350,150,30);
	          val.setBounds(500,360,150,30);
	          
	          Newuser.add(s1);
	          Newuser.add(s2);
	          
	          JTextField S1;
	          S1=new JTextField(" ");
	          S1.setBounds(500,300,150,30);
	          
	          
	          
	         Newuser.add(S1);
	         
	      Newuser.add(val);
	          
	          JButton jb1 = new JButton("Login");
	            jb1.setBounds(450,450,100,30);
	          
	          JButton jb2= new JButton("Signup");
	            jb2.setBounds(450,550,100,30);
	            
	            Newuser.add(jb1);
	            Newuser.add(jb2);
	            
	             jb2.addActionListener(new ActionListener()
	               {
	             public void actionPerformed(ActionEvent e)
	                   {	
			      Newuser.dispose();
			      NewuserRegister SR=new NewuserRegister();
			    }
	             });
	             
	              jb1.addActionListener(new ActionListener()
	               {
	             public void actionPerformed(ActionEvent e)
	                   {	
			     Newuser.dispose();
			       JOptionPane.showMessageDialog(Newuser,"LOGIN SUCCESSFUL");
			    }
	             });
	            
	             
	        Newuser.setSize(1500,1000);
	       Newuser.setLayout(null);
	       Newuser.setVisible(true);
	            
	    } 
	    
	}






