package practice;

import java.util.Scanner;

public class PR_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//문제 1
		/*
		System.out.print("원화를 입력하세요(단위:원)>>");
		int won; double dollar;
		won = sc.nextInt();
		dollar = (double)won/1100;
		System.out.print(won+"원은 $"+dollar+"입니다.");
		*/
		
		//문제 2
		/*
		System.out.print("2자리수 정수 입력(10~99)>>");
		int a = sc.nextInt();
		if(a%10==a/10)System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		else System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		*/
		
		//문제 3
		/*
		System.out.print("금액을 입력하시오>>");
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
		
		System.out.println("오만원권 "+m_50000+"매");
		System.out.println("만원권 "+m_10000+"매");
		System.out.println("천원권 "+m_1000+"매");
		System.out.println("백원 "+m_1+"매");
		System.out.println("오십원 "+m_50+"매");
		System.out.println("십원 "+m_10+"매");
		System.out.println("일원 "+m_1+"매");
		*/
		
		//문제 4
		/*
		System.out.print("정수 3개 입력>>");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if((a>=b&&b>=c)||(c>=b&&b>=a))System.out.print("중간 값은 "+b);
		else if((b>=a&&a>=c)||(c>=a&&a>=b))System.out.print("중간 값은 "+a);
		else if((a>=c&&c>=b)||(b>=c&&c>=a))System.out.print("중간 값은 "+c);
		*/
		
		//문제 5
		/*
		System.out.print("정수 3개를 입력하시오>>");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a<b+c||b<a+c||c<a+b)System.out.print("삼각형이 됩니다.");
		else System.out.print("삼각형이 안됩니다.");
		*/
		
		//문제 6
		/*
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int n = sc.nextInt();
		if((n%10)%3==0&&(n/10)%3==0)System.out.print("박수짝짝");
		else if((n%10)%3==0||(n/10)%3==0)System.out.print("박수짝");
		else System.out.print(n);
		*/
		
		//문제 7
		/*
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x=sc.nextInt(),y=sc.nextInt();
		if(x>=100&&x<=200&&y>=100&&y<=200)System.out.print("("+x+","+y+")는 사각형 안에 있습니다.");
		*/
		
		//문제 8
		public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
			if((x >= rectx1 && x<=rectx2)&&y>=recty1 && y<=recty2)return true;
			else return false;
		}
		int x1 = 
		
	}

}
