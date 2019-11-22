package com.car;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		int isNeeded = 0;//是否租车
		Scanner input = new Scanner(System.in);
		while(isNeeded != 1) {
			System.out.println("欢迎使用答答租车系统:");
			System.out.println("您是否要租车:1是 0否");
			isNeeded = input.nextInt();
		}
		//租车数量
		System.out.println("请输入您要租车的数量:");
		int carsNumber = 0;
		do
		{
			carsNumber = input.nextInt();
		}while(carsNumber <= 0);
		
		System.out.println("您可租车的类型及其价目表:");
		System.out.println("序号	汽车名称	租金		容量");
		System.out.println("1.	奥迪A4	500元/天		载人:4人");
		System.out.println("2.	马自达6	400元/天		载人:4人");
		System.out.println("3.	皮卡雪6	450元/天		载人:4人 载货:2吨");
		System.out.println("4.	金龙	800元/天		载人:20人");
		System.out.println("5.	松花江	400元/天		载货:4吨");
		System.out.println("6.	依维柯	1000元/天		载货:20吨");
		
		//选择的车序号合集
		int[] cars = new int[carsNumber];
		
		
		for (int i=0; i<carsNumber; i++) {
			System.out.println("请输入第"+(i+1)+"辆车的序号:");
			cars[i] = input.nextInt();
		}
		
		System.out.println("请输入租车天数:");
		int days = input.nextInt();
		calcOrder(cars, days);
			
		input.close();

	}
	
 	protected static void calcOrder(int[] cars, int days)
	{
		String load = "", persons = "";
		int  personsNum = 0;
		float totalPrice = 0f, loadGoods = 0f;
		for (int i=0; i < cars.length; i++) {
			ACar car = new Car(cars[i]);
			if (car.load != 0) {
				load = load + car.name + "\t";
				loadGoods += car.load;
			}
			if (car.persons != 0) {
				persons = persons + car.name + "\t";
				personsNum += car.persons;
			}
			totalPrice += car.unitPrice * days;
		}
		System.out.println("您的账单:");
		System.out.println("***可载人的车有:"	+ "\n\t" + persons + "共载人:" + personsNum + "人" );
		System.out.println("***载货的车有:"	+ "\n\t" + load + "共载货:" + loadGoods + "吨");
		System.out.println("***租车总价格:"	+ "\n\t" + totalPrice + "元");
	}

}
