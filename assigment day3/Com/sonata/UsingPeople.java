package Com.sonata;

public class UsingPeople {

	public static void main(String args[])
	{
		Address a1=new Address();
		a1.setDoorNo("1-5");
		a1.setStreet("Ramalayam Street");
		a1.setPinCode(531117);
		
		Employeee e=new Employeee();
		e.setEmpId(12);
		e.setEmpName("mahalaxmi");
		e.setObj(a1);
		e.setBasicPay(25740.66);
		e.setNofLeavesAvail(25);
		System.out.println(e);
		
		
		TechnicalEmployeee te=new TechnicalEmployeee();
		te.setEmpId(2);
		te.setEmpName("varun");
		te.setBasicPay(345566.66);
		te.setNofLeavesAvail(45);
		te.setSkill1("C");
		te.setSkill2("Java");
		System.out.println(te.toString());
		System.out.println(te.CalSal());
		
		Staff t=new Staff();
		t.setEmpId(4);
		t.setEmpName("niha");
		t.setBasicPay(345566.66);
		t.setNofLeavesAvail(43);
		t.setTitle1("HousKeeping");
		t.setTitle2("Security");
		System.out.println(t.toString());
		System.out.println(t.CalSal());
}
}
