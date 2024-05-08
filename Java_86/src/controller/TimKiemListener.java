package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TimKiemView;

public class TimKiemListener implements ActionListener {
	private TimKiemView timKiemView;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timKiemView.timKiem();
	}
	
	public TimKiemListener(TimKiemView timKiemView) {
		// TODO Auto-generated constructor stub
		this.timKiemView = timKiemView;
	}
}
