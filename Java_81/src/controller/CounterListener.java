package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	CounterView counterView;                                      
	
	public CounterListener(CounterView counterView) {
		// TODO Auto-generated constructor stub
		this.counterView = counterView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String src = e.getActionCommand();

		
		if(src.equals("UP")) {
			this.counterView.increment();			
		}
		else if(src.equals("DOWN")) {
			this.counterView.decrement();
		}
		else if(src.equals("RESET"))
			this.counterView.reset();
	}

}
