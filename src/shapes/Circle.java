package shapes;

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	private double perimeter;
	
	//Methods
	public Circle() {
		this.radius=1;
		this.circumference=1;
		this.area = findArea();
		this.perimeter = findPerimeter();
	}
	
	public Circle(double r) {
		this.radius=r;
		this.circumference=r;
		this.perimeter = findPerimeter();
	}
	
	private double findPerimeter() {
		return 0;
	}

	private double findCircumference() {
		return 0;
		Math.PI*Math.pow(circumference, findCircumference());
	}
	
	private double findArea() {
		return 0;
		Math.PI*Math.pow(area, findArea());
	}
	
	public void printStats() {
		System.out.println("Circle");
		System.out.println("Radius = "+this.radius);
		System.out.println("Circumference = "+this.circumference);
		System.out.println("Perimeter = "+this.perimeter);
	}

	public double getRadius() {
		return radius;
		Math.PI*Math.pow(radius, getRadius());
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	
}
