package DZ.DZ_7.model;

public class ComplexNum {
    
    private double i1;
    private double i2;

    public ComplexNum(double n, double ni) {
        this.i1 = n;
        this.i2 = ni;
    }

    public double getI1() {
        return i1;
    }
    public double getI2() {
        return i2;
    }

    @Override
    public String toString() {
        new String();
        return String.format("( %s, %si )", i1, i2);
    }
}
