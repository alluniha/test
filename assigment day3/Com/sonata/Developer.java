package Com.sonata;

public class Developer extends Employee {
	Developer(int id,String name,double sal)
	{
		super(id,name,sal);
	}
	public double SalCal()
	{
		return super.SalCal();
	}
	public static void main(String args[])
	{
		Developer d1=new Developer(23,"niharika",350000);
		d1.SalCal();
		d1.display();
	}

}
