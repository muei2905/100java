package Javavariablesanddatatypes;

public class ComplexNumber {

	private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber cn) {
        return new ComplexNumber(this.real + cn.real, this.imaginary + cn.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber cn) {
        return new ComplexNumber(this.real - cn.real, this.imaginary - cn.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber cn) {
        return new ComplexNumber(this.real * cn.real - this.imaginary * cn.imaginary, this.real * cn.imaginary + this.imaginary * cn.real);
    }

    public ComplexNumber divide(ComplexNumber cn) {
        double divisor = cn.real * cn.real + cn.imaginary * cn.imaginary;
        return new ComplexNumber((this.real * cn.real + this.imaginary * cn.imaginary) / divisor, (this.imaginary * cn.real - this.real * cn.imaginary) / divisor);
    }

    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));
        System.out.println("Quotient: " + c1.divide(c2));
	}

}
