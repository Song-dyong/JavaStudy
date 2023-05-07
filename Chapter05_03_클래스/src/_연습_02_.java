// char를 한 개 보내서 => 대문자 / 소문자 확인 => 리턴형: boolean (2개 중 하나이므로)


public class _연습_02_
{
	static String check(char c)
	{
		String result="";
		boolean bCheck=false;
		if(c>='A'&&c<='Z')
		{
			result="대문자입니다";
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		
	}
}
