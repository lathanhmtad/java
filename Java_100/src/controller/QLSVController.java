package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener {
	QLSVView qlsvView;
	
	public QLSVController(QLSVView qlsvView) {
		super();
		this.qlsvView = qlsvView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cm = e.getActionCommand();
//		JOptionPane.showMessageDialog(qlsvView, "Bạn vừa nhấn vào: " + cm);
		if(cm.equals("Thêm")) {
			qlsvView.xoaForm();
			qlsvView.qlsvModel.setLuuChon("Thêm");
		}
		else if(cm.equals("Lưu"))
		{
			try {
				// Get du lieu
				int maThiSinh = Integer.valueOf(qlsvView.textField_id.getText());
				String tenThiSinh = qlsvView.textField_HoVaTen.getText();
				int queQuan = qlsvView.comboBox_QueQuan.getSelectedIndex() - 1;
				Tinh tinh = Tinh.getTinhById(queQuan);
				Date ngaySinh = new Date(qlsvView.textField_ngaySinh.getText());
				boolean gioiTinh = true;
				if(qlsvView.radioButton_nam.isSelected()) {
					gioiTinh = true;
				}
				else if(qlsvView.radioButton_nu.isSelected())
				{
					gioiTinh = false;
				}
				
				float diemMon1 = Float.valueOf(qlsvView.textField_Mon1.getText());
				float diemMon2 = Float.valueOf(qlsvView.textField_Mon2.getText());
				float diemMon3 = Float.valueOf(qlsvView.textField_Mon2.getText());
				ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
				
				qlsvView.themHoacCapNhapThiSinh(ts);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(cm.equals("Cập nhập"))
		{
			
			qlsvView.hienThiThongTinThiSinhDaChon();
		}
		else if(cm.equals("Xóa"))
		{
			qlsvView.thucHienXoa();
		}
	}
	
	

}
