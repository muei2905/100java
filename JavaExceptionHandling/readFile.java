package JavaExceptionHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readFile {
	public String readFile(String fileName) throws IOException {
	    try {
	        return new String(Files.readAllBytes(Paths.get(fileName)));
	    } catch (IOException e) {
	        throw new IOException("Lỗi đọc file");
	    }
	}

}
