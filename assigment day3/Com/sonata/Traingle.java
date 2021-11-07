package Com.sonata;

public class Traingle extends Shape{
	
	public double area() {
		return( width*height)/2;
	}
	
	Traingle(double w,double h){
		this.width= w;
		this.height= h;
	}
	public static void main(String args[])
	{
		Traingle t=new Traingle(2,4);
		System.out.println("Area of traingle="+t.area());
	}
}
