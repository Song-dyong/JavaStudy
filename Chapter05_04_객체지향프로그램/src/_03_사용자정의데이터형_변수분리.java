/*
		1. 같은 자바파일에 클래스를 여러개 만들 수 있음.
			-> public은 한 개의 class에서만 사용 가능 (1개의 파일에는 1개의 public)
		
		2. 권장 사항: 파일을 따로 만들 것
		
		멤버변수 (인스턴스변수)
		------------------
		1. 기본형
		2. 배열
		3. 클래스
*/
// ex) 망고플레이트
class Category
{
	int no; 			// -> 카테고리 구분 
	String poster;
	String title;
	String subject;
}
class FoodHouse
{
	int no;										// 중복이 안된 숫자	=> primary key => 상세보기 (구분문자)
	int cnp;									// 카테고리 번호 => 클릭시, 같은 카테고리 모음 불러오기 => 참조키 => foreign key (oracle) 
	String[] poster=new String[5];
	String name;
	double point;
	String address1, address2;
	String tell;
	String type;
	String price;
	String parking;
	String sTime,eTime;
	String lastOrderTime;
	String holiday;
	String menu;
	
}
public class _03_사용자정의데이터형_변수분리
{
	public static void main(String[] args)
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
