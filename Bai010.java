
public class Bai010 {

	private String name;
	  private int age;
	  private double salary;
	  
	  public Bai010(String name, int age, double salary) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	  }
	  
	  public String toString() {
	    return "Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai010 emp = new Bai010("John Doe", 30, 70000);
	    System.out.println(emp);
	}

}
