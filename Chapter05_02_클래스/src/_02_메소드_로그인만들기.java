/*
		ID, PWD 받아서 로그인 처리

		리턴형은 경우의 수
		2개가 나올 때, boolean
		3개가 나올 때, int or String
			ex) 로그인에 ID가 없는 경우			-> 1	noID
				ID는 존재 / 패스워드가 틀린 경우	-> 2	noPWD
				ID와 패스워드가 같은 경우		-> 3	LOGIN	==> 숫자로 들어갈 경우, 유지보수에 불편 WHY? 그 숫자가 의미하는 변수를 모르기 때문에
				----------------------------------				문자열로 처리하는 편이 가독성이 훨씬 좋음 
				재사용이 용이해야함
				견고해야함
				가독성이		==> 재사용성 / 경고성 / 가독성 
				

*/

import java.util.Scanner;
public class _02_메소드_로그인만들기 {
	static String isLogin(String ID, String PWD)
	{
		String []ids= {"hong", "park","shin","lee","kang"};				// 이 데이터는 file 혹은 oracle에 저장되어 있을 것
		String[] pwds= {"1234","3456","4567","5678","6789"};			// 이렇게 저장한 데이터는 메모리에 저장되어 있으므로, 휘발성 데이터
		String[] names= {"홍길동","박문수","심청이","이순신","강감찬"};			// file 혹은 oracle에 저장해야 데이터가 지워지지 않음
		
		// id 검색
		int index=0;
		boolean bCheck=false;
		for(int i=0;i<ids.length;i++) {
			if(ID.equals(ids[i]))
			{
				bCheck=true;			// id가 존재한다
				index=i;				// index번호 저장 why? ids,pwds,names의 순서를 고정시키기 위해
				break;
			}
		}
		String result="";
		if(bCheck==true)
		{// id 존재 -> 비밀번호 검색
			if(PWD.equals(pwds[index]))
			{
				result=names[index];	// 로그인된 상태
			}
			else
			{
				result="NOPWD";	//비밀번호가 틀리다
			}
			
		}
		else
		{//id 없음
			result="NOID";
		}
		
		return result;
		
		}	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String ID=scan.next();
		System.out.println("비밀번호 입력: ");
		String PWD=scan.next();
		
		// 로그인 검사
		String result=isLogin(ID, PWD);
		
		if(result.equals("NOID"))
		{	// ID가 없는 상태
			System.out.println("아이디가 존재하지 않습니다.");
		}
		else if(result.equals("NOPWD"))
		{	// 비밀번호가 틀린상태
			System.out.println("비밀번호가 틀립니다.");			
		}
		else
		{	// 로그인된 상태
			System.out.println(result+"님 로그인되었습니다.");
		}
		
	}
	public static void main(String[] args) {
		process();
	}
}	
