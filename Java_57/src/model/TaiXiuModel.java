package model;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít
 * hơn hoặc bằng số tiền họ đang có
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mỗi viên xúc có 6 mặt có giá trị từ 1 đén 6
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá trị xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua
 */


public class TaiXiuModel {
	private double account;
	private double placeABet;
	private String option;
	private String result;
	Locale lc = new Locale("vi", "VN");
	NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
	
	public TaiXiuModel() {
		super();
		account = 50000;
		placeABet = 0;
		result = "";
		option = "";
	}
	
	public double getAccount() {
		return account;
	}
	
	public String getAccountIsFormatted() {
		return numf.format(account);
	}

	public void setAccount(double account) {
		this.account = account;
	}


	public double getPlaceABet() {
		return placeABet;
	}


	public void setPlaceABet(double placeABet) {
		this.placeABet = placeABet;
	}


	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	public String getResult() {
		return result;
	}

	private int rollTheDice()
	{
		Random dice1 = new Random();
		Random dice2 = new Random();
		Random dice3 = new Random();
		
		int value1 = dice1.nextInt(5) + 1;
		int value2 = dice2.nextInt(5) + 1;	
		int value3 = dice3.nextInt(5) + 1;
		
		result = value1 + " - " + value2 + " - " + value3;
		int sum = value1 + value2 + value3;
		
		return sum;
	}
	
	public String handleResultRollTheDice()
	{
		int res = rollTheDice();

		if(res == 3 || res == 18)
		{
			account -= placeABet;
			result += " => Cái ăn hết :))";
			return "Ha ha mày đen lắm cái ăn hết nha";
		}
		else if(res >= 4 && res <= 10) // xỉu
		{
			result += " => Xỉu";
			if(option.equalsIgnoreCase("Xỉu") || option.equalsIgnoreCase("Xiu"))
			{
				account += placeABet;
				return "Á đù ra xỉu số m hên lắm con lợn này";
			}
			else
			{
				account -= placeABet;
				return "Ra xỉu mà đặt tài thì có mà sạt nghiệp";
			}
			
		}
		else
		{
			result += " => Tài";
			if(option.equalsIgnoreCase("Tài") || option.equalsIgnoreCase("TAI"))
			{
				account += placeABet;
				return "Á đù ra tài số m hên lắm con lợn này";
			}
			else
			{
				account -= placeABet;	
				return "Ra tài mà đặt xỉu thì có mà sạt nghiệp";
			}
		}
	}
}
