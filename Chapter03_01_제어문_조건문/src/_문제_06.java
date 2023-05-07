//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성


public class _문제_06 {
	public static void main(String[] args) {
		int i = (int)(Math.random()*2); // 0,1 구분
		int ch1 = (int)(Math.random()*26)+65; // ch--> 대문자가 숫자로 표현
		int ch2 = (int)(Math.random()*26)+97; 
		
		if(i==0)
		{
			System.out.println((char) ch1);
			System.out.println("대문자입니다.");
		}
		if(i==1)
		{
			System.out.println((char) ch2);
			System.out.println("소문자입니다.");
		}
		
	}
}
