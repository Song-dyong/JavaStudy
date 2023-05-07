
public class _문제_10 {
	public static void main(String[] args) {
		for(int i=66;i<79;i+=2)
			System.out.print((char)i+"   ");
		
		System.out.println();
		System.out.println("=========================");
		
		
		for(char c='B';c<='N';c+=2)				// char는 정수형으로 자동 변경 가능
		{
			System.out.print(c+"   ");
		}
	}
}
