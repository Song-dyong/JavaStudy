package com.sist.io2;

import java.util.*;
import java.io.*;
public class StudentSystem
{
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList=new ArrayList<Student>();
	// 파일을 읽어서 메모리에 저장
	static {
		FileReader fr=null;											// fr을 지역변수로 잡을 경우, 반드시 초기값을 부여 (null)
													// new FileReader를 지역변수로 잡지 못하는 이유 => 예외처리를 위해 try`catch절에 써야하므로
		try
		{
			fr=new FileReader("c:\\java_datas\\school.txt");		 
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			// 홍길동|90|90|90|270|90.00\r\n				// \r은 .... 뭐;
			String[] stds=sb.toString().split("\n");	// school 파일에 저장된 여러 줄의 데이터를 1줄씩 잘라서, stds에 저장 => 학생별 구분
			for(String ss: stds)
			{
				StringTokenizer st=new StringTokenizer(ss,"|");	// 1줄 마다 "|" 기준으로 데이터 자르기		=> 학생별 데이터 구분
				Student s=new Student();						// 일단 저장할 공간을 만들어주기
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total=s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
		} catch (Exception e){
			e.printStackTrace(); 		// 에러 위치 확인
		}
		finally {
			try
			{
				fr.close();				// 파일리더를 미리 선언한 뒤, 무조건 수행하는 finally에서 fr.close() 해주기
			} catch (Exception e){}
		}
	}
	
	public int menu()
	{
		System.out.println("====메뉴====");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("===========");
		
		int no=0;
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));	// 키보드값 읽는 IO (예외처리 필수 --> Scanner 대체)
			System.out.print("메뉴번호 입력: ");
			String str=in.readLine();
			no=Integer.parseInt(str);
		} catch (Exception e)
		{
		}
		return no;
	}
	
	
	public void process() {
		while(true)
		{
			int no=menu();
			if(no==5)
			{
				System.out.println("프로그램 종료");
				FileWriter fw=null;									// 한글 저장시, FileWriter가 편리
				try
				{
					fw=new FileWriter("c:\\java_datas\\school.txt");
					// 자바 프로그램과 파일 연결	=> 스트림 (출력 스트림)
					// 2byte씩 전송한다 (문자 스트림)
					String temp="";
					for(Student ss:stdList)
					{
						temp+=ss.getHakbun()+"|"+ss.getName()+"|"+ss.getKor()+"|"+ss.getEng()+"|"+ss.getMath()+"\n";
						// temp 안에 ss 정보 묶어두기
						
					}
					fw.write(temp);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				finally {
					try
					{
						fw.close();				// IOException --> 예외처리 필수!
					} catch (Exception e2)
					{
					}
				}
				break;
			}
			else if(no==1)
			{
				for(Student ss:stdList)
				{
					int total=ss.getKor()+ss.getEng()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);
					System.out.println(ss.getHakbun()+" "
							+ss.getName()+" "
							+ss.getKor()+" "
							+ss.getEng()+" "
							+ss.getMath()+" "
							+ss.getTotal()+" "
							+String.format("%.2f",ss.getAvg()));
				}
			}
			else if(no==2)
			{
				try
				{
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.print("이름 입력: ");
					String name=in.readLine();
					System.out.print("국어점수 입력: ");
					String kor=in.readLine();
					System.out.print("영어점수 입력: ");
					String eng=in.readLine();
					System.out.print("수학점수 입력: ");
					String math=in.readLine();
					
					int max=0;
					for(Student ss:stdList)				// 학번은 순차적으로 오르도록 설정
					{
						if(ss.getHakbun()>max)
						{
							max=ss.getHakbun();
						}
					}
					
					Student s=new Student();
					s.setName(name);
					s.setHakbun(max+1);					// 시퀀스 작업 => 자동 증가 번호 만들기 -> 구분자
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					stdList.add(s);
				} catch (Exception e)
				{
					
				}
			}
			else if(no==4)
			{
				try
				{
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("학번 입력: ");
					String hak=in.readLine();
					int i=0;
					for(Student ss:stdList)
					{
						if(ss.getHakbun()==Integer.parseInt(hak))
						{
							stdList.remove(i);					// stdList.remove(ss);	==> int i와 break, i++ 필요 없음
							break; 								// object를 매개변수로 stdList에서 주소 찾기 or index번호로 찾기
						}
						i++;
					}
				} catch (Exception e)
				{
				}
				
			}
		}
	}
}
