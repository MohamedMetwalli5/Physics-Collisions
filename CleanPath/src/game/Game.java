package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;


public class Game extends JPanel implements ActionListener,MouseListener {
	public static int difficulty = 10;
	public static int score = 0;
	Timer t = new Timer(difficulty,this);
	public static double x1 = 0, y1 = 0, velocityX1 = 30, velocityY1 = 20;
	public static double x2 = 750, y2 = 0, velocityX2 = 20, velocityY2 = 30;
	public static double x3 = 380, y3 = 500, velocityX3 = 40, velocityY3 = 20;
	public static double x4 = 50, y4 = 300, velocityX4 = 20, velocityY4 = 20;
	Ellipse2D circle1 ;
	Ellipse2D circle2 ;
	Ellipse2D circle3 ;
	Ellipse2D circle4 ;
	Rectangle2D collis1;
	
	
	 public Game() {
	        registerKeys();
	        setFocusable(true);
	    }
	 
    public void paintComponent(Graphics g){
    	try {
    		String path = "C:\\Users\\Mohamed\\Desktop\\space.jpg";
			Image img1 = ImageIO.read(new File(path));
			g.drawImage(img1, 0, 0, null);
		} catch (IOException e) {
			e.printStackTrace();
		} 
    	super.paintComponents(g);
    	Graphics2D g1 = (Graphics2D)g;
    	g1.setColor(Color.red);
    	circle1 = new Ellipse2D.Double(x1,y1,100,100);
    	g1.fill(circle1);
    	
    	super.paintComponents(g);
    	Graphics2D g2 = (Graphics2D)g;
    	g2.setColor(Color.yellow);
    	circle2 = new Ellipse2D.Double(x2,y2,100,100);
    	g2.fill(circle2);
    	
    	super.paintComponents(g);
    	Graphics2D g3 = (Graphics2D)g;
    	g3.setColor(Color.magenta);
    	circle3 = new Ellipse2D.Double(x3,y3,100,100);
    	g3.fill(circle3);
    	
    	super.paintComponents(g);
    	Graphics2D g4 = (Graphics2D)g;
    	g4.setColor(Color.CYAN);
    	circle4 = new Ellipse2D.Double(x4,y4,100,100);
    	g4.fill(circle4);

    	if(circle1.contains(circle2.getX(),circle2.getY())) {
    		System.out.println("Red and yellow");
    		super.paintComponents(g);
        	Graphics2D c1 = (Graphics2D)g;
        	c1.setColor(Color.GREEN);
        	collis1 = new Rectangle2D.Double(50,50,100,100);
        	c1.fill(collis1);
				
		}
    	
    	if(circle1.contains(circle3.getX(),circle3.getY())) {
    		System.out.println("Red and Magenta");
    		super.paintComponents(g);
        	Graphics2D c1 = (Graphics2D)g;
        	c1.setColor(Color.GREEN);
        	collis1 = new Rectangle2D.Double(50,50,100,100);
        	c1.fill(collis1);
				
		}
    	
    	if(circle1.contains(circle4.getX(),circle4.getY())) {
    		System.out.println("Red and Cyan");
    		super.paintComponents(g);
        	Graphics2D c1 = (Graphics2D)g;
        	c1.setColor(Color.GREEN);
        	collis1 = new Rectangle2D.Double(50,50,100,100);
        	c1.fill(collis1);
				
		}
    	
    	if(circle2.contains(circle3.getX(),circle3.getY())) {
    		System.out.println("Yellow and Magenta");
    		super.paintComponents(g);
        	Graphics2D c1 = (Graphics2D)g;
        	c1.setColor(Color.GREEN);
        	collis1 = new Rectangle2D.Double(50,50,100,100);
        	c1.fill(collis1);
				
		}
    	
    	if(circle2.contains(circle4.getX(),circle4.getY())) {
    		System.out.println("Yellow and Cyan");
    		super.paintComponents(g);
        	Graphics2D c1 = (Graphics2D)g;
        	c1.setColor(Color.GREEN);
        	collis1 = new Rectangle2D.Double(50,50,100,100);
        	c1.fill(collis1);
				
		}
    	
    	if(circle3.contains(circle4.getX(),circle4.getY())) {
    		System.out.println("Magenta and Cyan");
    		super.paintComponents(g);
        	Graphics2D c1 = (Graphics2D)g;
        	c1.setColor(Color.GREEN);
        	collis1 = new Rectangle2D.Double(50,50,100,100);
        	c1.fill(collis1);
				
		}
    	
    	t.start();
    	
  
    }
    

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(x1 < 0 || x1 > getWidth()-100) {
			velocityX1 = - velocityX1;	
		}
		if(y1 < 0 || y1 > getHeight()-100) {
			velocityY1 = - velocityY1;	
		}
		
		
		if(x2+100 <= 0 || x2 > getWidth()) {
			velocityX2 = - velocityX2;	
		}
		if(y2+100 <= 0 || y2 > getHeight()) {
			velocityY2 = - velocityY2;	
		}
		
		if(x3-100 <= 0 || x3 > getWidth()) {
			velocityX3 = - velocityX3;	
		}
		if(y3 <= 0 || y3 > getHeight()) {
			velocityY3 = - velocityY3;	
		}
		
		if(x4+100 <= 0 || x4 > getWidth()-100) {
			velocityX4 = - velocityX4;	
		}
		if(y4+100 <= 0 || y4 > getHeight()-100) {
			velocityY4 = - velocityY4;	
		}
		
		x1 += velocityX1;
		y1 += velocityY1;
		x2 -= velocityX2;
		y2 += velocityY2;
		x3 += velocityX1;
		y3 -= velocityY1;
		x4 += velocityX4;
		y4 += velocityY4;
		
		repaint();
	}

    
    private void registerKeys() {
        int c = JComponent.WHEN_IN_FOCUSED_WINDOW;
        getInputMap(c).put(KeyStroke.getKeyStroke("ESCAPE"), "ESCAPE");
        getActionMap().put("ESCAPE", escapeAction);
    }



    private Action escapeAction = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
    
    
    

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	


	
 }


