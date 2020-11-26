package src;

public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int sqrt(double a) {
    	return (int)Math.sqrt(a);
    }
    public int exp(int a, int b) {
    	return (int)Math.pow((double)a, (double)b);
    }
    public static final void main(String[] args) {
        System.out.println("Hey there CIS350.");
    }
}
