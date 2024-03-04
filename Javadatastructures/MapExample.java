package Javadatastructures;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Mike");
        map.put(3, "Bob");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
