package com.sist.main2.상속포함예제;

// 상속
// 생성자, 초기화블록, static은 상속에서 제외

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame
{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;				
	
	public MyWindow()	// 생성자 --> 시작하자마자 동작 (윈도우창 띄우기)
	{
		la1=new JLabel("아이디");			//클래스 불러오기
		la2=new JLabel("비밀번호");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		setLayout(null);
		la1.setBounds(10, 15, 45, 30);	//생성자
		la2.setBounds(10, 50, 45, 30);	// 위치 정하기
		tf.setBounds(70, 15, 150, 30);
		pf.setBounds(70, 50, 150, 30);	
		JPanel p =new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		add(p);

		add(la1);add(tf);
		add(la2);add(pf);
		
		setSize(640, 480);	// 사이즈 지정
		setVisible(true);	// 보이게 하기  // if 자동로그인 필요? --> 생성자를 통해 로그인되도록 하기 
	}
	
	
	public static void main(String[] args)
	{
		MyWindow m = new MyWindow();
		
	}
}
