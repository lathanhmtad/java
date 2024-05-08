package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jBtn_up;
	private JButton jBtn_down;
	private JLabel jLabel_value;
	private JButton jBtn_reset;
	
	public CounterView() {
		// TODO Auto-generated constructor stub
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init()
	{
		this.setTitle("Couter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new CounterListener(this);
		
		jBtn_up = new JButton("UP");
		jBtn_up.addActionListener(al);
		
		jBtn_down = new JButton("DOWN");
		jBtn_down.addActionListener(al);
		
		jBtn_reset = new JButton("RESET");
		jBtn_reset.addActionListener(al);
		
		jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		
		jPanel.add(jBtn_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jBtn_down, BorderLayout.EAST);
		jPanel.add(jBtn_reset, BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	
	public void increment()
	{
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
	
	public void decrement()
	{
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
	
	public void reset()
	{
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
}
