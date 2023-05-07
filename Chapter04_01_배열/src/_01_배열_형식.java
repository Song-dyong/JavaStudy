/*
			배열 : 관련된 데이터를 여러 개 모아서 한 개의 이름으로 관리		cf) loosely couple ring : 결합성이 낮게 프로그램을 작성 --> 수정시, 다른 클래스에 영향이 적도록.
				  ----------			  ----------								ex) Spring 
					데이터형 동일
				1) 데이터를 배열로 모아서 관리 => 연속적인 메모리 공간을 만듦
											---------------★
											
				2) 고정적 / 한 번 지정되면 추가, 삭제가 불가 (단점) => 신축성X
						=> 이를 보완한 가변형 배열 (컬렉션 프레임워크 제공)
						
				3) 한 개의 이름으로 사용 (구분: 인덱스 -> 0번부터 시작)
					ex) 
						int a = 10, b = 20, c = 30, d = 40, e = 50;
						 	
						 	RAM (휘발성)								배열 => 데이터를 5개 만들어 줘	=> 배열 이름: arr 로 설정했을 때
						 0------------								-----------------------
							이클립스에서 사용 중							10 | 20 | 30 | 40 | 50
						 4------------								-----------------------
							  10 	--> a						   |   |    |    |    |
						 8------------							  100 104  108  112  116 
							이클립스에서 사용 중						=> 100+0*4	arr[0]		=> int기 때문에 4바이트씩 이동 / char면 2바이트 / double면 8바이트
						12------------							=> 100+1*4	arr[1]
							  20	--> b						=> 100+2*4	arr[2]
						16------------							=> 100+3*4	arr[3]
							이클립스에서 사용 중						=> 100+4*4	arr[4]
						20------------											|
							  30	--> c									index 번호: 0번부터 시작해서 갯수만큼
						24------------											=> 번호는 순차적으로 생성
							이클립스에서 사용 중										=> 갯수 확인: length (총 갯수 확인)
						28------------							
				
			<배열>
			
			1. 배열 선언법
				1)데이터형 [] 배열명;  => 권장사항							
				2)데이터형 배열명 [];  => C언어 파생 방법
				 
			2. 배열 초기화
				1) 선언과 동시에 초기화
					데이터형[] 배열명={10,20,30,40,5} => 5개를 동시에 저장하는 공간
					데이터형[] 배열명=new 데이터형[갯수];
						  ---(X)
					  new를 사용하면 자동으로 기본 디폴트값으로 채운다
						  byte, short, int => 0
						  long => 0L
						  char => '\0'
						  float => 0.0F
						  double => 0.0
						  boolean => false
						  
			3. 데이터 읽기
				int a=10;
				System.out.println(a);		=> 10 출력 
				int[] arr={10,20,30,40,50}
				System.out.println(arr[1])	 => 20 출력 (0이 첫 번째)
				
			4. 변경
				int a=10;
				a=20;
				
				int[] arr={10,20,30,40,50}
				arr[3]=200;
					=> arr={10,20,30,200,50}
				
			{ 변수 / 연산자 / 제어문 / 배열 }
				
			
	
		정수 5개 연속적으로 배치 => 배열
			--- 10000개? -> 배열
			
			같은 데이터형 3개 이상일 경우, 배열을 사용하는 것이 좋음
			
			데이터가 많을수록, 배열을 써서 모아야함
				
				
*/
public class _01_배열_형식 {
	public static void main(String[] args) {
		
//		int[] arr=new int[5];  // 0 0 0 0 0
//		
//		for(int i=0;i<5;i++)			// --> i<=5로 범위 지정할 경우, 범위 초과 에러  --> arr.length로 지정하면 자동으로 5 지정
//		{
//			System.out.println("arr["+i+"]="+arr[i]);
//		}
		
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		int a6=(int)(Math.random()*100)+1;
		int a7=(int)(Math.random()*100)+1;
		int a8=(int)(Math.random()*100)+1;
		int a9=(int)(Math.random()*100)+1;
		int a10=(int)(Math.random()*100)+1;
		
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		System.out.println("a3="+a3);
		System.out.println("a4="+a4);
		System.out.println("a5="+a5);
		System.out.println("a6="+a6);
		System.out.println("a7="+a7);
		System.out.println("a8="+a8);
		System.out.println("a9="+a9);
		System.out.println("a10="+a10);
		
		int max=a1;
		if(max<a2)
			max=a2;
		if(max<a3)
			max=a3;
		if(max<a4)
			max=a4;
		if(max<a5)
			max=a5;
		if(max<a6)
			max=a6;
		if(max<a7)
			max=a7;
		if(max<a8)
			max=a8;		
		if(max<a9)
			max=a9;
		if(max<a10)
			max=a10;
		System.out.println("max="+max);
// ==> 30줄이나 되는 소스코드 but! 배열 활용시?
		
		int[] arr=new int[100];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}
		int max1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max1<arr[i])
				max1=arr[i];
		}
		System.out.println("최대값: "+max1);
		// 9줄로 줄일 수 있음
		
	}
}
