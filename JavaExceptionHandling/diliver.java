package JavaExceptionHandling;

public class diliver {

	public int divider(int a, int b) throws ArithmeticException {
	    if (b == 0) {
	        throw new ArithmeticException("Số bị chia không thể bằng 0");
	    }
	    return a / b;
	}
	
}
