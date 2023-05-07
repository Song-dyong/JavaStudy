package com.sist.exception;

/*
		1. 예외처리 방법과 형식
			1) 직접처리 (예외복구) : 프로그래머 작업
					try
					{
						<실행 가능한 소스 코딩 (정상수행)>
					}catch(예외처리 종류)
					{
						<try 실행 중, 에러발생시 처리하는 부분>
							=> 예외를 복구하는 영역 --> 다중으로 사용 가능 (한 개로 통합 가능 Exception / Throwable)
							=> 순서 존재 --> 상위클래스를 아래에 작성
							=> try절이 정상수행할 경우, catch는 수행하지 않음
							=> try절에 에러 발생시에 에러발생문장 아래는 수행하지 않음 --> catch를 수행 (에러 복구) 후, 종료
							=> catch는 위에서 한 개씩 검색 (다중catch일 경우) --> 한 개의 catch 예외만 수행
					}
					finally
					{
						<반드시 수행되는 문장>
						ex) 서버 닫기, 오라클 닫기, 파일 닫기 등등
					}
					
			2) 간접처리 (예외회피) : 자바 or 오픈API
					예외에 대해 예측되는 예외클래스를 선언만 함
					=> 다른 메소드에서 호출할 경우, 처리 후 사용이 가능 (try~catch)
					=> 간접처리시에 예외클래스는 순서가 없음 
					=> UnCheckException은 사용하지 않고, 보통 CheckException만
					=> java.lang / java.util -> UnCheckException	   (!선택!)
					=> java.io / java.net / java.sql => CheckException (!필수!)
					형식)
						[접근지정어] 리턴타입 메소드명() throws 예외처리클래스, ...
							메소드() throws 예외처리클래스
							{
								메소드 호출
							}
							------------------------------
							메소드()		==> 권장사항 다른 클래스에서 사용할 때, throws를 계속 사용하지 않도록...
							{
								try
								{
									메소드 호출
								}catch(예외처리클래스)
								{
								}
							}
			
			3) 임의발생 : 테스트용으로 보통 사용
					throw new 예외처리클래스(); ==> 해당 예외처리 클래스가 있는 catch로 이동
			4) 사용자 정의 :
					예외처리클래스를 상속 받아서 처리
					class MyException extends Exception
									  -----------------> 보통 if~else로 처리하기때문에 자주 등장하지 않음

*/
public class _01_예외처리정리
{
	public static void main(String[] args)
	{
		
	}
}
