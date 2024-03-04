import java.util.LinkedList;

public class Bai008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
	    int element = 3;
	    list.remove(new Integer(element));
	    System.out.println("LinkedList after removing element: " + list);	
	}

}
