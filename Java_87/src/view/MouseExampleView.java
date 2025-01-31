package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouseExampleModel;

public class MouseExampleView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MouseExampleModel model;
	private JPanel jPanel_mouse;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count;
	private JLabel jLabel_count_value;
	private JLabel jLabel_empty_1;
	private JLabel jLabel_check_in;
	private JLabel jLabel_check_in_value;
	private JLabel jLabel_empty_2;

	private JLabel jLabel_position;

	public MouseExampleView() throws HeadlessException {
		super();
		model = new MouseExampleModel();
		init();
	}
	
	private void init()
	{
		setTitle("MOUSE EXAMPLE");
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		MouseExampleController mouseExampleController = new MouseExampleController(this);
		
		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.cyan);
		jPanel_mouse.addMouseListener(mouseExampleController);
		jPanel_mouse.addMouseMotionListener(mouseExampleController);
		
		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3,3));
		
		Font font = new Font("Arial", Font.BOLD, 25);
		
		jLabel_position = new JLabel("Position: ");
		jLabel_position.setFont(font);
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y = new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_count = new JLabel("Numbers of clicks: ");
		jLabel_count.setFont(font);
		jLabel_count_value = new JLabel();
		jLabel_count_value.setFont(font);
		jLabel_empty_1 = new JLabel();
		jLabel_check_in = new JLabel("Mouse is in component: ");
		jLabel_check_in.setFont(font);
		jLabel_check_in_value = new JLabel("No");
		jLabel_check_in_value.setFont(font);
		jLabel_empty_2 = new JLabel();
		
		
		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty_1);
		jPanel_info.add(jLabel_check_in);
		jPanel_info.add(jLabel_check_in_value);
		jPanel_info.add(jLabel_empty_2);
		
		
		
		setLayout(new BorderLayout());
		add(jPanel_mouse, BorderLayout.CENTER);
		add(jPanel_info, BorderLayout.SOUTH);
		
		
		
		setVisible(true);
	}
	
	public void addclick()
	{
		model.addclick();
		jLabel_count_value.setText(model.getCount() + "");
	}
	
	public void enter()
	{
		model.enter();
		jLabel_check_in_value.setText(model.getCheckIn());
	}
	
	public void exit()
	{
		model.exit();
		jLabel_check_in_value.setText(model.getCheckIn());
	}


	public void update(int x, int y)
	{
		model.setX(x);
		model.setY(y);
		jLabel_x.setText(model.getX() + "");
		jLabel_y.setText(model.getY() + "");
	}
}
