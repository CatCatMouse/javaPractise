package com.car;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		int isNeeded = 0;//�Ƿ��⳵
		Scanner input = new Scanner(System.in);
		while(isNeeded != 1) {
			System.out.println("��ӭʹ�ô���⳵ϵͳ:");
			System.out.println("���Ƿ�Ҫ�⳵:1�� 0��");
			isNeeded = input.nextInt();
		}
		//�⳵����
		System.out.println("��������Ҫ�⳵������:");
		int carsNumber = 0;
		do
		{
			carsNumber = input.nextInt();
		}while(carsNumber <= 0);
		
		System.out.println("�����⳵�����ͼ����Ŀ��:");
		System.out.println("���	��������	���		����");
		System.out.println("1.	�µ�A4	500Ԫ/��		����:4��");
		System.out.println("2.	���Դ�6	400Ԫ/��		����:4��");
		System.out.println("3.	Ƥ��ѩ6	450Ԫ/��		����:4�� �ػ�:2��");
		System.out.println("4.	����	800Ԫ/��		����:20��");
		System.out.println("5.	�ɻ���	400Ԫ/��		�ػ�:4��");
		System.out.println("6.	��ά��	1000Ԫ/��		�ػ�:20��");
		
		//ѡ��ĳ���źϼ�
		int[] cars = new int[carsNumber];
		
		
		for (int i=0; i<carsNumber; i++) {
			System.out.println("�������"+(i+1)+"���������:");
			cars[i] = input.nextInt();
		}
		
		System.out.println("�������⳵����:");
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
		System.out.println("�����˵�:");
		System.out.println("***�����˵ĳ���:"	+ "\n\t" + persons + "������:" + personsNum + "��" );
		System.out.println("***�ػ��ĳ���:"	+ "\n\t" + load + "���ػ�:" + loadGoods + "��");
		System.out.println("***�⳵�ܼ۸�:"	+ "\n\t" + totalPrice + "Ԫ");
	}

}
