package cg.model;

public class Circle {
	private double radius;
	private String color;
	 
	public Circle() {
		  radius=3.0;
		  color="green";
	}	  
	public Circle(double r) {
		radius=r;
		color="blue";
				
		
	}
	public Circle(double r, String c) 
	{
		radius=r;
		color=c;
		}
   public double getradius() 
   {
	   return radius;
   }
   public String getcolor() 
   {
	   return color;
   }
   public double getArea() {
	   return radius*radius*Math.PI;
   }
}  
   
   


