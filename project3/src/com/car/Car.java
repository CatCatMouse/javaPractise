package com.car;

public class Car extends ACar {
	public Car(int num)
	{
		switch(num) {
			case 1:
				this.name = "奥迪A4";
				this.unitPrice = 500f;
				this.load = 0;
				this.persons = 4;
				break;
			case 2:
				this.name = "马自达6";
				this.unitPrice = 400f;
				this.load = 0;
				this.persons = 4;
				break;
			case 3:
				this.name = "皮卡雪6";
				this.unitPrice = 450f;
				this.load = 2;
				this.persons = 4;
				break;
			case 4:
				this.name = "金龙";
				this.unitPrice = 800f;
				this.load = 0;
				this.persons = 20;
				break;
			case 5:
				this.name = "松花江";
				this.unitPrice = 400f;
				this.load = 4;
				this.persons = 0;
				break;
			case 6:
				this.name = "依维柯";
				this.unitPrice = 1000f;
				this.load = 20;
				this.persons = 0;
				break;
		}
	}
}
