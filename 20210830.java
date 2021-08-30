package Pack;

import java.util.Iterator;
import java.util.Random;

/*
class Tiger{

}

//ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");
	}
}
 */

/*********************************************************** 21.8.30(월) *************************************************************/

/*
//ex51)
public class Hello 
{
//	static void hexaToBinary(int n) {
//		String s=Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
//		
//		while(s.length()<32) {
//			s="0"+s;
//		}
//		System.out.println(s);
//		
//		StringBuffer s1=new StringBuffer(s);
//		for (int i = 0; i < 7; i++) {
//			System.out.println((7-i)*4);
//			s1.insert((7-i)*4," ");
//		}
//		System.out.println(s1);
//	}
	
	static String hexaToBinary(int n) {
		String s=Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
		
		while(s.length()<32) {
			s="0"+s;
		}
//		System.out.println(s);
		
		StringBuffer s1=new StringBuffer(s);
		for (int i = 0; i < 7; i++) {
//			System.out.println((7-i)*4);
			s1.insert((7-i)*4," ");
		}
//		System.out.println(s1);
		return s1.toString(); // String으로 바꿔서 반환
	}
	
	public static void main(String[] args) 
	{
//		int a=1234; // 10진수
//		int b=0x1234; // 16진수 표기 (2진수로 표기 : 0001 0010 0011 0100)
//		System.out.println(a);
//		System.out.println(b); // 출력하게 되면, 10진수로 출력
//		System.out.println(Integer.toBinaryString(a)); //2진수로 출력해주는 내장함수
//		System.out.println(Integer.toBinaryString(b));
		
		// 0011 1011 0001 0010 1100 1101 0101 1001
		int a=0x3b12cd59;
		int b=991087961;
		System.out.println(a);
		if(a==b) {
			System.out.println(1);
		}
		
		// 11 1011 0001 0010 1100 1101 0101 1001
		System.out.println(hexaToBinary(a));
		// 0011 1011 0001 0010 1100 1101 0101 1001
		System.out.println(hexaToBinary(b));
	}
}
*/

/*
//ex50)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s="무궁화꽃이피었습니다";
		// 1.
		System.out.println(s.length());
		
		// 2. char charAt(int index)
		System.out.println(s.charAt(3));
		
		// 3.
		System.out.println(s.indexOf("화꽃이")); // 받은 값을 가지고,
		System.out.println(s.indexOf("목꽃이"));
		
		int n=s.indexOf("화꽃이");
		if(n!=-1){
			System.out.println(n+"번쨰에서 find");
		}else {
			System.out.println("not found");
		}
		
		// 4.
		// 주의 : 스프킹리은 데이터 수정 불가
		System.out.println(s.replace("꽃이", "나무가"));
		System.out.println(s);
//		s="대한민국";
//		System.out.println(s);
		
		// 5.slicing
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 6));
		
		// 6.
		String s2="   App   le   ";
		System.out.print(s2.trim()); // trim 공백 제거 (ex. 아이디, 패스워드)
		System.out.println("호랑이");
		
		// 7.
		String s3="APple";
		System.out.println(s3.toUpperCase()); // 대문자 만들어주기
		System.out.println(s3.toLowerCase()); // 소문자 만들어주기
		
		// 8. 데이터를 받았을떄
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4=new String(data, 0, data.length); // 배열, 위치, 길이
		System.out.println(s4);
		// 데이터를 전송할때
		String s5="Banana";
		byte[] data1=s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
		
	}
}
*/

/*
class Tiger{
	void m1(int a, int b) {
		if (a>b) {
			System.out.println(1);
		}else {
			return;
		}
		System.out.println(2);
	}
	
	void m2(int a, int b) {
		try {
			if (a>b) {
				System.out.println(1);
			}else {
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println(2);
		}
	}
}

//ex49)
public class Hello 
{
	public static void main(String[] args) 
	{
//		try {
//			int a=10/0;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally { // Exception이 발생 하든지 안하든지 finally에 들어간다.
//			System.out.println(1);
//		}
		
		Tiger t1 = new Tiger();
		t1.m1(3, 5);
		t1.m2(3, 5);
	}
}
*/

/*
//ex48)
public class Hello 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {Thread.sleep(2000);} catch (Exception e) {} // 코드 단줄 처리 만이 함
		}
		// 2초동안 holding
	}
}
*/

