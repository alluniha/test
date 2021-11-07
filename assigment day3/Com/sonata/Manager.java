package Com.sonata;

	public class Manager extends Employee {

		Manager(int id,String name,double sal)
		{
			super(id,name,sal);
		}
		public double SalCal()
		{
			return super.SalCal();
		}
		public static void main(String args[])
		{
			Manager m1=new Manager(23,"gowthami",150000);
			m1.SalCal();
			m1.display();
		}
	}

