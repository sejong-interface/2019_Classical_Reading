package practice;

import java.util.Scanner;

public class PR_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//���� 1
		/*
		System.out.print("��ȭ�� �Է��ϼ���(����:��)>>");
		int won; double dollar;
		won = sc.nextInt();
		dollar = (double)won/1100;
		System.out.print(won+"���� $"+dollar+"�Դϴ�.");
		*/
		
		//���� 2
		/*
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int a = sc.nextInt();
		if(a%10==a/10)System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		*/
		
		//���� 3
		/*
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		int m_50000 = money/50000;
		money %= 50000;
		int m_10000 = money/10000;
		money %= 10000;
		int m_1000 = money/1000;
		money %= 1000;
		int m_100 = money/100;
		money %= 100;
		int m_50 = money/50;
		money %= 50;
		int m_10 = money/10;
		int m_1 = money%10;
		
		System.out.println("�������� "+m_50000+"��");
		System.out.println("������ "+m_10000+"��");
		System.out.println("õ���� "+m_1000+"��");
		System.out.println("��� "+m_1+"��");
		System.out.println("���ʿ� "+m_50+"��");
		System.out.println("�ʿ� "+m_10+"��");
		System.out.println("�Ͽ� "+m_1+"��");
		*/
		
		//���� 4
		/*
		System.out.print("���� 3�� �Է�>>");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if((a>=b&&b>=c)||(c>=b&&b>=a))System.out.print("�߰� ���� "+b);
		else if((b>=a&&a>=c)||(c>=a&&a>=b))System.out.print("�߰� ���� "+a);
		else if((a>=c&&c>=b)||(b>=c&&c>=a))System.out.print("�߰� ���� "+c);
		*/
		
		//���� 5
		/*
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a<b+c||b<a+c||c<a+b)System.out.print("�ﰢ���� �˴ϴ�.");
		else System.out.print("�ﰢ���� �ȵ˴ϴ�.");
		*/
		
		//���� 6
		/*
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int n = sc.nextInt();
		if((n%10)%3==0&&(n/10)%3==0)System.out.print("�ڼ�¦¦");
		else if((n%10)%3==0||(n/10)%3==0)System.out.print("�ڼ�¦");
		else System.out.print(n);
		*/
		
		//���� 7
		/*
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x=sc.nextInt(),y=sc.nextInt();
		if(x>=100&&x<=200&&y>=100&&y<=200)System.out.print("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		*/
		
		//���� 8
		public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
			if((x >= rectx1 && x<=rectx2)&&y>=recty1 && y<=recty2)return true;
			else return false;
		}
		int x1 = 
		
	}

}
