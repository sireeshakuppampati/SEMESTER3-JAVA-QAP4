public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2.0);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}
