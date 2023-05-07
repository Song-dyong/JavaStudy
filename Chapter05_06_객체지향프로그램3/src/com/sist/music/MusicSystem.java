package com.sist.music;

import java.util.Scanner;

public class MusicSystem
{
	Music[] music=new Music[50];	// null값 들어간 상태 -> 배열 생성이 곧 메모리 형성은 아님	-> new 연산자를 통해 주소값 형성하기
									// 배열은 50개의 공간만 생성 -> null 
	// 1. 메소드로 배열에 값 채우기 but! 원래는 생성자를 써야함
	
	void init()
	{
		/*
			인스턴트: 객체생성 -> 객체명.변수 / 배열...
			static: 클래스명.배열명 
			
			int[] arr=new int[10];
			for(int i=0;i<10;i++)
			{
				arr[i]=(int)(Math.random()*100)+1;
			}
			--> 기존에 값을 집어넣는 방식
			클래스의 경우, 주소값을 채워야 함
		*/
		for(int i=0;i<MusicData.title.length;i++)
		{
   //			music[i].title=MusicData.title[i];
		//	System.out.println("메모리 할당 전: music["+i+"]="+music[i]);
			music[i]=new Music();	// Music크기의 메모리 공간을 50개 생성
		//	System.out.println("메모리 할당 후: music["+i+"]="+music[i]);
			music[i].title=MusicData.title[i];
			music[i].singer=MusicData.singer[i];
			music[i].album=MusicData.album[i];
			music[i].state=MusicData.state[i];
			music[i].modify=MusicData.modify[i];
			
		}

	
	
	}
	
	int menu()
	{
		System.out.println("========menu========");
		System.out.println("1. 목록보기");
		System.out.println("2. 검색");
		System.out.println("3. 상세보기");
		System.out.println("9. 프로그램 종료");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴 선택:");
		return scan.nextInt();
		
	}
	// 뮤직 배열 자체가 목록이므로 리턴형을 Music[]로 잡기
	Music[] musicListData()
	{
		return music;
	}
	Music musicDetailData(int no)
	{
		return music[no-1];
	}
	Music[] musicFindData(String title)
	{
		int count=0;
		for(Music mm: music)
		{
			if(mm.title.contains(title))
			{
				count++;
			}
		}
		Music[] m=new Music[count];
		int i=0;
		for(Music mm: music)
		{
			if(mm.title.contains(title))
			{
				
				m[i]=mm;
				i++;
			}
		}
		return m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args)
//	{
//		MusicSystem ms=new MusicSystem();
//		ms.init();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("검색어 입력:");
//		String title=scan.next();
//		Music[] data=ms.musicFindData(title);
//		int i=1;
//		for(Music m:data)
//		{
//			System.out.println(i+"."+m.title);
//			i++;
//		}
//		System.out.println("================");
//		System.out.println("상세보기(1~50):");
//		int no=scan.nextInt();
//		Music mm=ms.musicDetailData(no);
//		System.out.println("곡명: "+mm.title);
//		System.out.println("가수명: "mm.singer);
//		System.out.println("앨범: "+mm.album);
//		System.out.println("상태: "+mm.state);
//		System.out.println("변동폭: "+mm.modify);
//	}
	
	
}
