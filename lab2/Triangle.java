package lab2;

class Triangle extends Shape {
    private double c;
    private double d;

    public Triangle(double c, double d) {
        this.c = c;
        this.d = d;
    }

    @Override
    double getArea() {
        return 0.5 * c * d;
    }
}