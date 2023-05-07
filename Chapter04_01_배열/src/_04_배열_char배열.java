import java.util.Arrays;

/*
		



*/
public class _04_배열_char배열 {
	public static void main(String[] args) {
		char[] arr=new char[20];
		int cnt1=0,cnt2=0;
		for(int i=0;i<arr.length;i++)
		{
			int n= (int)(Math.random()*2);	// 0 / 1 발생 -> 0이면 대문자 / 1이면 소문자
			if(n==0)
			{
				arr[i]=(char)((Math.random()*26)+65);
				cnt1++;
			}
			else
			{
				arr[i]=(char)((Math.random()*26)+97);				
				cnt2++;
			}
		}
		System.out.println(Arrays.toString(arr));
//		int cnt1=0,cnt2=0;
//		for(char c:arr)
//		{
//			if(c>='A'&&c<='Z')
//				cnt1++;
//			else
//				cnt2++;
//		}
		
		System.out.println("대문자 갯수:"+cnt1);
		System.out.println("소문자 갯수:"+cnt2);
		
		
	}
}
