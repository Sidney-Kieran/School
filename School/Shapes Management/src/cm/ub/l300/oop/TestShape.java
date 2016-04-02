package cm.ub.l300.oop;

import java.util.*;

public class TestShape {
	public static void main(String[] args){
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Shape(2.0, 3.5));
		shapes.add(new Circle(7.0, 3.4, 4.5));
		shapes.add(new Rectangle(-2.0, 1.0, 4.8, 3.5));
		
		for (Shape shape : shapes) {
			shape.display();
			if(shape instanceof Circle){
				System.out.println("Area: " + ((Circle)shape).area());
				System.out.println("Circumference: " + ((Circle)shape).circumference());
			}else if(shape instanceof Rectangle){
				System.out.println("Area: " + ((Rectangle)shape).area());
				System.out.println("Perimeter: " + ((Rectangle)shape).circumference());
			}
		}
	}
}
