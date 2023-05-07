package com.sist.generic;
import java.util.*;

class Sawon{
	// Object
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun()
	{
		return sabun;
	}
	public void setSabun(int sabun)
	{
		this.sabun = sabun;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getJob()
	{
		return job;
	}
	public void setJob(String job)
	{
		this.job = job;
	}
	public int getPay()
	{
		return pay;
	}
	public void setPay(int pay)
	{
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay)
	{
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	
}

public class _02_라이브러리_Generic2
{
	public static void main(String[] args)
	{
		List<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","대리",4500));
		list.add(new Sawon(2,"박문수","총무부","과장",5000));
		list.add(new Sawon(3,"이순신","기획부","사원",3500));
		list.add(new Sawon(4,"강감찬","자재부","부장",6500));
		list.add(new Sawon(5,"심청이","영업부","부장",6500));
		
		// 출력
		for(Sawon s:list)
		{
			System.out.println(s.getSabun()+" "+
								s.getName()+" "+
								s.getDept()+" "+
								s.getJob()+" "+
								s.getPay());
		}
		System.out.println("직원수: "+list.size());
		list.remove(2);
		System.out.println("---------------------");
		for(Sawon s:list)
		{
			System.out.println(s.getSabun()+" "+
								s.getName()+" "+
								s.getDept()+" "+
								s.getJob()+" "+
								s.getPay());
		}
		// 삭제 => remove 인덱스 2번 삭제 --> 속도가 느려진다.
		// List는 데이터 첨부, 읽기, 갯수만 담당
		// 오라클에서 삭제, 수정
		System.out.println("직원수: "+list.size());
		System.out.println("---------------------");
		Sawon sawon=new Sawon(6, "춘향이", "개발부", "사원",3500);
		list.set(3, sawon);		// 기존 인덱스 3번에 있던 데이터를 바꾸기
		for(Sawon s:list)
		{
			System.out.println(s.getSabun()+" "+
								s.getName()+" "+
								s.getDept()+" "+
								s.getJob()+" "+
								s.getPay());
		}
		
		list.clear(); 			// 데이터 전부 삭제
		System.out.println("직원수: "+list.size());
		
		// 단! 수정 및 삭제 작업은 오라클에서 하기 때문에 set은 쓸 일이 거의 없음
		// add / size / get / clear 정도만 사용 --> clear는 장바구니 초기화 작업에서 사용
		
		List a=new Vector<>();
	}
}
