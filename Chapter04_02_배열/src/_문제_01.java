//	1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.
/*
		반복 제어문
		=> 특정 부분을 제외하고, 반복 수행(continue)
			while: 조건식으로 이동
			for  : 증감식으로 이동
		=> 반복 종료(break)



*/
public class _문제_01 {
	public static void main(String[] args) {
		
		int sum=0, i=1;
		while (i<100) {
		if(i%3 != 0) {
		i++;
		continue;
		}
		else sum += i;
		i++;
		}
		System.out.println("sum="+sum);
	}
}
