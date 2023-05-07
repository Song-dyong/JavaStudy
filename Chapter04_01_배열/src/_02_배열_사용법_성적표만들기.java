/*		
 		세 학생의 국영수 총점, 평균, 학점, 등수   ==> 변수가 21개 ==> 국 / 영 / 수 / 총점 / 평균 / 학점 / 등수 
 		
 		[3][7] => 2차원 배열 -> 1개의 배열로 줄일 수 있음 but! 웹에서는 컬렉션을 활용하기 때문에 사용할 일 X 
 		

*/
import java.util.Scanner;
public class _02_배열_사용법_성적표만들기 {
	public static void main(String[] args) {
		
		int [] kor=new int[3];	// 0 1 2
		int [] eng=new int[3];	// 0 1 2
		int [] math=new int[3]; // 0 1 2
		
		int [] total=new int[3];
		double[] avg = new double[3];
		char[] score = new char [3];
		int [] rank=new int[3];
		
		// Object[][] student=new Object[3][7]; ==> Object는 모든 데이터 통합
//		Object o=10;			=> 모든 데이터를 통합 관리하기 때문에, 간단하게 코딩 가능.
//		o=10.5;
//		o='A';
		Scanner s=new Scanner(System.in);
		for(int i =0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 국어점수 입력:");
			kor[i]=s.nextInt();
			System.out.print((i+1)+"번째 영어점수 입력:");
			eng[i]=s.nextInt();
			System.out.print((i+1)+"번째 수학점수 입력:");
			math[i]=s.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		// 학점 계산
		for(int i= 0; i<kor.length;i++)
		{
			switch((int)avg[i]/10)						// 10으로 나누지 않으면, case 100~ 60까지 다 적어야 함
			{
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
			default:
				score[i]='F';
			}
		}
		
		// 등수계산
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0; j<kor.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		
		
		System.out.println("============성적표===========");
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%-5d\n",
									kor[i], eng[i], math[i], total[i], avg[i],score[i],rank[i]);
		}
		
		
		
	}
}
