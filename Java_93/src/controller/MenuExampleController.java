package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		super();
		this.menuExampleView = menuExampleView;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if(button.equals("Exit"))
			System.exit(0);
		else if(button.equals("Toolbar"))
		{
			AbstractButton checkBox = (AbstractButton) e.getSource();
			boolean check = checkBox.getModel().isSelected();
			if(check)
				menuExampleView.enableToolbar();
			else
				menuExampleView.disableToolbar();
		}
		else
			 menuExampleView.setTextJLabel("Bạn đã click: " + button);
	}
	
	
	
}
