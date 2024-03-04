package JavaExceptionHandling;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class getAge {
	public int getAge(String birthdate) throws IllegalArgumentException {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(false);
	    try {
	    	 Date birthdate1 = sdf.parse(birthdate1);
	        LocalDate birthLocalDate = birthdate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        LocalDate now = LocalDate.now();
	        Period p = Period.between(birthLocalDate, now);
	        return p.getYears();
	    } catch (ParseException e) {
	        throw new IllegalArgumentException("Ngày sinh không hợp lệ");
	    }
	}
}
