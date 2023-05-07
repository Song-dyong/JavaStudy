/*
	

*/
public class _02_산술연산자2 {
	public static void main(String[] args) {
	int a = 10; // 명시적 입력 or 입력값을 받을지 or 난수발생
	int b = 3;
	
	System.out.println(a+"%"+b+"="+(a%b));			//  1
	System.out.println(-a+"%"+b+"="+(-a%b));		// -1
	System.out.println(a+"%"+-b+"="+(a%-b));		//  1
	System.out.println(-a+"%"+-b+"="+(-a%-b));		// -1     나누고 나머지 값만 왼쪽의 부호를 따라감
	System.out.println(-a+"*"+-b+"="+(-a*-b));		// 30
	System.out.println(-a+"/"+-b+"="+(-a/-b));		//  3
	
	
	
	
	
	
	}
}
