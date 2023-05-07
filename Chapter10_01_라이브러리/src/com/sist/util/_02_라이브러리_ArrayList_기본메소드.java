package com.sist.util;
//ArrayList => 사용빈도가 가장 많다
//배열과 유사 / 인덱스번호를 사용 -> 자동으로 지정
//순차적 ( 인덱스: 0~...)
//가변형 -> 크기를 지정하지 않는다
/*
	생성
	---
	List list = new ArrayList(); => 기본 생성자: 메모리 10개 생성, 추가할 때마다 10개씩 증가
	ArrayList list = new ArrayList();


*/

import java.util.ArrayList;

public class _02_라이브러리_ArrayList_기본메소드
{	
	public static void main(String[] args)
	{
		// 생성
		ArrayList list=new ArrayList();		// 제네릭스가 없으면 경고! --> 기본 디폴트: Object
		// list 내에는 모든 데이터형이 들어갈 수 있음
		// 가급적이면, 같은 데이터형을 첨부하는 것이 좋음
		// list라는 공간에 데이터 추가
		// 여러 데이터형을 혼합해서 넣어두면, for문을 돌리기 힘듦
		// 이름 관리
		list.add("홍길동"); // index=0
		list.add("박문수"); // 1
		list.add("심청이"); // 2 -> 3 -> 4
		list.add("춘향이"); // 3 -> 4 -> 5
		list.add("이순신"); // 4 -> 5 -> 6
		list.add(2, "강감찬"); // 2 --> 위의 인덱스 2번으로 들어가고, 나머지는 하나씩 뒤로 밀림
		list.add(3, "을지문덕"); // 3 
		list.add("박문수"); // 7
		// 출력
		// 데이터 추가: .add(Object o) / .add(int index, Object o) 단, 인덱스 번호에 개입하면 처리시간이 길어지므로 가능한 지양할 것.
		// 저장된 갯수: .size()
		// 데이터 출력: .get(int index)
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		//
		System.out.println("==============삭제==============");
		//데이터 삭제
		/*
		0. 홍길동
		1. 박문수
		2. 강감찬
		//3. 을지문덕	-> 삭제 -> 3번 사라짐 -> 뒷 번호가 앞으로 땡겨짐
		3. 심청이				=> 생략되는 번호없이 순차적으로 설정된다
		4. 춘향이
		5. 이순신
		*/
		list.remove(3);
		list.remove("박문수");		// .remove(int index or Object o) => (중복이 있을 때) 실제값으로 삭제할 경우, 가장 앞의 것을 삭제
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		System.out.println("============수정===============");
		// 수정 => set(인덱스 번호, 변경할 데이터)
		list.set(0, "홍길수");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		// 저장된 갯수 확인
		System.out.println(list.size()+"명");
		System.out.println("======전체 삭제======");
		System.out.println(list.get(0));
		list.clear();
		System.out.println("인원수 :" + list.size());
		/*
			add(Object o)
			set(int index, Object o)
			remove(int index)
			Object get(int index)
			int size()
			clear()
		*/
	}
}