/*
class Tiger{
	void m1() {
		System.out.println(1);
		try {
			throw new Exception(); // 예외가 의도적으로 발생을 했음
		} catch (Exception e) {
			System.out.println("Exception 발생함");
		}
	}
	
	void m2() throws Exception{ // 이 함수를 호출한 사람이 찾아내라-사용자에게 책임을 떠넘김(예외 떠넘기기)
		System.out.println(2);
		throw new Exception(); // 예외가 의도적으로 발생을 했음
		
	}
}

//ex47)
public class Hello 
{
	public static void main(String[] args)
	{
		Tiger t1 = new Tiger();
		t1.m1();
		
		// Unhandled exception
		try {
			t1.m2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
	}
}
*/

/*
//ex46)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try {
//			int a=10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		
		int[]ar= {1,2,3};
		try {
			ar[3]=10;
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
		
		String s="무궁화꽃이피었습니다";
		System.out.println(s.length());
		s=null; // 객체가 아니다. 
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(4);
	}
}
*/

/*
class Baduk{
	Ai ai;
	Baduk(Ai ai){
		this.ai=ai;
		System.out.println("대국을 시작합니다.");
	}
	
	void play() {
		ai.play();
	}
	
	void stop() {
		ai.stop();
	}
}

interface Ai{
	void play();
	void stop();
}

class Alphago implements Ai{ // 구글에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");
	}
}

class Bephago implements Ai{ // 아마존에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}

	@Override
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
	}
}

//ex45-5)
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk1 = new Baduk(new Alphago());
		Baduk baduk2 = new Baduk(new Bephago());
		baduk1.play();
		baduk1.stop();
		baduk1.play();
		baduk1.stop();
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(Ai ai) {
		ai.play();
	}
	
	void stop(Ai ai) {
		ai.stop();
	}
}

interface Ai{
	void play();
	void stop();
}

class Alphago implements Ai{ // 구글에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");
	}
}

class Bephago implements Ai{ // 아마존에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}

	@Override
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
	}
}

//ex45-4) 함수를 호출할떄마다 함수에 인수에 인공지능을 전달해야하는 번거로움이 있다.
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play(new Alphago());
		baduk.play(new Bephago());
		baduk.stop(new Alphago());
		baduk.stop(new Bephago());
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(Ai ai) {
		ai.play();
	}
}

interface Ai{
	void play();
}

class Alphago implements Ai{ // 구글에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

class Bephago implements Ai{ // 아마존에서 만듦
	@Override
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}

//ex45-3)
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play(new Alphago());
		baduk.play(new Bephago());
	}
}
*/


/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play(Alphago alphago) {
		alphago.play();
	}
	
	void play(Bephago bephago) {
		bephago.play();
	}
}

class Alphago{ // 구글에서 만듦
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

class Bephago{ // 아마존에서 만듦
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}

//ex45-2) 문제점 : 새로운 인공지능이 생길떄마다 바둑 play의 인수를 달리하여 만들어야함.
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play(new Alphago());
		baduk.play(new Bephago());
	}
}
*/

/*
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

//ex45-1) 이 프로그램의 문제점 : 인공지능이 바뀐다면, 어떻게 할 것인가?
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk(); // 일반적으로 객체를 하나 이상 만들지 않는다는 가정 하에 소문자로 클래스와 이름이 동일하게 적음
		baduk.play();
	}
}
*/

/*
interface Animal{
	void m1();
}

class Zoo{
	void sound(Animal t) {
		t.m1();
	}
}

//ex44-2)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		
		Zoo t2 = new Zoo();
		t2.sound(new Animal() {
			@Override
			public void m1() {
				System.out.println(2);
			}
		});
	}
}
*/

/*
interface Animal{
	void m1();
}

class Tiger implements Animal{
	@Override
	public void m1() {
		System.out.println(1);
	}
}

class Zoo{
	void m1(Animal t) {
		t.m1();
	}
}

//ex44-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
		
		Animal t2 = new Tiger(); // upcasting
		t2.m1();
		
		// 익명 클래스
		Animal t3 = new Animal() { // 클래스 제작 없이 사용
			@Override
			public void m1() {
				System.out.println(2);
			}
		};
		t3.m1();
		
		// 익명 객체
		new Animal() {
			@Override
			public void m1() {
				System.out.println(3);
			}
		}.m1();
		
		// 함수 인수로 코드를 전달한다.
		Zoo t4 = new Zoo();
		t4.m1(new Animal() {
			@Override
			public void m1() {
				System.out.println(4);
			}
		});
		
		t4.m1(t1); // 인수 전달로 upcasting이 가능함
	}
}
*/

/*
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		this(); // 인수 전달이 없는 생성자를 콜한다.
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		this(a+b); // 생성자 호출할떄 사용
		System.out.println(a+" "+b);
	}
}

//ex43-4) this를 이용하여 자기 class 안에서 다른 생성자를 호출할떄 사용한다.
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20);
	}
}
*/

