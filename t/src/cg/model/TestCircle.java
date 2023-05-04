package cg.model;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1= new Circle(19.0,"grey");
		System.out.println(c1.getcolor());
		System.out.println(c1.getradius());
		System.out.println(c1.getArea());
		Circle c2=new Circle();
		System.out.println(c2.getcolor());
		System.out.println(c2.getradius());
		System.out.println(c2.getArea());
		Circle c3=new Circle(15.0);
		System.out.println(c3.getcolor());
		System.out.println(c3.getradius());
		System.out.println(c3.getArea());

	}

}
