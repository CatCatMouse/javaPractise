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
		
		while (carsNumber > 0)
		{
			int num = 0;
			while (num != 0) {
				System.out.println("�����⳵�����ͼ����Ŀ��:");
				System.out.println("���	��������	���		����");
				System.out.println("1.	�µ�A4	500Ԫ/��		����:4��");
				System.out.println("2.	���Դ�6	400Ԫ/��		����:4��");
				System.out.println("3.	Ƥ��ѩ6	450Ԫ/��		����:4�� �ػ�:2��");
				System.out.println("4.	����	800Ԫ/��		����:20��");
				System.out.println("5.	�ɻ���	400Ԫ/��		�ػ�:4��");
				System.out.println("6.	��ά��	1000Ԫ/��		�ػ�:20��");
				num = input.nextInt();
				
				if (num <=0 || num > 6)
				{
					System.out.println("��������ȷ��������");
				}
			}
		}
		
		
		
		System.out.println("");
		
		input.close();

	}

}
