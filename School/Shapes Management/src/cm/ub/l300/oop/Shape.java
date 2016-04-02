package cm.ub.l300.oop;

public class Shape {
	private double abs;
	private double ord;
	
	public Shape(double abs, double ord) {
		this.abs = abs;
		this.ord = ord;
	}

	public double getAbs() {
		return abs;
	}

	public void setAbs(double abs) {
		this.abs = abs;
	}

	public double getOrd() {
		return ord;
	}

	public void setOrd(double ord) {
		this.ord = ord;
	}
	
	public void display(){
		System.out.printf("Center of gravity: ");
		System.out.printf("(" + this.abs + "," );
		System.out.printf( + this.ord + "," + ")\n" );
	}
}
