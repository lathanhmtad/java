package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

import view.ThucDonView;

public class ThucDonController implements ActionListener {
	private ThucDonView thucDonView;

	
	public ThucDonController(ThucDonView thucDonView) {
		super();
		this.thucDonView = thucDonView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String monChinh = "";
		Enumeration<AbstractButton> buttons_monChinh = thucDonView.buttonGroup_MonChinh.getElements();
		while(buttons_monChinh.hasMoreElements()) {
			AbstractButton b = buttons_monChinh.nextElement();
			if(b.isSelected()) {
				monChinh = b.getText();
			}
		}
		
		String monPhu = "";
		for (AbstractButton b : thucDonView.list_buttonGroup_MonPhu) {
			if(b.isSelected()) {
				monPhu = monPhu + b.getText() + "; ";
			}
		}
		
		thucDonView.thucDonModel.setLuuChon_MonChinh(monChinh);
		thucDonView.thucDonModel.setLuuChon_MonPhu(monPhu);
		thucDonView.thucDonModel.tinhTongTien();
		
		thucDonView.hienThiKetQua();
	}
	
}
