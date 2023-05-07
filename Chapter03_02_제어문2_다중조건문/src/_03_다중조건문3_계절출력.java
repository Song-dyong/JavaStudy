/*
	계절 출력
	3 4 5 	=> 봄
	6 7 8	=> 여름
	9 10 11	=> 가을
	12 1 2 	=> 겨울

*/
public class _03_다중조건문3_계절출력 {
	public static void main(String[] args) {
		
		int month =(int)(Math.random()*12)+1;
		
		if(month == 3 || month == 4 || month == 5)
		{
			System.out.println(month+"월은 봄입니다.");		// && 를 통해 범위 지정 or || 통해 개별 지정
		}
		else if(month >= 6 && month <= 8)
		{
			System.out.println(month+"월은 여름입니다.");
		}
		else if(month == 9 || month == 10 || month == 11)
		{
			System.out.println(month+"월은 가을입니다.");
		}
		else if(month == 12 || month == 1 || month == 2)
		{
			System.out.println(month+"월은 겨울입니다.");
		}
		
		
		
	}
}
