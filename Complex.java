
import java.util.Scanner;

public class Complex {

    private final double re;
    private final double im;

    public Complex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите комплексное число ");
        re = sc.nextFloat();
        im = sc.nextFloat();
    }

    public Complex(double real, double img) {
        this.re = real;
        this.im = img;
    }

    @Override
    public String toString() {
        if (im == 0) {
            return re + "";
        }
        if (re == 0) {
            return im + "i";
        }
        if (im < 0) {
            return re + " - " + (-im) + "i";
        }
        return re + " + " + im + "i";
    }

    public double abs() {
        return Math.hypot(re, im);  // сразу считает модуль 
    }

    public Complex plus(Complex b) {
        Complex a = this;
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }

    public Complex minus(Complex b) {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    public Complex times(Complex b) { // умножение 
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }

    public Complex scale(double alpha) { // умножаем на число
        return new Complex(alpha * re, alpha * im);
    }

    public Complex conjugate() {
        return new Complex(re, -im);
    }

    public Complex reciprocal() {
        double scale = re * re + im * im;
        return new Complex(re / scale, -im / scale);
    }

    public double re() {
        return re;
    }

    public double im() {
        return im;
    }

    public String divides(Complex b) {
        Complex a = this;
        Complex numerator = a.times(b.conjugate());
        Complex denominator = b.times(b.conjugate());
        return "(" + a + ")/(" + b + ")=(" + numerator + ")/" + denominator;
    }

    public static Complex plus(Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex sum = new Complex(real, imag);
        return sum;
    }

    public static String trigForm(Complex b) {
        double r = b.abs();
        double cos = (double) b.re / r;
        double sin = (double) b.im / r;
        return "z=" + b + "=" + r + "(cos(" + Math.acos(cos) + ")+isin(" + Math.asin(sin) + "))";
    }

    public static void sqrt(Complex a, int n) {
        double r = a.abs();
        double cos = (double) a.re / r;
        double sin = (double) a.im / r;
        for (int i = 0; i < n; i++) {
            System.out.format("%s %.4f %s %d %s %.4f %s %d %s %d %s %.4f %s %d %s %d %s ",
                    "z=", r, "^", n, "(cos(", Math.acos(cos), "+2Pi*", i, ")/", n, ")+isin(", Math.asin(sin), "+2Pi*", i, ")/", n, "))");
            System.out.println();
        }
    }

    public static void stepen(Complex a, int n) {
        double r = a.abs();
        double cos = (double) a.re / r;
        double sin = (double) a.im / r;
        System.out.format("%s %.4f %s %d %s %.4f %s %.4f %s ",
                "z=", r, "^", n, "(cos(", Math.acos(cos) * n, ")+isin(", Math.asin(sin) * n, "))");
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, Math.sqrt(3));
        Complex b = new Complex();

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("b + a= " + b.plus(a));
        System.out.println("a - b= " + a.minus(b));
        System.out.println("a * b= " + a.times(b));
        System.out.println("b * a= " + b.times(a));
        System.out.println("a / b= " + a.divides(b));
        System.out.println("conj(a)= " + a.conjugate());
        System.out.println("|a|=" + a.abs());
        System.out.println(a.scale(3));
        System.out.println(a.reciprocal());
        System.out.println(plus(a, b));
        System.out.println(trigForm(a));
        sqrt(a, 3);
        stepen(a,5);
    }

}
