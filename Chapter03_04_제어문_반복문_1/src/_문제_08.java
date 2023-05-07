//2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
public class _문제_08 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i =2;i<=100;i+=2)			// int i 는 for문의 블럭 내에서만 사용 (지역변수)
		{
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
