package model;

import java.util.ArrayList;

public class Province {
	private int id;
	private String name;
	
	public Province(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static String[] getListOfProvinceNames()
	{
		String[] names = {
				"",
				"An Giang",
				"Bà Rịa – Vũng Tàu",
				"Bạc Liêu",
				"Bắc Giang",
				"Bắc Kạn",
				"Bắc Ninh",
				"Bến Tre",
				"Bình Dương",
				"Bình Định",
				"Bình Phước",
				"Bình Thuận",
				"Cà Mau",
				"Cao Bằng",
				"Cần Thơ",
				"Đà Nẵng",
				"Đắk Lắk",
				"Đắk Nông",
				"Điện Biên",
				"Đồng Nai",
				"Đồng Tháp",
				"Gia Lai",
				"Hà Giang",
				"Hà Nam",
				"Hà Nội",
				"Hà Tĩnh",
				"Hải Dương",
				"Hải Phòng",
				"Hậu Giang",
				"Hòa Bình",
				"Thành phố Hồ Chí Minh",
				"Hưng Yên",
				"Khánh Hòa",
				"Kiên Giang",
				"Kon Tum",
				"Lai Châu",
				"Lạng Sơn",
				"Lào Cai",
				"Lâm Đồng",
				"Long An",
				"Nam Định",
				"Nghệ An",
				"Ninh Bình",
				"Ninh Thuận",
				"Phú Thọ",
				"Phú Yên",
				"Quảng Bình",
				"Quảng Nam",
				"Quảng Ngãi",
				"Quảng Ninh",
				"Quảng Trị",
				"Sóc Trăng",
				"Sơn La",
				"Tây Ninh",
				"Thái Bình",
				"Thái Nguyên",
				"Thanh Hóa",
				"Thừa Thiên Huế",
				"Tiền Giang",
				"Trà Vinh",
				"Tuyên Quang",
				"Vĩnh Long",
				"Vĩnh Phúc",
				"Yên Bái",
		};
		return names;
	}

	private static ArrayList<Province> listOfProvinces()
	{
		ArrayList<Province> data = new ArrayList<Province>();
		String[] names = getListOfProvinceNames();
		for(int i = 0; i < names.length; i++)
		{
			data.add(new Province(i, names[i]));
		}
		
		return data;
	}
	
	public static Province getProvinceByName(String name)
	{
		ArrayList<Province> data = listOfProvinces();
		for (Province province : data) 
			if(province.getName().equals(name))
				return province;
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
