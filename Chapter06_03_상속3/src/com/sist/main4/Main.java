package com.sist.main4;

public class Main
{
	public static void main(String[] args)
	{
		Human man=new Human();
		man.setData("gildong");
		System.out.println(man.getData());
		Student s=new Student();
		s.setData("sim");
		System.out.println(s.getData());
		System.out.println(man.getData()); // Human 클래스의 name 데이터는 static으로 설정되어 있기 때문에, 상속 받은 Student 클래스에서도 
											// Method Area의 static 공간에 생성된 name 값을 참조 --> s.setData로 이름을 바꾸면,
											// Human과 Student의 name 값이 동시에 변경된다.
	}
}
