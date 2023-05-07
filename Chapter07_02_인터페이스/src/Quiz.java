/*
	1. 자바의 상속에 대한 설명 중 틀린 것은?	1
1) 자바는 다중 상속을 허용한다. ==> 인터페이스는 다중 구현...
2) 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다. ==> 가능  
3) 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다.  cf) 상속은 되지만, 접근이 안됨  (상속의 예외조건)
4) final 클래스는 상속할 수 없고, final 메소드는 오버라이딩 할 수 없다. 	상속에서 제외되는 것들 => static / 생성자 / 초기화블록 / private
			final은 상속x / 오버라이딩x ==> final은 있는 그대로 사용 System, Math, String(final 클래스)


	2. 클래스 타입 변환에 대한 설명 중 틀린 것은?	2	
1) 자식 객체는 부모 타입으로 자동 타입 변환된다. 		==> class 동물 -> class 사람 extends 동물 ==> 동물 a=new 사람(); 동물 b=new 동물(); => 사람, 동물 가능 
2) 부모 객체는 항상 자식 타입으로 강제 타입 변환된다.
3) 자동 타입 변환을 이용해서 필드와 매개 변수의 다형성을 구현한다.
4) 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다.

	3. final 키워드에 대한 설명으로 틀린 것은?   1				final => 상수 변수
1) final 클래스는 부모 클래스로 사용할 수 있다.			static final  => 상수
2) final 필드는 값이 저장된 후에는 변경할 수 없다.		=> 재정의(오버라이딩) 불가능 / final은 상속 불가능 / final 클래스: 종단클래스 -> 확장해서 사용 불가
3) final 메소드는 재정의(오버라이딩)할 수 없다.
4) static final 필드는 상수를 말한다.

	4. 오버라이딩(Overriding)에 대한 설명으로 틀린 것은?	4					*오버라이딩
1) 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개 변수)와 동일해야 한다.				상속의 기본 => 변경해서 사용 (다형성)
2) 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.(ex. public > private)			cf) 객체지향의 3대 요소
3) @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.					1. 데이터 보호 목적  (캡슐화) 
4) protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의할				2. 재사용 목적		 (오버로딩)
수 없다																		3. 수정, 추가 목적	 (오버라이딩)

	5. Parent 클래스를 상속한 Child 클래스의 생성자에서 컴파일 에러가 발생한 이유는? private 변수에 부모 클래스가 접근할 수 없기 때문에
							1) 생성자는 상속이 되지 않는다.
							2) Child c = new Child(String name, int studentNo); => 상위 클래스의 기본 생성자가 호출됨
																				기본 생성자 하나를 포함시켜야 함 public Parent(){}
public class Parent{
		public String name;
	<   public Parent(){}   >
		public Parent(String name){	--> 매개변수가 있는 생성자가 있었기 때문에, 아래의 클래스에 상속했을 때, 기본생성자가 없이 상속
			this.name = name;			기본생성자가 없으면 사용 불가능
	}
}
	public class Child extends Parent{
	private int studentNo;
		public Child(String name, int studentNo){
			this.name = name;
			this.studentNo = studentNo;
		}
}

	6. A,B,C,D,E,F 클래스가 다음과 같이 상속 관계에 있을 때 다음 빈칸에 들어올 수 없는 코드는? (B) new A(); ==> ClassCastException
			
	
	7. 인터페이스에 대한 설명으로 틀린 것은 무엇입니까? 3 
1) 인터페이스는 객체 사용 설명서 역할을 한다. 
2) 구현 클래스가 인터페이스의 추상 메소드에 대한 실체 메소드를 가지고 있지 않으면 추상 클래스가 된다.
3) 인터페이스는 인스턴스 필드를 가질 수 있다.	=> 인터페이스는 상수형 변수만 가지고 있음 --> public static final --> 인스턴스 변수를 가질 수 없다
4) 구현 객체는 인터페이스 타입으로 자동 변환된다.
																멤버변수 -> 필드 , 속성 (인스턴스 변수)


	8. 인터페이스의 다형성과 거리가 먼 것은? 4 (자동 형변환)					interface A
																	class C implements A
1) 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.				A a=new C();
2) 매개 변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.			C c=(C) a;
3) 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장할 수 있다.			
4) 구현 객체를 인터페이스 타입으로 변환하려면 강제 타입 변환을 해야 한다.
																
				
	
	1. 참조 타입에 대한 설명으로 틀린 것은 무엇입니까?  4
① 참조 타입에는 배열, 열거, 클래스, 인터페이스가 있다.			참조형 변수의 주소가 저장되는 곳 -> stack
② 참조 타입 변수의 메모리 생성 위치는 스택이다.				참조형 변수가 참조하는 실제 데이터(new 키워드로 생성되는(객체 배열 인터페이스 열거형) 객체)가 저장되는 곳 
																												-> heap: new 키워드로 
③ 참조 타입에서 ==, != 연산자는 객체 번지를 비교한다.			지역변수, 매개변수의 데이터가 저장되는 곳 --> method area
④ 참조 타입은 null 값으로 초기화 할 수 없다.

	2. 자바에서 메모리 사용에 대한 설명으로 틀린 것은 무엇입니까?  2 or 4 ==> 3번이 답
① 로컬 변수는 스택 영역에 생성되며 실행 블록이 끝나면 소멸된다.
② 메소드 코드나, 상수, 열거 상수는 정적(메소드) 영역에 생성된다.
③ 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다. ==> 자동 메모리 회수를 이용함 (GC) 
④ 배열 및 객체는 힙 영역에 생성된다.					직접 코드를 작성하는 경우? 멀티미디어 프로그램(화상채팅, cctv, 스트리밍서비스)

	3. String 타입에 대한 설명으로 틀린 것은 무엇입니까?	 2
① String은 클래스이므로 참조 타입이다.
② String 타입의 문자열 비교는 == 를 사용해야 한다.  equals() 사용
③ 동일한 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조한다.
④ new String("문자열")은 문자열이 동일하더라도 다른 String 객체를 생성한다.
	
	4. 인터페이스에 대한 설명으로 틀린 것은 무엇입니까? 3
① 인터페이스는 객체 사용 설명서 역할을 한다.
② 구현 클래스가 인터페이스의 추상 메소드에 대한 실체 메소드를 가지고 있지 않으면 추상 클래스가 된다.
③ 인터페이스는 인스턴스 필드를 가질 수 있다.
④ 구현 객체는 인터페이스 타입으로 자동 변환된다.

	5. 인터페이스의 다형성과 거리가 먼 것은?		4
① 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
② 매개 변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
③ 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장할 수 있다.
④ 구현 객체를 인터페이스 타입으로 변환하려면 강제 타입 변환을 해야 한다.


	6. 인터페이스와 클래스가 다른 점은 무엇입니까? 다중 상속 가능여부 + 인터페이스는 모든 메소드가 public

	7. 인터페이스와 추상 클래스가 다른 점은 무엇입니까? 다중 상속 가능여부

	8. 인터페이스의 장점	=> 여러 클래스를 하나의 객체로 관리할 수 있음 / 표준화 가능 / 서로 다른 클래스간의 연결 / 독립적 사용가능 / 개발시간의 단축
	
	9. 다음 중 인터페이스의 장점이 아닌 것은? (390page 참조)	e  ==> 패키지 간의 연결은 import
a. 표준화를 가능하게 해준다.
b. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
c. 독립적인 프로그래밍이 가능하다.
d. 다중상속을 가능하게 해준다.
e. 패키지간의 연결을 도와준다.

	10. 다음 중 틀린 것은?		d
a. 필드는 초기화하지 않아도 된다.
   --- 멤버변수 
b. 클래스에 생성자가 없어도 된다.
c. 생성자는 일반적으로 필드를 초기화한다.		생성자의 역할: 객체 생성 / 멤버변수 초기화
d. 필드는 생성자보다 먼저 선언해야 한다.		

	11. 상속을 설명한 것이다. 틀린 것은?		b
a. 모든 클래스의 최상위 클래스는 Object이다.
b. 부모 객체를 자식 클래스 타입의 변수에 대입할 수 있다.
c. 부모 클래스의 private 메소드를 자식 클래스가 오버라이딩할 수 없다.
d. 부모 클래스를 상속하려면 extends 키워드가 필요하다.

12. 다음 코드가 있다. 밑줄 그은 곳에 적절하지 않은 코드는? c 
class Car {
	public String name;
	protected String color;
	private int model;
}
class SportsCar extends Car {
	boolean turbo;
}
public class CarTest {
	public static void main(String[] args) {
		SportsCar s = new SportsCar();
		______________________
	}
}
a. s.name = "ferrari";
b. s.color = "red";
c. s.model = 105;
d. s.turbo = true;

	14. 다음과 같은 부모 클래스와 자식 클래스가 있다 틀린 곳을 찾으시오
class Person {
	void name() { }
	protected void number() { }
	private void secret() { }
}
class Student extends Person {
	public void name() { }
	void number() { }
	private void secret() { }
}


	15. 인터페이스를 설명한 것이다. 틀린 것은?
a. 인터페이스는 인스턴스 변수를 포함할 수 없다.
b. 인터페이스는 생성자를 포함할 수 없다.
c. 인터페이스는 상수를 포함할 수 없다.
d. 인터페이스의 모든 멤버는 public으로 공개된다.

16. 다음은 인터페이스와 구현 클래스를 정의한 코드이다. 빈칸에 적절한 내용은?
interface A{
	void isPrint();
}
class B __________ {					<implements A>
	public void isPrint() {
		System.out.println(“OK");
	}
}

17. Printable는 인터페이스이다. 다음 코드에서 잘못된 행을 모두 찾으시오.
interface Printable {
	String toner;
	abstract void print();
}
public class PrintableTest extends Printable {		=> extends->implements
	public static void main(String[] args) {
		new Printable();							=> new printable() 불가능 (인터페이스는 생성이 안된다)
		new PrintableTest();
	}
	void print() {}									=> public void print(){} public이 없음
}

18. 빈 공백에 맞는 답을 채우시오
	비교요소 오버로딩  오버라이딩




*/

class A
{
	public A() {
		System.out.println("A() Call..");
	}
	public A(int a) {
		System.out.println("A() Call..");
	}
}

class B extends A
{
	public B() {
		System.out.println("B() Call..");
	}
}



public class Quiz
{
	public static void main(String[] args)
	{
		B b=new B();		// 기존에 자주 사용되는 형식
		A a=new A();
		A aa=new B();
		B bb=(B) aa;		// 인터페이스, 추상클래스에서 
//		B bbb=(B) new A();	// --> 생성자가 일치해야함 
	}
}
