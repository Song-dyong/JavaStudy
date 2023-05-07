import java.util.Scanner;

public class _연습_01_로그인만들기 {
	static String isLogin(String id, String pwd)
	{
		String[] ids= {"song","do","yong"};
		String[] pwds= {"1234","2345","5678"};
		String[] names= {"송두용","송두옹","송두영"};
		
		boolean bCheck=false;
		int index=0;
		
		// id에 입력된 값과 ids(데이터베이스)에 저장된 데이터가 일치하는지 확인
		for(int i=0;i<ids.length;i++)
		{
			if(id.equals(ids[i]))
			{
				bCheck=true;
				index=i;
				break;
			}
		}
		String result="";
		// id와 pwd 일치하는지 확인
		
		if(bCheck==true)
		{
			if(pwd.equals(pwds[index]))
			{
				result=names[index];
			}
			else
			{
				result="nopwd";
			}
				
		}
		else
		{
			result="noid";
		}
		
		return result;
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("id 입력: ");
		String id=scan.next();
		System.out.println("password 입력: ");
		String pwd=scan.next();
		
		String result=isLogin(id, pwd);
		
		if(result.equals("noid"))
		{
			System.out.println("아이디가 존재하지 않습니다.");
		}
		else if(result.equals("nopwd"))
		{
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else
		{
			System.out.println(result+"님 로그인되었습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		process();
	}
}
