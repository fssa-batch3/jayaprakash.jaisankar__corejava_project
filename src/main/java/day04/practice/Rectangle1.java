package day04.practice;


public class Rectangle1 {
    protected double length;
    protected double breadth;

    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

	public String getArea() {
		return null;
	}
}

class Square extends Rectangle1 {
    public Square(double side) {
        super(side, side);
    }
}
