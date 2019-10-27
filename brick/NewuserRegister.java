package brick;


	import javax.swing.*; 
	import java.awt.event.*;
	import java.awt.*;
	import java.io.*; 
	import java.util.*;

	public class NewuserRegister{
	    JFrame Newuserregister;
	public NewuserRegister() {
	         Font f=new Font("Serif",Font.BOLD,40);
	   Newuserregister =new JFrame("Registration");
	   JPanel heading2;
	   heading2=new JPanel();
	   heading2.setBounds(0,0,1000,50);
	   JLabel name = new JLabel("REGISTRATION");
	    name.setForeground(Color.BLACK);
	        name.setFont(f);
	        heading2.add(name);
	        Newuserregister.add(heading2);
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	  l1=new JLabel(" Name");
	     l1.setBounds(400,100,150,50);
	  l2=new JLabel("Username");
	     l2.setBounds(400,150,150,50);
	     
	  JPasswordField value = new JPasswordField();   
	  l3=new JLabel("Password");
	     l3.setBounds(400,200,150,50);
	     value.setBounds(570,210,300,30);
	  
	  l4=new JLabel("Email ID");
	     l4.setBounds(400,250,150,50);
	  l5=new JLabel("Date Of Birth");
	     l5.setBounds(400,300,150,50);
	  l6=new JLabel("Mobile number");
	     l6.setBounds(400,350,150,50);
	  l7=new JLabel("Type of Newuser");
	     l7.setBounds(400, 400, 150, 50);
	  l8=new JLabel("Gender");
	     l8.setBounds(400,450,150,50);
	     ButtonGroup G1;
	     G1=new ButtonGroup();
	  JRadioButton rb1,rb2;
	       rb1=new JRadioButton("Male");
	       rb1.setBounds(590, 465 , 87, 25);
	       
	       rb2=new JRadioButton("Female");
	       rb2.setBounds(750,465, 87, 25);
	       
	       G1.add(rb1);
	       G1.add(rb2);
	  
	      
	 Newuserregister.add(l1);
	 Newuserregister.add(l2);
     Newuserregister.add(l3);
	 Newuserregister.add(l4);
	 Newuserregister.add(l5);
	 Newuserregister.add(l6);
	 Newuserregister.add(l7);
	 Newuserregister.add(l8);
	 Newuserregister.add(rb1);
	 Newuserregister.add(rb2);
	 Newuserregister.add(value);
	 
	 
	 
	 
	  
	   JTextField t0,t1,t2,t3,t4,t5,t6;
	    t0=new JTextField(" ");
	        t0.setBounds(570,110,300,30);
	   t1=new JTextField(" ");
	        t1.setBounds(570,160,300,30);
	    
	    t3=new JTextField(" ");
	        t3.setBounds(570,260,300,30);
	    t4=new JTextField(" ");
	        t4.setBounds(570,310,300,30);
	    t5=new JTextField(" ");
	        t5.setBounds(570,360,300,30);
	    t6=new JTextField(" ");
	        t6.setBounds(570,410,300,30);
	       
	          Newuserregister.add(t0);
	          Newuserregister.add(t1);
	          Newuserregister.add(t3);
	          Newuserregister.add(t4);
	          Newuserregister.add(t5);
	          Newuserregister.add(t6);
	            
	          
	           JButton B1= new JButton("Register");
	              B1.setBounds(450,550,150,30);
	    
	           JButton B2 = new JButton("Cancel");
	               B2.setBounds(660,550,150,30);
	               
	         Newuserregister.add(B1);
	         Newuserregister.add(B2);
	          
	         Newuserregister.setSize(1500, 1000);
	         Newuserregister.setLayout(null);
	         Newuserregister.setVisible(true);
	 
	          B2.addActionListener(new ActionListener()
	               {
	             public void actionPerformed(ActionEvent e)
	                   {	
			      Newuserregister.dispose();
			    }
	             });

	           B1.addActionListener(new ActionListener()
	               {
	             public void actionPerformed(ActionEvent e)
	                   {	
			      Newuserregister.dispose();
			       JOptionPane.showMessageDialog(Newuserregister,"Registration Successfull");
			    }
	             });
	 }
	}




