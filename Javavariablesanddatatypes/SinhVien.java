package Javavariablesanddatatypes;

public class SinhVien {

	private String name;
    private int age;
    private double score;

    public SinhVien(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Score: " + this.score;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("John Doe", 20, 9.5);
        System.out.println(sv);
	}

}
