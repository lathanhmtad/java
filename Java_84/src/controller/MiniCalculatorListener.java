package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {
	private MiniCalculatorView miniCalculatorView;
	
	
	
	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
		// TODO Auto-generated constructor stub
		this.miniCalculatorView = miniCalculatorView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if(button.equals("+")) {
			this.miniCalculatorView.plus();
		} else if(button.equals("-")) {
			this.miniCalculatorView.minus();
		} 
		else if(button.equals("*")) {
			this.miniCalculatorView.multiply();
		}
		else if(button.equals("/")) {
			this.miniCalculatorView.divide();
		}
		else if(button.equals("^")) {
			this.miniCalculatorView.power();
		}
		else if(button.equals("%")) {
			this.miniCalculatorView.modulo();
		}
	}
}
