/*
		반복제어문
			= break
				=> 반복문을 종료
				=> 반복문 (for, do~while, while), 선택문(switch~case)
				=> break문 밑에는 소스 코딩이 불가능
					ex)
						for()
						{
							if()
							{
								break;
									// 이 아래로 코딩 불가능
							}
						}
			= continue
				=> 특정 부분을 제외할 때 사용 (나머지 반복문은 계속 수행)
				=> 반복문(for, while, do~while)에서만 사용 가능
				=> Web에서는 특별한 경우에만 사용
				
*/
public class _01_반복제어문_break와continue {
	public static void main(String[] args) {
		System.out.println("====break====");
		for(int i =1;i<=10;i++)
		{
			System.out.print(i+"."+ " ");
			if(i==5)
				break; // 반복문 중단
			System.out.print(i+ " ");
		}
		/*		
				for => break는 종료 / continue는 증가식으로 이동
				
				while => break는 종료 / continue는 조건식으로 이동 
										=> 처음부터 다시 실행할 경우
											---------- 잘못하면 무한루프에 걸릴 수 있음
												ex) int i = 1;
													while(i<=10)
													{
														if(i==5)				=> 5에서 무한루프 
															continue;			=> 게임에서 잘못된 입력으로 처음으로 다시 돌아갈 때
														System.out.print(i+" ");
														i++;
													}
				
		*/		
		System.out.println("\n=====continue=====");
		for(int i = 1; i<=10;i++)
		{
			if(i==5 || i==7 || i==9)
				continue;					// i++로 이동 / 아래로 이동 X 
			System.out.print(i+" ");
		}
		
		
	}
}

