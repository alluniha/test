
	public class UserEmployee {
		public static void main(String args[])
		{
			Employee e=new Employee();
			e.setEmpId(1);
			e.setEmpName("niha");
			e.setSalary(11098);
			
			Employee e1=new Employee();
			e1.setEmpId(2);
			e1.setEmpName("maha");
			e1.setSalary(7497);
		
			
			EmployeeImpl l1=new EmployeeImpl();
			l1.addEmployee(e);
			l1.deleteEmployee(e1);
			l1.yearSalary(e1);
			l1.addSalary(e1);
			
			
			
			
		}

	}



