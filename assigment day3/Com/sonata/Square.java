package Com.sonata;

public class Square extends Shape{
	public double area() {
		return length*length;
	}
	Square(double l)
	{
		this.length=l;
	}
	
	public static void main(String args[])
	{
		Square s=new Square(2);
		System.out.println("Area of traingle="+s.area());
	}

}
