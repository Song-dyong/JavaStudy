import java.util.Scanner;



public class _04_메소드_계산기만들기 {
	// +
	static int plus(int a, int b)
	{
		return a+b;
	}
	// -
	static int minus(int a, int b)
	{
		return a-b;
	}
	// *
	static int gop(int a, int b)
	{
		return a*b;
	}
	// /
	static String div(int a,int b)
	{
		String res="";
		if(b==0)
		{
			res="0으로 나눌 수 없습니다";
		}
		else 
			res=a+"/"+b+"="+(a/(double)b);
		return res;
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a= scan.nextInt();
		System.out.print("정수 입력:");
		int b= scan.nextInt();
		
		System.out.print("연산자 입력(+ - * /):");
		String op=scan.next();

		int res=0;											// 블럭 내에서 int res를 계속 선언할 수 없으므로, 밖에서 선언한 뒤, int를 빼면 됨
		switch(op)
		{
		case "+":
			res=plus(a,b);
			System.out.printf("%d+%d=%d",a,b,res);
			break;
		case "-":
			res=minus(a,b);
			System.out.printf("%d+%d=%d",a,b,res);
			break;
		case "*":
			res=gop(a,b);
			System.out.printf("%d+%d=%d",a,b,res);
			break;
		case "/":
			String s=div(a,b);
			System.out.printf(s);
		}
		
	}
	
	public static void main(String[] args) {
		process();
	
	}
}
