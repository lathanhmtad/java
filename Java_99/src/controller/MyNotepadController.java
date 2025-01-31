package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener {
	MyNotepadView myNotepadView;
	
	
	
	public MyNotepadController(MyNotepadView myNotepadView) {
		super();
		this.myNotepadView = myNotepadView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		JFileChooser jfc = new JFileChooser();
		if(command.equalsIgnoreCase("open"))
		{
			int returnVal = jfc.showOpenDialog(myNotepadView);
			if(returnVal == JFileChooser.APPROVE_OPTION)
			{
				File file = jfc.getSelectedFile();
				String fileName = file.getName();
				myNotepadView.myNotepadModel.setFileName(file.getAbsolutePath());
				myNotepadView.lblNewLabel.setText(myNotepadView.myNotepadModel.getFileName());
				if(fileName.endsWith(".txt"))
				{
					
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						for(String line : allText)
						{
							result += line;
							result += "\n";
						}
						myNotepadView.myNotepadModel.setContent(result);
						myNotepadView.textArea.setText(myNotepadView.myNotepadModel.getContent());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						
					
				}
			}
		} 
		else if(command.equalsIgnoreCase("save"))
		{
			if(myNotepadView.myNotepadModel.getFileName().length() > 0)
			{
				save(myNotepadView.myNotepadModel.getFileName());
			}
			else
			{
				int returnVal = jfc.showSaveDialog(myNotepadView);
				if(returnVal == JFileChooser.APPROVE_OPTION)
				{
					File file = jfc.getSelectedFile();
					save(file.getAbsolutePath());
				}
				
			}
		}
	}
	
	public void save(String fileName)
	{
		PrintWriter pw;
		try {
			pw = new PrintWriter(fileName, "UTF-8");
			String data = myNotepadView.textArea.getText();
			pw.print(data);					
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
