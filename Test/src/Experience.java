import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Experience extends Employee {
	private int numExp;
	private ArrayList<String> skill;
	private String workspace;
	
	public Experience() {
		super();
	}

	public Experience(String code, String fullName, Date birthday, String address, String hometown, String phoneNumber,
			String email, int numExp, ArrayList<String> skill, String workspace) {
		super(code, fullName, birthday, address, hometown, phoneNumber, email);
		this.numExp = numExp;
		this.skill = skill;
		this.workspace = workspace;
	}

	public int getNumExp() {
		return numExp;
	}

	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}

	public ArrayList<String> getSkill() {
		return skill;
	}

	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}
	
	public void inputData() {
		super.inputData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of experience: ");
		this.numExp = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter workspace: ");
		this.workspace = sc.nextLine();
		this.skill = new ArrayList<String>();
		char t = 'y';
		while (t == 'y' || t == 'Y') {
			System.out.println();
			System.out.print("- Enter skill: ");
			String sk = sc.nextLine();
			this.skill.add(sk);
			System.out.print("Nhan y/Y de tiep tuc nhap skill, bat ki de ket thuc: ");
			t = sc.nextLine().charAt(0);
		}
	}
	
	public void printData() {
		super.printData();
		System.out.println("Number of Experience: " + this.numExp);
		System.out.print("Skill: ");
		for (String s : skill) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Workspace: " + this.workspace);
		System.out.println();
	}
}
