import java.util.Scanner;

// char형 변수 ch가 공백이고 탭이 아닐 때, true인 조건식 작성



public class _문제_09 {
	public static void main(String[] args) {
		
		char ch='A';
		boolean a = !(ch==' ' && ch== '\t');
		System.out.println(a);
		
		
	}
}
