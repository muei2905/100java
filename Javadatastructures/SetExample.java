package Javadatastructures;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Mike");
        set.add("Bob");
        for (String name : set) {
            System.out.println(name);
        }
	}

}
