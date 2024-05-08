package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Student;
import view.StudentListView;

public class StudentListController implements ActionListener, MouseListener {

	private StudentListView studentListView;
	
	public StudentListController(StudentListView studentListView) {
		super();
		this.studentListView = studentListView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		
		// Xử lí sự kiện khi nhấn vào nút insert
		if(command.equals(studentListView.getBtnInsert().getText())) { 
			Student student = studentListView.getStudentInfoFromForm();
			if(student != null)
			{
				studentListView.addStudent(student);
			}
		}
		
	
//		// Xử lí khi nhấn vào nút update
//		else if(command.equals(studentListView.getBtnEdit().getText())) 
//		{
////			Student student = studentListView.getStudentInfoByForm();
//			studentListView.setUpdatedValueOnTableRow(student);
//		}
//		// Xử lí khi nhấn vào nút reset
//		else if(command.equals(studentListView.getBtnReset().getText()))
//		{
//			studentListView.deleteForm();
//		}
//		// Xử lí khi nhấn vào nút delete
//		else if(command.equals(studentListView.getBtnDelete().getText()))
//		{
//			
//		}
		
		
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Student student = studentListView.getStudentFromSelectedRow();
		studentListView.writeStudentInfoInTheForm(student);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
