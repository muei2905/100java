package JavaExceptionHandling;

public class StringtoInt {
public int StringtoInt(String str) throws NumberFormatException{
 int number;
 try {
	 number=Integer.parseInt(str);
} catch (NumberFormatException e) {
	throw new NumberFormatException("Không thể chuyển đổi được số");
}
 return number;
}
}
