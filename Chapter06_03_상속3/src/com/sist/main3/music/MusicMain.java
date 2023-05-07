package com.sist.main3.music;
import java.util.*;

/*
	객체지향 --> 묶는 것
	
	1. 관련된 데이터를 묶는다
		배열 / 클래스
	2. 관련된 명령문을 묶는다
		메소드
	3. 관련된 클래스를 묶는다
		상속 / 인터페이스
		=> 상속: 하위클래스에서 기능을 추가하게 되면, 접근할 수가 없음 (보완 -> 인터페이스)
	--------------------
	4. 	상속
		접근지정어
			-> default / protected / public 상속, 접근 가능 
			-> private 상속 가능 but! 접근 불가능 (사용 불가능) 
		--------
		제어어
			-변수: 접근지정어, static, final
			-메소드: 접근지정어, static, final, abstract
			---------
			-생성자: 접근지정어만 사용
			

*/
public class MusicMain
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(Genie(1), Melon(2)): ");
		int select=scan.nextInt();
		// 상속 --> 클래스 통합
		/*
			상속
			-> 객체 생성 
			-> 상위클래스 = 하위클래스
			  -------------------
		
		
		*/
		GenieMusicSystem ms=null;
		if(select==1)
			ms=new GenieMusicSystem();
		else
			ms=new MelonMusicSystem();
		
		// 1. 목록 출력
		Music[] music=ms.musicAllData();
		for(Music m:music)
		{
			System.out.println(m.getRank()+". "+m.getTitle());
		}
		
	}
}
