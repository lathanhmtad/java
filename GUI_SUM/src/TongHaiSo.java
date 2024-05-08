import java.awt.*;
import java.awt.event.*;


public class TongHaiSo extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Label lbeA, lbeB, lbeT;
	private TextField txtA, txtB, txtT;
	private Button btnTinh;
	
	public TongHaiSo() {
		this.setSize(300, 300);
		this.setLayout(null);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		lbeA = new Label("So A");
		this.add(lbeA);
		lbeA.setBounds(30, 60, 50, 20);
		
		lbeB = new Label("So B");
		this.add(lbeB);
		lbeB.setBounds(30, 90, 50, 20);
		
		lbeT = new Label("Tong");
		this.add(lbeT);
		lbeT.setBounds(30, 120, 50, 20);
		
		txtA = new TextField();
		this.add(txtA);
		txtA.setBounds(100, 60, 100, 20);
		
		txtB = new TextField();
		this.add(txtB);
		txtB.setBounds(100, 90, 100, 20);
		
		txtT = new TextField();
		this.add(txtT);
		txtT.setBounds(100, 120, 100, 20);
		
		btnTinh = new Button("Tinh");
		this.add(btnTinh);
		btnTinh.setBounds(150, 150, 100, 20);
		
		btnTinh.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int A = Integer.parseInt(txtA.getText());
		int B = Integer.parseInt(txtB.getText());
		int T = A + B;
		txtT.setText(String.valueOf(T));
		
		
		
	}
	
	
}
