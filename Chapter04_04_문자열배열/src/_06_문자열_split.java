
public class _06_문자열_split {
	public static void main(String[] args) {
		String menu=
							"원조김밥"
						+ " 2,500원"
						+ "쌀떡볶이"
						+ " 3,500원"
						+ "찹쌀순대"
						+ " 3,500원"
						+ "라면"
						+ " 3,500원"
						+ "쫄면"
						+ " 5,500원";
		System.out.println(menu);
		String[] menus=menu.split("원");				// split => "원"을 기준으로 배열 형성
		for(String m:menus)							// 문자열이 붙어있어도, 배열 형성 가능 (split)
		{
			System.out.println(m+"원");
		}
		
		
	}
}	
