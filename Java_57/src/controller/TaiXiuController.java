package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TaiXiuView;

public class TaiXiuController implements ActionListener {
	TaiXiuView taiXiuView;

	public TaiXiuController(TaiXiuView taiXiuView) {
		super();
		this.taiXiuView = taiXiuView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equalsIgnoreCase("ĐẶT CƯỢC"))
		{
			taiXiuView.showIt();
		}
	}
	
}
