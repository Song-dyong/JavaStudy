/*
	조건문 (if)
	




*/
public class _06_비교연산자2 {
	public static void main(String[] args) {
		char c1=(char)((Math.random()*26)+65); // 데이터형이 char이므로, 전체에 괄호를 치지 않으면 오류
		char c2=(char)((Math.random()*26)+65);	// 65는 A 
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
	
		boolean b1= c1==c2;
		System.out.println(b1);
		
		b1= c1!=c2;
		System.out.println(b1);
		
		b1= c1<c2;
		System.out.println(b1);
		
		b1= c1>c2;
		System.out.println(b1);
		
		b1= c1<=c2;
		System.out.println(b1);
		
		b1= c1>=c2;
		System.out.println(b1);
	
		System.out.println(Math.random());
	}
}
