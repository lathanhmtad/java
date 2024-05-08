package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import controller.StudentListController;
import model.Province;
import model.Student;
import model.User;

import javax.swing.JRadioButton;

public class StudentListView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField idFilterField;
	private JComboBox<String> addressFilterComboBox;
	private JTable table;
	private JTextField idField;
	private JTextField nameField;
	private JComboBox<String> addressComboBox;
	private JTextField dobField;
	private JTextField mathField;
	private JTextField physicalField;
	private JTextField chemistryField;
	private JRadioButton radioBtnMale;
	private JRadioButton radioBtnFemale;
	private ButtonGroup buttonGroupGender;
	
	private ActionListener actionListener;

	private JButton btnInsert;
	private JButton btnDelete;
	private JButton btnEdit;
	private JButton btnCancel;
	private JButton btnReset;
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentListView frame = new StudentListView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JButton getBtnInsert() {
		return btnInsert;
	}
	
	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JButton getBtnReset() {
		return btnReset;
	}

	/**
	 * Create the frame.
	 */
	public StudentListView() {
		actionListener = new StudentListController(this);
		initComponents();
		
		setVisible(true);
	}
	
	
	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1150, 800);
		setLocationRelativeTo(null);
		
		// Khởi tạo thành phần chứa cả chương trình
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Khởi tạo phần menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuItemOpen = new JMenuItem("Open...");
		menuItemOpen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFile.add(menuItemOpen);
		
		JMenuItem menuItemClose = new JMenuItem("Close...");
		menuItemClose.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFile.add(menuItemClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuItemExit = new JMenuItem("Exit...");
		menuItemExit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFile.add(menuItemExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuItemAboutMe = new JMenuItem("About me...");
		menuItemAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuAbout.add(menuItemAboutMe);
		
		
		// Khởi tạo phần lọc thông tin sinh viên
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(153, 24, 983, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Student Filter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(44, 10, 132, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Birth place");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 55, 86, 22);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 24, 28, 2);
		contentPane.add(separator_2);
		
		addressFilterComboBox = new JComboBox<String>(Province.getListOfProvinceNames());
		addressFilterComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressFilterComboBox.setBounds(106, 45, 260, 40);
		contentPane.add(addressFilterComboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(430, 55, 90, 22);
		contentPane.add(lblNewLabel_1_1);
		
		idFilterField = new JTextField();
		idFilterField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		idFilterField.setBounds(530, 45, 260, 40);
		contentPane.add(idFilterField);
		idFilterField.setColumns(10);
		
		JButton btnFilter = new JButton("Filter");
		btnFilter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnFilter.setBounds(888, 43, 166, 40);
		contentPane.add(btnFilter);
		
		
		// Khởi tạo bảng chứa thông tin sinh viên
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 109, 1126, 2);
		contentPane.add(separator_1_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 131, 28, 2);
		contentPane.add(separator_2_1);
		
		JLabel lblList = new JLabel("List Student");
		lblList.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblList.setBounds(44, 121, 132, 25);
		contentPane.add(lblList);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(153, 131, 983, 2);
		contentPane.add(separator_1_2);
		
		table = new JTable();
		table.addMouseListener((MouseListener) actionListener);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"ID", "Name", "Address", "Date", "Gender", "Math", "Physical", "Chemistry"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBounds(0, 0, 10, 10);
		contentPane.add(table);
		
		table.setRowHeight(24);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 156, 1116, 304);
		contentPane.add(scrollPane);
		
		
		// Khởi tạo các trường nhập dữ liệu cho thông tin sinh viên
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(199, 484, 937, 2);
		contentPane.add(separator_1_3);
		
		JLabel lblStudentInfomation = new JLabel("Student Infomation");
		lblStudentInfomation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentInfomation.setBounds(44, 470, 158, 22);
		contentPane.add(lblStudentInfomation);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(10, 484, 28, 2);
		contentPane.add(separator_2_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(10, 506, 90, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		idField = new JTextField();
		idField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		idField.setColumns(10);
		idField.setBounds(121, 502, 260, 30);
		contentPane.add(idField);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(10, 547, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameField.setColumns(10);
		nameField.setBounds(121, 543, 260, 30);
		contentPane.add(nameField);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Address");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(10, 587, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		addressComboBox = new JComboBox<String>(Province.getListOfProvinceNames());
		addressComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressComboBox.setBounds(121, 583, 260, 30);
		contentPane.add(addressComboBox);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Date of birth");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3.setBounds(10, 625, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		dobField = new JTextField();
		dobField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dobField.setColumns(10);
		dobField.setBounds(121, 621, 260, 30);
		contentPane.add(dobField);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Math");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_4.setBounds(582, 547, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		mathField = new JTextField();
		mathField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mathField.setColumns(10);
		mathField.setBounds(693, 536, 260, 30);
		contentPane.add(mathField);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Physical");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(582, 587, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		physicalField = new JTextField();
		physicalField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		physicalField.setColumns(10);
		physicalField.setBounds(693, 577, 260, 30);
		contentPane.add(physicalField);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Chemistry");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBounds(582, 625, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		chemistryField = new JTextField();
		chemistryField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chemistryField.setColumns(10);
		chemistryField.setBounds(693, 617, 260, 30);
		contentPane.add(chemistryField);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Gender");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_5.setBounds(582, 506, 90, 22);
		contentPane.add(lblNewLabel_1_1_1_5);
		
		radioBtnMale = new JRadioButton("Male");
		radioBtnMale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioBtnMale.setBounds(693, 507, 103, 21);
		contentPane.add(radioBtnMale);
		
		radioBtnFemale = new JRadioButton("Female");
		radioBtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioBtnFemale.setBounds(806, 507, 103, 21);
		contentPane.add(radioBtnFemale);
		
		buttonGroupGender = new ButtonGroup();
		buttonGroupGender.add(radioBtnMale);
		buttonGroupGender.add(radioBtnFemale);
		
		JSeparator separator_1_3_1 = new JSeparator();
		separator_1_3_1.setBounds(10, 672, 1126, 2);
		contentPane.add(separator_1_3_1);
		
		
		// Tạo ra các nút chức năng cho chương trình
		btnInsert = new JButton("Insert");
		btnInsert.addActionListener(actionListener);
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnInsert.setBounds(10, 684, 140, 38);
		contentPane.add(btnInsert);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(actionListener);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(250, 684, 140, 38);
		contentPane.add(btnDelete);
		
		btnEdit = new JButton("Update");
		btnEdit.addActionListener(actionListener);
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(491, 684, 140, 38);
		contentPane.add(btnEdit);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(actionListener);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(720, 684, 140, 38);
		contentPane.add(btnReset);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(actionListener);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(986, 684, 140, 38);
		contentPane.add(btnCancel);
	}


	public void deleteForm()
	{
		idField.setText("");
		nameField.setText("");
		dobField.setText("");
		mathField.setText("");
		physicalField.setText("");
		addressComboBox.setSelectedItem(null);
		buttonGroupGender.clearSelection();
		chemistryField.setText("");
	}

	public Student getStudentInfoFromForm()
	{
		String id = idField.getText();
		String name = nameField.getText();
		String address = addressComboBox.getSelectedItem().toString();
		String dob = dobField.getText();
		String math = mathField.getText();
		String physical = physicalField.getText();
		String chemistry = chemistryField.getText();
		
		if(!validateId(id) || !validateName(name) || !validateAddress(address) || !validateDob(dob) || !validateGender() || !validateScore(math) || !validateScore(physical) || !validateScore(chemistry))
			return null;
		
		boolean gender = true;
		if(radioBtnFemale.isSelected())
			gender = false;
		
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setProvince(Province.getProvinceByName(address));
		student.setDateOfBirth(dob);
		student.setGender(gender);
		student.setMath(Float.valueOf(math));
		student.setPhysical(Float.valueOf(physical));
		student.setChemistry(Float.valueOf(chemistry));
		
		return student;
	}
	
	

	public void addStudent(Student student)
	{
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		model.addRow(new Object[] {student.getId(), student.getName(), student.getProvince().getName(), student.getDateOfBirth(), student.getGender(), student.getMath(), student.getPhysical(), student.getChemistry()});
		
		deleteForm();
		
	}
	
	public Student getStudentFromSelectedRow()
	{
//		int row = dataTable.getSelectedRow();
//	
//		String id = dataTable.getModel().getValueAt(row, 0).toString();
//		String name = dataTable.getModel().getValueAt(row, 1).toString();
//		Province province = Province.getProvinceByName(dataTable.getModel().getValueAt(row, 2).toString());
//		String dateOfBirthStr = dataTable.getModel().getValueAt(row, 3).toString();
//		
//		boolean gender = true;
//		if(dataTable.getModel().getValueAt(row, 4).toString().equals("Nữ"))
//			gender = false;
//			
//		float math = Float.valueOf(dataTable.getModel().getValueAt(row, 5).toString());
//		float physical = Float.valueOf(dataTable.getModel().getValueAt(row, 6).toString());
//		float chemistry = Float.valueOf(dataTable.getModel().getValueAt(row, 7).toString());
//		
//		Student student = new Student(id, name, province, null, gender, math, physical, chemistry);
//		student.setDateOfBirth(dateOfBirthStr);
//		
//		return student;
//		
		return null;
	}
	
	public void writeStudentInfoInTheForm(Student student)
	{
//		textFieldInfoStudentId.setText(student.getId());
//		textFieldInfoName.setText(student.getName());
//		comboBoxInfoAddress.setSelectedItem(student.getProvince().getName());
//		textFieldInfoDateOfBirth.setText(student.getDateOfBirth());
//		
//		if(student.isGender())
//			radioBtnMale.setSelected(true);
//		else
//			radioBtnFemale.setSelected(true);
//		
//		textFieldInfoMath.setText(student.getMath() + "");
//		textFieldInfoPhysical.setText(student.getPhysical() + "");
//		textFieldInfoChemistry.setText(student.getChemistry() + "");	
	}
	
	public void setUpdatedValueOnTableRow(Student student)
	{
//		dataTable.setValueAt(student.getId(), dataTable.getSelectedRow(), 0);
//		dataTable.setValueAt(student.getName(), dataTable.getSelectedRow(), 1);
//		dataTable.setValueAt(student.getProvince().getName(), dataTable.getSelectedRow(), 2);
//		dataTable.setValueAt(student.getDateOfBirth(), dataTable.getSelectedRow(), 3);
//		dataTable.setValueAt(student.getGender(), dataTable.getSelectedRow(), 4);
//		dataTable.setValueAt(student.getMath(), dataTable.getSelectedRow(), 5);
//		dataTable.setValueAt(student.getPhysical(), dataTable.getSelectedRow(), 6);
//		dataTable.setValueAt(student.getChemistry(), dataTable.getSelectedRow(), 7);
		
//		studentListModel.update(student);
		
	}

	
	
	
	private void showMessage(String mess, String type)
	{
		if(type.equals("Error"))
			JOptionPane.showMessageDialog(this, mess, "Thông báo lỗi!", JOptionPane.ERROR_MESSAGE);
		else if(type.equals("Warning"))
			JOptionPane.showMessageDialog(this, mess, "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
		else
		{
			
		}
	}
	
	private boolean validateId(String id)
	{
		id = id.trim();
		if(id.equals(""))
		{
			showMessage("Trường id không được bỏ trống", "Error");
			return false;
		}
		return !id.equals(""); 
	}
	
	private boolean validateName(String name)
	{
		name = name.trim();
//		String expression = "^[A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*(?:[ ][A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*)*$"; 
//		
//		if(!name.matches(expression))
//		{
//			showMessage("Vui lòng nhập lại tên", "Error");
//			return false;
//		}
		if(name.equals(""))
		{
			showMessage("Vui lòng nhập lại tên", "Error");
			return false;
		}
		return true;
	}
	
	private boolean validateAddress(String address)
	{
		address = address.trim();
		if(address.equals(""))
		{
			showMessage("Vui lòng chọn 1 địa chỉ", "Error");
			return false;
		}
		return true;
	}
	
	private boolean validateDob(String str)
	{
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			sdf.setLenient(false);
			sdf.parse(str);
		} 
		catch(ParseException e)
		{
			showMessage("Vui lòng nhập ngày sinh theo định dạng dd/mm/yyyy ví dụ: 2/2/2003", "Error");
			return false;
		}
		return true;
	}
	
	private boolean validateGender()
	{
		if(radioBtnMale.isSelected() || radioBtnFemale.isSelected())
			return true;
		showMessage("Vui lòng chọn 1 giới tinh", "Error");
		return false;
	}
	
	private boolean validateScore(String str)
	{
		float x;
		try {
			x = Float.valueOf(str);
			if(x > 10 || x < 0)
			{
				showMessage("Điểm nhập sai!", "Error");
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			showMessage("Điểm nhập sai!", "Error");
			return false;
		}
		return true;
	}
	
	
	public void showManagement(User user)
	{
		setTitle("Project: Quản lý sinh viên, Tài khoản: " + user.getAccount() + ", Tên người dùng: " + user.getUsername());
		setVisible(true);
	}
}



	













