package test;

import javax.swing.UIManager;

import view.LastButtonView;

public class Test {
	public static void main(String[] args) {
		new LastButtonView();
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
