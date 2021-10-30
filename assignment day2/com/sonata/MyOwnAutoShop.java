package com.sonata;

public class MyOwnAutoShop {
	MyOwnAutoShop(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color,length);
	}
	MyOwnAutoShop(int speed,double regularPrice,String color, int year, int manfacdisc)
	{
		super(speed,regularPrice,color,year,manfacdisc);
	}
	MyOwnAutoShop(int speed,double regularPrice,String color)
	{
		super(speed,regularPrice,color);
	}
	public static void main(String[] args) 
	{
		Car myCar = new Car (180, 7560000.0, "yellow");
		Sedan mySedan = new Sedan(140, 4300000.0, "green",19);
		Ford myFord1 = new Ford (170,5500000.0,"white",2008, 500);
		Ford myFord2 = new Ford (150,4500000.0,"Pink",2009, 1000);
		System.out.println("MySedan Price"+ mySedan.getSalePrice()+"\n");
		System.out.println("MyFord1 Price "+ myFord1.getSalePrice()+"\n");
		System.out.println("MyFord2 Price"+ myFord2.getSalePrice()+"\n");
		System.out.println("MyCar Price "+ myCar.getSalePrice()+"\n");
	}

}
