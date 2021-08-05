public class ComplexNumber {
    private double real;
    private double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }
    public void add(ComplexNumber x){
        this.real = this.real + x.getReal();
        this.imaginary = this.imaginary + x.getImaginary();
    }
    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber x){
        this.real = this.real - x.getReal();
        this.imaginary = this.imaginary - x.getImaginary();
    }
}
