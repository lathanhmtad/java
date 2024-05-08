package model;

public class MouseExampleModel {
	private int x, y;
	private int count;
	private String checkIn; // yes, no
	
	public MouseExampleModel() {
		super();
		x = 0;
		y = 0;
		count = 0;
		checkIn = "No";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	
	public void addclick()
	{
		count++;
	}
	
	public void enter()
	{
		checkIn = "yes";
	}
	
	public void exit()
	{
		checkIn = "No";
	}
	
	
	
	
	
	
}
