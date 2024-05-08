package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.TaiXiuController;
import model.TaiXiuModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;



public class TaiXiuView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private TaiXiuController taiXiuController = new TaiXiuController(this);
	private TaiXiuModel taiXiuModel = new TaiXiuModel();
	private JLabel jLabelInfoMoney;
	private JLabel jLabelShowResult;
	private JLabel showInputMoney;
	private JLabel showInputOptions;
	private JLabel tease;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaiXiuView frame = new TaiXiuView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TaiXiuView() {
		setTitle("Trò chơi nhỏ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 650);
		setLocationRelativeTo(null);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel wrapper = new JPanel();
		wrapper.setBounds(5, 5, 1136, 603);
		contentPane.add(wrapper);
		wrapper.setLayout(null);
		
		JLabel title = new JLabel("TR\u00D2 CH\u01A0I T\u00C0I X\u1EC8U", SwingConstants.CENTER);
		title.setBounds(0, 10, 1160, 24);
		title.setForeground(new Color(255, 0, 0));
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		wrapper.add(title);
		
		JPanel accInfo = new JPanel();
		accInfo.setBounds(0, 44, 1160, 50);
		wrapper.add(accInfo);
		accInfo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel jLabelTitle = new JLabel("T\u00E0i kho\u1EA3n hi\u1EC7n t\u1EA1i c\u1EE7a b\u1EA1n: ");
		jLabelTitle.setFont(new Font("Arial", Font.ITALIC, 20));
		accInfo.add(jLabelTitle);
		
		jLabelInfoMoney = new JLabel(taiXiuModel.getAccountIsFormatted());
		jLabelInfoMoney.setForeground(new Color(255, 0, 128));
		jLabelInfoMoney.setFont(new Font("Arial", Font.PLAIN, 40));
		accInfo.add(jLabelInfoMoney);
		
		JPanel content = new JPanel();
		content.setBounds(0, 110, 1160, 500);
		wrapper.add(content);
		content.setLayout(null);
		
		JButton placeABetBtn = new JButton("\u0110\u1EB6T C\u01AF\u1EE2C");
		placeABetBtn.addActionListener(taiXiuController);
		placeABetBtn.setBackground(new Color(128, 0, 255));
		placeABetBtn.setForeground(new Color(255, 255, 255));
		placeABetBtn.setFont(new Font("Arial", Font.PLAIN, 32));
		placeABetBtn.setBounds(439, 36, 250, 60);
		content.add(placeABetBtn);
		
		JPanel contentResult = new JPanel();
		contentResult.setBounds(0, 323, 1160, 53);
		content.add(contentResult);
		contentResult.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel jLabelResult = new JLabel("Kết quả: ");
		jLabelResult.setFont(new Font("Arial", Font.PLAIN, 25));
		contentResult.add(jLabelResult);
		
		jLabelShowResult = new JLabel("");
		jLabelShowResult.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentResult.add(jLabelShowResult);
		
		JLabel lblNewLabel = new JLabel("Số tiền đặt cược đã nhập: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(260, 184, 350, 35);
		content.add(lblNewLabel);
		
		showInputMoney = new JLabel("");
		showInputMoney.setForeground(new Color(255, 0, 0));
		showInputMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		showInputMoney.setBounds(620, 179, 170, 40);
		content.add(showInputMoney);
		
		JLabel lblKtQuNhpj = new JLabel("Kết quả nhập: ");
		lblKtQuNhpj.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblKtQuNhpj.setBounds(260, 246, 350, 35);
		content.add(lblKtQuNhpj);
		
		showInputOptions = new JLabel("");
		showInputOptions.setForeground(Color.RED);
		showInputOptions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		showInputOptions.setBounds(620, 241, 170, 40);
		content.add(showInputOptions);
		
		tease = new JLabel("", SwingConstants.CENTER);
		tease.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tease.setBounds(0, 393, 1160, 50);
		content.add(tease);
		
		
		
		setVisible(true);
	}
	
	public void showIt()
	{
		String money = (String) JOptionPane.showInputDialog("Bạn muốn đặt cược bao nhiêu: ");
		if(Double.valueOf(money) > 0 && Double.valueOf(money) <= taiXiuModel.getAccount())
		{
			taiXiuModel.setPlaceABet(Double.valueOf(money));
			showInputMoney.setText(money);
			String options = (String) JOptionPane.showInputDialog("Mày cược TÀI hay XỈU");
			showInputOptions.setText(options);
			taiXiuModel.setOption(options);
			String log = taiXiuModel.handleResultRollTheDice();
			jLabelShowResult.setText(taiXiuModel.getResult());
			tease.setText(log);
			jLabelInfoMoney.setText(taiXiuModel.getAccountIsFormatted());
		}
		else
		{
			JOptionPane.showMessageDialog(contentPane, "Tiền thì đéo có mà đòi nhập nhìu hả mày!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}	
	

	
	
	
	
	
	
	
	
}
