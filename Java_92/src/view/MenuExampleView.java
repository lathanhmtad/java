package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListener;

public class MenuExampleView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;
	
	public MenuExampleView() {
		// TODO Auto-generated constructor stub
		setTitle("Menu Example");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// Create controller
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		
		// Create menu bar
		JMenuBar jMenuBar = new JMenuBar();

		JMenu jMenu_file = new JMenu("File");
		
		// Create sub menu
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_new.addActionListener(menuExampleController);
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_open.addActionListener(menuExampleController);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		
		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_L);
		
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		setJMenuBar(jMenuBar);
		
		jPopupMenu = new JPopupMenu();
		
		JMenu jMenuPopupFont = new JMenu("Font");
		JMenuItem jMenuItemType = new JMenuItem("Type");
		JMenuItem jMenuItemSize = new JMenuItem("Size");
		jMenuPopupFont.add(jMenuItemType);
		jMenuPopupFont.add(jMenuItemSize);
		
		JMenuItem jMenuItemCut = new JMenuItem("Cut");
		JMenuItem jMenuItemCopy = new JMenuItem("Copy");
		JMenuItem jMenuItemPaste = new JMenuItem("Paste");
		
		jPopupMenu.add(jMenuPopupFont);
		jPopupMenu.add(jMenuItemCut);
		jPopupMenu.add(jMenuItemCopy);
		jPopupMenu.add(jMenuItemPaste);
		
		add(jPopupMenu);
		
		
		
		// Create ToolBar (toolbar)
		JToolBar jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.addActionListener(menuExampleController);
		jButton_Undo.setToolTipText("Nhấn vào đây để quay lại thao tác vừa rồi");
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.addActionListener(menuExampleController);
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.addActionListener(menuExampleController);
		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.addActionListener(menuExampleController);
		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.addActionListener(menuExampleController);
		
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);
		
		add(jToolBar, BorderLayout.NORTH);
		
		
		MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
		addMouseListener(menuExampleMouseListener);
		
		// Create label show
		Font font = new Font("Arial", Font.BOLD, 50);
		
		jLabel = new JLabel();
		jLabel.setFont(font);
		
		
		add(jLabel, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void setTextJLabel(String s)
	{
		jLabel.setText(s);
	}
}
