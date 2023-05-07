import java.util.Arrays;

/*
		매개변수 전송법
		
			1) Call By Value	: 일반 기본형 데이터 전송 (String)		==> 생성된 메소드의 변수명은 새로운 메모리값을 갖는다 -> 데이터만 가져오기 때문에 value 
																		 값만 전송 call by value
			2) Call By Reference: 주소값을 넘겨주는 방식 (배열, 클래스)		==> 배열과 클래스의 경우, 주소를 참조하기 때문에, 메모리에 새로운 데이터를 형성하지 않는다.
																		call by reference


*/
public class _02_메소드_매개변수전송법 {
	
	static void swap2(int[] arr2)
	{
		System.out.println("arr2의 주소:"+arr2);
		System.out.println("교환 전 arr2[0]: "+arr2[0]+"  arr2[1]: "+arr2[1]);
		int temp=arr2[0];
		arr2[0]=arr2[1];
		arr2[1]=temp;
		System.out.println("교환 후 arr2[0]: "+arr2[0]+"  arr2[1]: "+arr2[1]);
	}
	
	static void swap(int x, int y)
	{
		System.out.println("qx="+x+" y="+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x="+x+" y="+y);
	}
	
	static void swap3(String id, String pwd)
	{
		System.out.println("교환 전 id: "+id+"  비밀번호: "+pwd);
		String temp=id;
		id=pwd;
		pwd=temp;
		System.out.println("교환 후 id: "+id+"  비밀번호: "+pwd);
		
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("a="+a+" b="+b);			// 값만 전송 => call by value => 기본형
		
		int[] arr= {10,20};
		System.out.println("arr= "+arr);			// 주소 전송 => call by reference => 배열, 클래스 (메스도 자체에서 변경이 가능)
		swap2(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("교환 후 arr[0]: "+arr[0]+"  arr[1]: "+arr[1]);

		String id="admin";
		String pwd="1234";
		
		swap3(id,pwd);
		System.out.println("교환 후 id: "+id+"  비밀번호: "+pwd);		// String의 경우, call by value	
																// why? String은 클래스이지만, 기본형으로 많이 쓰이므로, call by value
		
		
		
		
		
	}
}
