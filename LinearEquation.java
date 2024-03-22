package enkapsulasi;

import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }

    public void setCoefficients(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }
    
    public double calculateX() {
        return (e * d - b * f) / (a * d - b * c);
}
    public double calculateY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = scanner.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = scanner.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation();
        equation.setCoefficients(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("Nilai x adalah: " + equation.calculateX());
            System.out.println("Nilai y adalah: " + equation.calculateY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}
