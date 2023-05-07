import java.util.Arrays;

// 알파벳 정렬하기
/*		
 for문 내에서 i=0
		B	C	A	E	D		=> ASC (ABCDE) / DESC (EDCBA)
		-	-
		B	C
		-		-
		A		B
		-			-
		A			E
		-				-
		A				D	=> 1ROUND
		-----------------
 for문 내에서 i=1
		A	C	B	E	D
			-	-
			B	C
			-		-
			B		E
			-			-
			B			D
		-----------------
 for문 내에서 i=2
		A	B	C	E	D	=> 2ROUND
				-	-
				C	E
				-		-
				C		D
		-----------------
 for문 내에서 i=3
 		A	B	C	E	D	=> 3ROUND
 					-	-
 					D	E
 		-----------------
		A	B	C	D	E	=> 4ROUND
 for문 내에서 i=4
 		-> 비교할 대상이 없음 --> length-1로 범위 줄이기
 
*/

public class _08_배열응용_알고리즘2_알파벳정렬 {
	public static void main(String[] args) {
		char [] alpha= new char[26];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((int)(Math.random()*26)+65);
			for(int j=0;j<i;j++) 									
			{
				if(alpha[i]==alpha[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println("=========정렬 전=========");
		System.out.println(Arrays.toString(alpha));
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
		}
		System.out.println("========정렬 후(ASC)========");
		System.out.println(Arrays.toString(alpha));
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				if(alpha[i]<alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
		}
		System.out.println("========정렬 후(DESC)========");
		System.out.println(Arrays.toString(alpha));
	}
}
