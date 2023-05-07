// while문을 사용하는 예시 --> 갯수가 확인 안되는 파일 읽기.

import java.io.FileReader;
import java.util.Scanner;
public class _04_반복문_while문활용_file읽기연습 {
	public static void main(String[] args) {
		try {
			int i=0;
			FileReader fr=
					new FileReader("C:\\javaDev\\javaStudy\\Chatper3_05_제어문_반복문_2\\src\\_03_반복문_배수의합과갯수.java");
			while((i=fr.read())!=-1) // -1 파일 종료 (문장의 끝까지 읽기) EOF : End of File
			{
				System.out.print((char)i);	// 읽기 위한 명령 --> if? network file --> 파일 전송 가능
			}
		}catch(Exception ex) {}
		
		
	}
}
