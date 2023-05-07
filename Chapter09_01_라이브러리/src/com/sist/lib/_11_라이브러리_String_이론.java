package com.sist.lib;

/*
		String: 문자열을 조작하고 처리하는 기능
				----------
				=> String은 클래스 / 일반 데이터형으로 취급
					-> 모든 클래스는 Call By Reference ,, String은 Call By Value
				기존의 클래스
					A a=new A();
					A b=a;
					a와 b는 같은 주소를 제어 (참조형)
					String s="Hello";
					String s1=s; ==> s1을 변경하면 s는 변경사항이 없음 (call by value --> 값만 받는 상태)
				=> 메모리 할당(저장)
					1) String s="Hello"; --> 리터럴 --> 리터럴 영역에 배정되기 때문에, 다른 객체를 통해 "Hello" 값을 넣으면, 같은 주소(리터럴) 참조
											==> 같은 문자열이면 같은 주소를 갖는다.
					2) String s= new String("Hello"); --> new를 통해 생성하면, 메모리가 새로 배정됨.
											==> new를 통해 생성하면, 같은 문자열이어도 다른 주소를 갖는다. 


*/
public class _11_라이브러리_String_이론
{
	public static void main(String[] args)
	{											// String Constant Pool영역은 heap내에 문자열 리터럴을 저장하는 공간
		String s1="Hello";						// 리터럴 영역에 저장	(String Constant Pool영역의 100번지)
		String s2="Hello";						// 리터럴 영역에 저장	(리터럴 영역의 100번지)
		String s3=new String("Hello");			// 새로운 메모리에 저장	(heap 영역의 200번지)
		if(s1==s3)
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 같지 않다");
				
		// 실제로 저장된 데이터값이 같은지 확인 --> equals()
		
		if(s1.equals(s3))
			System.out.println("저장된 값이 같다");
		else
			System.out.println("저장된 값이 같지 않다");
		
		String ss="Hello";
		String ss1=" Java";
		String ss2=ss+ss1;
		System.out.println(ss2);				// 문자열 결합시, 새로운 메모리를 계속 생성하므로 속도가 늦어짐
		
		
	}
}
