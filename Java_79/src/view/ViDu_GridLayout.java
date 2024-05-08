package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
	public ViDu_GridLayout() {
		// TODO Auto-generated constructor stub
	
		this.setTitle("ViDu_GridLayout");
		this.setSize(600,400);
		
		// Căn giữa cửa số chương trình
		this.setLocationRelativeTo(null);
		
		// Set layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_2 = new GridLayout(4,4);
		GridLayout gridLayout_3 = new GridLayout(4,4,4,25);
		
//		this.setLayout(gridLayout);
		
		this.setLayout(gridLayout_3);
		
		for (int i = 0; i < 14; i++) {
			JButton jButton = new JButton(i + "");
			this.add(jButton);
		}
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
}