package cm.ub.l300.oop;

public class Circle extends Shape{
	private double raduis;

	public Circle(double abs, double ord, double raduis) {
		super(abs, ord);
		this.raduis = raduis;
	}

	public double getRaduis() {
		return raduis;
	}

	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}

	public double area(){
		return Math.PI* Math.pow(this.raduis, 2);
	}
	
	public double circumference(){
		return 2 * Math.PI * this.raduis;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("Radius : " + this.raduis);
	}
}