/*
class Tiger{
	void m1() {
		Lion t = new Lion();
		if (t.marry(this)) { // 여기서 "this=호랑이 자신"
			System.out.println("감사합니다.");
		} else {
			System.out.println("ㅠㅠ");
		}
	}
	
	int m2() {
		System.out.println("제가 가지고 있는 재산은 50입니다.");
		return 50;
	}
	
	String m3() {
		return "온순";
	}
}

class Lion{
	boolean marry(Tiger t) {
		if (t.m2()>=80) { // 호랑이 재산을 확인
			return true;			
		}else {
			String s=t.m3();
			switch (s) {
			case "온순":
				return true;
			case "난폭":
				return false;
			}
			return false;
		}
	}
}

//ex43-4)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
	}
}
*/

/*
class Tiger{
	Tiger m1() { //Tiger 타입 메소드에서 return의 3가지 경우
		
//		return new Tiger();
		
//		Tiger t = new Tiger();
//		return t;
		
		System.out.println(1);
		return this;
	}
	
	Tiger m2() {
		System.out.println(2);
		return this;
	}
	
	void m3() {
		System.out.println(3);
	}
}

//ex43-3) - this 용도 : 함수 체이닝
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = t1.m1();
		System.out.println(t1.hashCode()+" "+t2.hashCode());
		
		t2.m2();
		t1.m1().m2().m1().m2().m3(); // Chaining : 한 객체에 다양한 메서드를 줄줄이 이어서 사용할 수 있다.
		
		System.out.println("---------------------------------------");
		t1.m1().m2().m3();
		t1.m1();
		t1.m2();
		System.out.println("호랑이"); // 코드가 난입했다.
		t1.m3();
	}
}
*/

/*
class Tiger{
//	Tiger this;
//	Tiger(Tiger t){
//		this=t;
//	}
	
	int a,b;
	int size;
	Tiger(int a, int b, int size){
		this.a=a; // 필드의 a=멤버의 a, 멤버 a=인수전달a
		this.b=b;
		this.size=size; // 가독성 측면에서는 떨어지는 코드
	}
	
	void show() {
		System.out.println(this.a+" "+this.b); // 멤버의 a,b를 사용함
	}
}

//ex43-2) - this 용도 : 클래스 필드와 메소드 인수 전달 변수의 구분을 위해
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20, 30);
		
		int num=10;
		num=num; // 셀프 대입 : 자기 변수 값을 자기 변수에 대입하는 것 --> 하등에 쓸모없는 코드
		
		t1.show();
	}
}
*/

/*
class Tiger{
	
	// 생략된 것
//	Tiger this;
//	Tiger(Tiger t, int a, int b){
//		this=t;
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode()); // this가 Tiger타입으로 선언되어 있음
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
	
//	Tiger this; 이거 생략되어 있음
//	void m2(Tiger t) { // 모든 함수는 이 인수가 생략되어 있음
//		this.t; // 모든 함수는 이 코드가 생략되어 있음
//	}
	
}

//ex43-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20); // 10과 20은 a, b에 넘어감
		// 이때 t1은 t로 인수전달해서 넘어감
	
//		t1.m1();
		System.out.println(t1.hashCode()); // 생성자 해쉬코드와 객체 변수의 해쉬 코드가 같다.
		
		Tiger t2 = new Tiger(30, 40); // t2, 30, 40 인수가 전달된다.
		System.out.println(t2.hashCode());
	}
}
*/

/*
final class Animal{ // 상속을 받을 수 없는 클래스로 표기
	final int NUM=10; // 더이상 값을 변경할 수 없다.는 의미 --> 사용할 수 있는 메모리를 상수화시킨다.
	// 영구 불변의 수를 지정하고 싶을떄 사용
	
	final void m1() { // 여기 코드 이후부터는 오버라이딩이 마지막이다.
		
	}
}

class Tiger extends Animal{ // 상속을 받을 수 없는 클래스는 상속받을 수 없다.
//	void m1() { // 부모 클래스에서 m1에 final을 붙였기 때문에 m1을 오버라이딩하여 사용할 수 없다.
//		
//	}
}

//ex42)
public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal();
//		t1.NUM=20; // 성립이 되지 않는 코드(final을 선언했기 때문에)
		System.out.println(Math.PI); //  Math의 PI는 final 가 적혀져있다.
		String s1=null; // String은 final이 적혀있기에 사용할 수 없다.
	}
}
*/
