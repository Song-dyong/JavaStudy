/*
		2차 for
		중첩
		조건문
			if()
			{
				if()
				{
				}
			}
		
			switch()
			{
				case 값:
					switch()
					{
					}
			}
			
			for()			==> 줄 수 (종)
			{
				for()		==> 데이터 갯수 (횡) 
				{
				
				}
			}

			 1  2  3  4  5			|	==> 줄수: 4
			 6  7  8  9 10			|	
			11 12 13 14 15			|	==> 갯수: 5
			16 17 18 19 20			|
			
			A	B	C				|	==> 줄수: 5
			D	E	F				|
			G	H	I				|	==> 갯수: 3
			J	K	L				|
			M	N	O				|
			
			for(초기값;조건식;증감식)		==> 몇 줄?
			{	
				for(초기값;조건식;증감식)	==> 실제 출력물
				{
					반복수행문장
				}
				줄바꿈 
			}
			
			2*1=2 3*1=3 ....  9*1=9
			|
			|
			|
			2*9=18 3*9=27.... 9*9=81
			
*/
public class _01_중첩반복문_구구단 {
	public static void main(String[] args) {
		
//		char c='A';
//		for(int i=1;i<=5;i++)	 	// 줄만 생성
//		{
//			for(int j=1;j<=3;j++)
//			{
//				System.out.print(c++ + "  ");
//			}
//			System.out.println();
//		}
		
		System.out.println("======구구단======");
		
		for(int i = 2;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		for(int i =1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d x%2d = %2d  ",j,i,i*j);
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("i= "+i+", j= "+j+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
