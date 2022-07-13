package ss04_oop.exercise.quadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscrimiant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (this.getDiscrimiant() > 0) {
            return (-this.b + Math.sqrt(this.getDiscrimiant())) / (2 * this.a);
        } else if (this.getDiscrimiant() == 0) {
            return (-this.b) / 2 * this.a;
        }
        return 0;

    }

    public double getRoot2() {
        if (this.getDiscrimiant() > 0) {
            return (-this.b - Math.sqrt(this.getDiscrimiant())) / (2 * this.a);
        } else if (this.getDiscrimiant() == 0) {
            return (-this.b) / 2 * this.a;
        }
        return 0;

    }

}
