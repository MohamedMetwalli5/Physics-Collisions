package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Information extends JFrame{
	JFrame f1 = new JFrame();
    JPanel p1 = new JPanel();
    JLabel l = new JLabel();
   
    public Information() {
        this.setSize(800, 800);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(330, 20);
        this.setTitle("Physics Collisions");
        p1.setSize(800, 800);
        p1.setBackground(Color.blue);
        p1.setLayout(null);
        
        l = new JLabel("<html>My name is Mohamed Metwalli , I created this program on 22/10/2020  :) <br>And this is a simple program that applies Newton's third law with the frame edges and to detect collisions between objects using three objects . <br>The fourth object i used it for the other function of the program which is the collisons detection only .</html>");	 
	    l.setBounds(30, 100, 540, 150);
	    l.setBackground(Color.blue);	
	    l.setForeground(Color.GREEN);
	    l.setFont(new Font("atilic",Font.BOLD,15));
	      
	    p1.add(l);
	    this.add(p1);
	   
	    
    }
    
    
    
    
}
