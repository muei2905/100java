package JavaExceptionHandling;

public class checkUsername {
	public void checkUsername(String username) throws IllegalArgumentException {
	    if (username.length() < 6 || !username.matches("^[a-zA-Z0-9]*$")) {
	        throw new IllegalArgumentException("Tên đăng nhập không hợp lệ");
	    }
	}
}
