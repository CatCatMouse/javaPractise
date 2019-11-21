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
		
		while (carsNumber > 0)
		{
			int num = 0;
			while (num != 0) {
				System.out.println("您可租车的类型及其价目表:");
				System.out.println("序号	汽车名称	租金		容量");
				System.out.println("1.	奥迪A4	500元/天		载人:4人");
				System.out.println("2.	马自达6	400元/天		载人:4人");
				System.out.println("3.	皮卡雪6	450元/天		载人:4人 载货:2吨");
				System.out.println("4.	金龙	800元/天		载人:20人");
				System.out.println("5.	松花江	400元/天		载货:4吨");
				System.out.println("6.	依维柯	1000元/天		载货:20吨");
				num = input.nextInt();
				
				if (num <=0 || num > 6)
				{
					System.out.println("请输入正确的租出序号");
				}
			}
		}
		
		
		
		System.out.println("");
		
		input.close();

	}

}
