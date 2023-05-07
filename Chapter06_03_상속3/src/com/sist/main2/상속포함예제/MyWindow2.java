package com.sist.main2.상속포함예제;
// 포함
// JFrame 클래스를 new를 통해 생성하여, 포함시킴 
import javax.swing.*;
public class MyWindow2					// has-a(포함)은 포함하고 있는 쪽의 크기가 더큼 --> MyWindows가 JFrame보다 크다
{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;		
	JFrame f= new JFrame();
	
	public MyWindow2()
	{
		la1=new JLabel("아이디");			//클래스 불러오기
		la2=new JLabel("비밀번호");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		f.setLayout(null);
		la1.setBounds(10, 15, 45, 30);	//생성자
		la2.setBounds(10, 50, 45, 30);	// 위치 정하기
		tf.setBounds(70, 15, 150, 30);
		pf.setBounds(70, 50, 150, 30);	
		JPanel p =new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		f.add(p);

		f.add(la1);f.add(tf);
		f.add(la2);f.add(pf);
		
		f.setSize(640, 480);	// 사이즈 지정
		f.setVisible(true);	// 보이게 하기  // if 자동로그인 필요? --> 생성자를 통해 로그인되도록 하기
		f.setSize(640, 480);		// f가 mywindow2 메소드에 존재하지 않으므로,  f.set~~ 를 써야함
		f.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MyWindow2();			
	}
}
