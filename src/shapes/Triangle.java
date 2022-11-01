package shapes;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double perimeter;
	private double area;
	   
	//Methods
	public Triangle() {
		this.sideA=1;
		this.sideB=1;
		this.sideC=1;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}
	
	public Triangle(double a, double b, double c) {
		this.sideA = this.sideB = this.sideC = 1;
	}
	
	private double findPerimeter() {
		Math.PI * Math.pow(perimeter, getPerimeter());
		return this.sideA + this.sideB + this.sideC;
	}
	
	private double findArea() {
		return 0;
	}
	
	public void printStats() {
		System.out.println("Triangle");
		System.out.println("SideA = " + this.sideA);
		System.out.println("SideB = " + this.sideB);
		System.out.println("SideC = " + this.sideC);
		System.out.println("Perimeter = " + this.perimeter);
		System.out.println("Area = " + this.area);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
	
	
}
