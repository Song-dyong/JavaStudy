package com.sist.main4;

import com.sist.main3.Student;

import java.util.Scanner;
public class StudentSystem
{
	private Student[] std = new Student[3];		// Student클래스에서 선언한 6개의 데이터를 가진 클래스 덩어리 3개의 배열을 잡았음
												// 단! 여기서 데이터값은 입력되지 않은 상태 --> 초기화 必
	// 1. 학생 초기화
	/*		1) 명시적 초기화 => 객체 생성시 모든 객체값이 동일
	  		---------------------------------
	  		2) 생성자 이용
	  		3) 초기화 블록
			4) 메소드 이용
	------------------------------------> 입력값을 받거나 외부에서 데이터를 읽을 경우
													  ---------------------> 크롤링, 파일
													  
		--> 아래의 경우, 메소드 이용!
		
		class 영역에서는 선언 / 선언과 동시에 초기화만 가능 (명시적 초기화)
			class 영역에서는 제어문, 외부 라이브러리 불가 (다른 블록 {메소드, 생성자, 초기화블록} 에서 사용해야함)
		
	*/
	public void init()
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{											// 배열로 메모리 할당 --> 반복문을 통해 만들어진 배열에 주소값 할당
			std[i]=new Student();					// 배열은 모든 저장공간이 null 값 --> 메모리 연결을 못함 --> sdt[i] 번째마다 new Student() 를 줘야 
			System.out.println((i+1)+"번째 학생의 학번 입력");												// 					저장공간이 생성되고, 
			std[i].setHakbun(scan.nextInt());											// 아래의 입력이 가능
			System.out.println("이름 입력");					// A a=new A(); / A b=new A(); / A c= new A();  
			std[i].name=scan.next();						// A[] aa= new A[3]; --> aa[i] = new Student(); 반복문 돌려서 한번에 채우기
			System.out.println("국어 영어 수학 점수 입력: ");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
			System.out.println("성별 입력");
			std[i].setSex(scan.next());
		}
		
	}
	// 1-1 출력
	public void display()	// void 는 default이므로, 다른 패키지에서 사용 x  ==> 따라서, public 메소드로 설정해야 다른 클래스에서 사용 가능.
	{
		for(Student s: std)
		{
			System.out.println(s.getHakbun()+" "
					+ s.name+ " "
					+ s.getKor() + " "
					+ s.getEng() + " " 
					+ s.getMath() + " " 
					+ s.getSex() + " "
					+ s.getTotal() + " "
					+ s.getAvg() + " "
					+ s.getScore() + " "
					+ s.getRank() + " ");
		}
	}
	// 2. 평균 구하기
	public void stdAvg()
	{
		for(int i=0;i<std.length;i++)
		{
			std[i].setAvg(std[i].getTotal()/3.0);	// 비공개
//			std[i].avg=std[i].getTotal()/3.0 		--> 공개
		}
	}
	// 3. 총점 구하기
	public void stdTotal()
	{
		for(int i=0;i<std.length;i++)
		{
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());	
		}
	}
	
	// 4. 학점 구하기
	public void stdScore() {
		
		char c='A';
		for(int i=0;i<std.length;i++)
		{
			switch((int)(std[i].getAvg())/10)
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='c';
				break;
			case 6: 
				c='d';
				break;
			default:
				c='F';
			}
			std[i].setScore(c);
		}
	}
	
	// 5. 등수 매기기
	public void stdRank() {
		for(int i=0;i<std.length;i++)
		{
			std[i].setRank(1);
			for(int j=0;j<std.length;j++)
			{
				if(std[i].getTotal()<std[j].getTotal())
				{
					std[i].setRank(std[i].getRank()+1);
				}
			}
		}
	}
	
	
}
