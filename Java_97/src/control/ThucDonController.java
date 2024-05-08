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
		String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();
		
		String monPhu = "";
		Object[] luuChonMonPhu = thucDonView.jList_MonPhu.getSelectedValues();
		
		for(Object o : luuChonMonPhu) {
			monPhu += o.toString() + "; ";
		}

		
		thucDonView.thucDonModel.setLuuChon_MonChinh(monChinh);
		thucDonView.thucDonModel.setLuuChon_MonPhu(monPhu);
		thucDonView.thucDonModel.tinhTongTien();
		thucDonView.hienThiKetQua();
		
		
	}
	
}
