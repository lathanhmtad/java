package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListCandidate {
	private ArrayList<Candidate> list;

	public ListCandidate() {
		list = new ArrayList<Candidate>();
	}

	public void readFile(String path) {
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("File không tồn tại!");
			return;
		}

		try {
			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);

			String line = null;
			while ((line = br.readLine()) != null) {
				String delim = ", ";
				String[] data = line.split(delim);

				int type = Integer.parseInt(data[0]);

				String name = data[1];
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dob = null;
				try {
					dob = sdf.parse(data[2]);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				String address = data[3];
				String hometown = data[4];
				String phone = data[5];
				String email = data[6];
				

				// Ứng viên có kinh nghiệm (Experience candidate)
				if (type == 1) {
					double numExp = Double.parseDouble(data[7]);
					
					ArrayList<String> skills = new ArrayList<String>();
					String dataSkill[] = data[8].split(",");
					for(int i = 0; i < dataSkill.length; i++) {
						skills.add(dataSkill[i]);
					}
					
					String workspace = data[9];
					
					Candidate c = new Experience(name, dob, address, hometown, phone, email, numExp, skills, workspace);
					list.add(c);
					
				}
				else if (type == 2) { // Ứng viên mới tốt nghiệp đại học hoặc cao đẳng (Fresher candidate)
					String graduationYear = data[10];
					String graded = data[11];
					String  graduationSchool = data[12];
					
					
					Candidate c = new Fresher(name, dob, address, hometown, phone, email, graduationYear, graded, graduationSchool);
					list.add(c);
					
					
				} else if (type == 3) { // Sinh viên thực tập (Intern candidate)
					String specialized = data[13];
					String semester = data[14];
					String school = data[15];
					
					Date expectedDate = null;
					try {
						expectedDate = sdf.parse(data[16]);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					Candidate c = new Intern(name, dob, address, hometown, phone, email, specialized, semester, school, expectedDate);
					list.add(c);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Lỗi đọc File!");
			e.printStackTrace();
		}
		System.out.println("Đọc file thành công!");
	}

	public void printData() {
		for (Candidate candidate : list) {
			if(candidate instanceof Experience) {
				System.out.println(((Experience) candidate).toString());
			}
			else if(candidate instanceof Fresher)
				System.out.println(((Fresher) candidate).toString());
			else if(candidate instanceof Intern)
				System.out.println(((Intern) candidate).toString());
		}
	}
}
