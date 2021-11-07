package Com.sonata;

public class Rectangle extends Shape {
	public double area() {
		return length*width;
	}
	Rectangle(double l,double w)
	{
		this.length=l;
		this.width=w;
	}
	
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(5,5);
		System.out.println("Area of traingle="+r.area());
	}
}
