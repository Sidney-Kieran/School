package cm.ub.l300.oop;

public class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(double abs, double ord, double width, double height) {
		super(abs, ord);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area(){
		return this.height * this.width;
	}
	
	public double circumference(){
		return (this.width + this.height) * 2;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("Height: " + this.height);
		System.out.println("Width: " + this.width);
	}
}
