
public class Solution {
	public int lengthOfLastWord(String s)
	{
		s = s.trim(); // loại bỏ đi khoảng trắng 2 đầu của chuỗi (nếu có)
		int length = s.length();
		int lastSpace = s.lastIndexOf(' '); 
		// tìm vị trí của khoảng trắng cuối cùng bằng hàm lastIndexOf
        // => độ dài từ cuối cùng = length - lastSpace
		return lastSpace != -1 ? length - lastSpace - 1 : length - 1;
	}
}
