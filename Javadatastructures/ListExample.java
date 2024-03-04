package Javadatastructures;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mike");
        names.add("Bob");
        for (String name : names) {
            System.out.println(name);
        }
	}

}
