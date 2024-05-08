package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JPanelDraw() {
		// TODO Auto-generated constructor stub
		setBackground(Color.white);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawLine(15, 15, 50, 150);
		
		g.setColor(Color.GREEN);
		g.drawOval(255, 255, 50, 50);
		
		g.setColor(Color.red);
		g.drawRect(45, 150, 30, 90);
		
		g.setColor(Color.PINK);
		g.fillOval(400, 300, 50, 50);
		
		g.setColor(Color.GRAY);
		g.fillRect(100, 300, 250, 200);
		
		g.setColor(Color.YELLOW);
		g.drawString("HELLO TITV", 250, 250);
	}
	
	
	
}
