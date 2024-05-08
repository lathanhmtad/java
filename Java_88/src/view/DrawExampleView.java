package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawExampleView() {
		// TODO Auto-generated constructor stub
		setTitle("Draw Example");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanelDraw jPanelDraw = new JPanelDraw();
		
		setLayout(new BorderLayout());
		add(jPanelDraw, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawExampleView();
	}
}
