
public class _문제_02 {
	
	static void Quiz1()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println();
	}
	
	static void quiz2()							// static int sum()					리턴을 줄 경우: 메인 영역에서 다시 한 번 sum값을 활용할 경우
	{											// {
		int sum=0;								//		int sum=0;
		for(int i=1;i<=10;i++)					//		for(int i=1;i<=10;i++
		{										//			sum+=i;
			sum+=i;								//	}
		}										//		return sum;
		System.out.println(sum);
	}
	
	static int sum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
		
		return sum;
	}
	
	static double method4(int a, int b)
	{
		double res=0;
		res= (double)a/b;
		return res;
	}

/*	
	static double method4(int a, int b)
	{
		return a/(double)b;
	}
		
*/	
//	static char cChange(char c)
//	{
//		
//		if(c>='a'&&c<='z')
//		{
//			c-=32;
//		}
//		
//		return c;
//	}
	
	static String method5(String s)
	{
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				result+=s.charAt(i);
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				result+=(char)(s.charAt(i)-32);
			}
		}
		return result;
	}
	
	static void method6(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
//	static String reverse(String s)
//	{
//		s="Hello Java";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//			
//		}
//		
//	}
	
	public static void main(String[] args) {
		Quiz1();
		quiz2();
		System.out.println(sum(20));
		System.out.printf("%.2f",method4(10,30));
		System.out.println();
		String s=method5("Hello Java");
		System.out.println(s);
		method6(s);
	}
}
