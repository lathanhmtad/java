package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLable;
	
	public MyColorView() {
		// TODO Auto-generated constructor stub
		this.myColorModel = new MyColorModel();
		this.init();
		this.setVisible(true);
	}
	
	private void init()
	{
		this.setTitle("MyColor");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font_text = new Font("Arial", Font.BOLD, 50);
		jLable = new JLabel("TEXT, .......", JLabel.CENTER);
		jLable.setFont(font_text);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		MyColorListener myColorListener = new MyColorListener(this);
		
		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.red);
		jButton_text_red.addActionListener(myColorListener);
		
		JButton jButton_text_yellow = new JButton("Yellow Text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(myColorListener);
		
		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(myColorListener);
		
		
		JButton jButton_background_red = new JButton("Red Background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.red);
		jButton_background_red.setOpaque(true);
		jButton_background_red.addActionListener(myColorListener);
		
		JButton jButton_background_yellow = new JButton("Yellow Background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.setOpaque(true);
		jButton_background_yellow.addActionListener(myColorListener);
		
		JButton jButton_background_green = new JButton("Green Background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.setOpaque(true);
		jButton_background_green.addActionListener(myColorListener);
		
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		
		this.setLayout(new BorderLayout());
		this.add(jLable, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
	}

	public void changeTextColor(Color color) {
		// TODO Auto-generated method stub
		this.jLable.setForeground(color);
	}
	
	public void changeBackgroundColor(Color color)
	{
		this.jLable.setBackground(color);
		this.jLable.setOpaque(true);
	}
}
