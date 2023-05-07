package com.sist.lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _05_라이브러리_Object_toString2 extends JFrame implements ItemListener
{
	JComboBox /*<String>*/box;								// 제네릭스로 String 고정시키면, 아래의 addItem은 Object 리턴이 아닌 String 리턴!
	JLabel la;
	public _05_라이브러리_Object_toString2() {			// 생성자
		box=new JComboBox();
		box.addItem("홍길동");  							// 보통 라이브러리는 Object를 리턴값으로 돌려주기 때문에, 형변환 필수 (기존에 어떤 형으로 사용했는지 기억)
		box.addItem("심청이");  							
		box.addItem("박문수");  	
		la=new JLabel();
		
		// 배치하기
		add("North",box);
		add("Center", la);
		
		setSize(300, 300);
		setVisible(true);
		
		box.addItemListener(this);
	}
	
	public static void main(String[] args)
	{
		new _05_라이브러리_Object_toString2();				// 객체 주소를 기억할 필요없는 경우(객체 생성) --> new 클래스명(); 로 바로 실행 가능
	}

	@Override
	public void itemStateChanged(ItemEvent e)		// 콤보박스의 선택이 바꼈을 때, 처리할 내용
	{
		if(e.getSource()==box)
		{
			String name=(String) box.getSelectedItem();		// name은 String이므로, box.get... 을 (String) or .toString()로 형변환해야함 
			//String name= box.getSelectedItem().toString(); 
			// String.valueOf(box.getSelectedItem())	--> 문자열 변환 3번째 (가장 많이 사용됨)
			la.setText(name);								// 선택시, 그 이름을 가운데로 가져옴
		}
	}
}
