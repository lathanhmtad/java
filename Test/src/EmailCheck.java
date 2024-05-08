import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
	public void checkEmail(String str) throws EmailException {
		String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zAZ0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if(matcher.matches())
			System.out.println("Dia chi email dung dinh dang!");
		else
			throw new EmailException("Dia chi email sai dinh dang"); 
	}
}
