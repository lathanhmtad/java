package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MainView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenu menu, submenu;
	private JMenuItem i1, i2, i3, i4, i5;
	private JMenuBar mb = new JMenuBar();
	private JButton jButton;
	private JLabel jLabel;

	public MainView()
	{
		setTitle("Duy Nguyễn");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// Set Icon => JFrame
		URL urlIconNotepad = MainView.class.getResource("vn.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
		setIconImage(img);
		
		// JMenuBar
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("New");
//		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("new.png"))));
		
		i2 = new JMenuItem("Save");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save.png"))));
		
		i3 = new JMenuItem("Save As");
//		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save.png"))));
		
		i4 = new JMenuItem("Exit");
//		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("exit.jpg"))));
		
		i5 = new JMenuItem("Test");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		
		// JLabel
		jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("new.png"))));
		
		// JButton
		jButton = new JButton("TEST BUTTON");
//		jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save.png"))));
		jButton.setFont(new Font("Arial", Font.BOLD, 50));
		jButton.setSize(50, 50);
		
		setJMenuBar(mb);
		add(jLabel, BorderLayout.CENTER);
		add(jButton, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MainView();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
