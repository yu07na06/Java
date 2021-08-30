package Pack;

/*
class Tiger{
	void m1() {
		
	}
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

//ex24)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a=100;
		String s1=Integer.toString(a); // 문자열로 변환하고 싶을떄 toString을 사용
		System.out.println(s1+200); // 문자열+문자열 이므로 연산이 일어나지 않음
		String s2=""+a; // Sugar code
		System.out.println(s2+200);
		String s3="456";
		int b=Integer.parseInt(s3); // 숫자로 변환하고 싶을떄 parseInt를 사용
		System.out.println(b+1); // 숫자+숫자 이므로 연산이 일어남
	}
}

/*
class Tiger{ // 클래스 안에 사용된 함수 이름은 특정한 조건만 만족하면, 동일한 이름으로 사용할 수 있다. (특정 조건 1. 인수 개수가 다르면, 2. 타입이 다르면,)
	void method01() {
		System.out.println(1);
	}
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String a, int b) {
		System.out.println(4);
	}
	int getArrayRECT(int w, int h) { // getArrayRECT <-- 낙타 표기법
		return w*h;
	}
	int getArrayRECT(int length) {
		return length*length;
	}
}

//ex23) - 오버로딩
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.method01();
		t1.method01(1);
		t1.method01(1,2);
		t1.method01("호랑이",1);
		System.out.println(t1.getArrayRECT(3, 2));
		System.out.println(t1.getArrayRECT(3));
	}
}
*/

/*
//ex22)
public class Hello 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) { // continue 나 break를 남발하면, 힘들어짐
			if(i<3) {
				continue; // 여기로 만나면, for문의 증감 i++ 으로 간다.
			}
			System.out.println(i);
			if (i==7) {
				break; // 자기 자신을 감싸고 있는 반복문 중에서 가장 가까운 반복문을 탈출한다.
			}
		}
		System.out.println("호랑이");
		
		int num=0;
		while(true) {
			num++;
			if (num%2!=0) {
				System.out.println("호랑이"+num);
				continue;
			}
			if (num==10) {
				System.out.println("코끼리"+num);
				break;
			}
		}
	}
}
*/

/*
class Tiger{
	int m1(int a, int b) {
		if (a>b) {
			return 100;
		}else { // else에서 return을 못만날 수 있기 때문에 오류가 생김
			// 해결 방법 1. else에도 return을 적어준다.
			// 해결 방법 2. else 끝나고 나서 return을 적어준다.
			System.out.println("호랑이");
		}
		return 0;
	}
	
	void m2() {
		System.out.println(1);
		return; // 함수가 실행 중단되었다를 의미
//		System.out.println(2); // Unreachable Code
	}
	
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if (i==num) {
				System.out.println("찾았다");
				return; // 찾았으니 더 이상 찾을 이유가 없음. 강제 종료
			}
		}
		System.out.println("검색 데이터 찾지 못함");
	}
}

//ex21)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1(3, 5);
		t1.m3(5);
	}
}
*/

/*
class Tiger{
	String m1() { // 문자열이 리턴되는 객체
		return "독수리";
	}
	
	Lion m2() {
		Lion t = new Lion();
		return t;
	}
	
	Lion m3(Lion t) {
		return t;
	}
}

class Lion{
	void show() {
		System.out.println(1000);
	}
}

//ex20) - 이 구조가 복잡하게 보이면 안된다고 하시넹
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		String s1=t1.m1();
		System.out.println(s1);
		System.out.println(t1.m1());
		
		//1)
		Lion t2 = t1.m2();
		t2.show();
		
		//2)
		Lion t3 = t1.m3(new Lion());
		t3.show();
		
		//3)
		t1.m3(new Lion()).show();
	}
}
*/

/*
class Tiger{
	// 함수 유형 4가지에서 파생된 유형 설명
	
	// 함수 유형 1)
	// 주의 void m1(int a, b)는 안된다. - 자기 자신의 타입을 가지고 선언되어야 함
	void m1(int a, int b) { // 인수 개수를 여러개 할 수 있다.
		System.out.println(a+" "+b);
		System.out.println(a*b+a);
	}
	
	// 함수 유형 2)
	void m2(int a, char b, boolean c, float d, String e) { // 인수의 타입을 다양하게 사용할 수 있다. 또한, 객체도 인수로 전달 가능하다.
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}
	
	// 함수 유형 3)
	void m3(Lion a) { // 사용자가 생성한 클래스를 받아 사용가능하다.
		System.out.println(a.hashCode());
		a.sound(); // 전달받은 클래스의 객체를 사용할 수 있다.
	}
}

class Lion{
	void sound(){
		System.out.println("어흥");
	}
}

//ex19)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s1="호랑이"; // String : 자바에서 만들어준 클래스
		System.out.println(s1);
		System.out.println(s1.length());
		
		Tiger t1 = new Tiger(); // 객체 생성
		t1.m1(3, 4);
		t1.m2(10, '한', false, 3.14f, "호랑이");
		
		Lion t2 = new Lion();
		System.out.println(t2.hashCode()); // 고유 민증 번호 확인
		t1.m3(t2); // 인수의 타입과 같은 타입을 전달해야한다.
		t1.m3(new Lion()); // Lion a=new Lion() 이렇게 인수 전달이 완료된것이다.
	}
}
*/

/*
class Tiger{
	// "메쏘드 = 함수 = function" 은 다 같은말
	
	// 함수유형 1) 인수 전달이 없다.
	void merry() { // 강아지 한마리 분양 받음(함수 만듦) - 강아지 이름이 'merry'
		System.out.println("멍!");
	} // 함수 : 자주 사용하는 코드를 저장한 후, 불러서 사용한다.
	
	// 함수 유형 2) 필요에 따라 인수를 전달한다.
	// int num = 3
	void happy(int num) { // happy 강아지 한마리 더 분양 받음 - happy라고 부를때 3번 짖도록
		for (int i = 0; i < num; i++) {
			System.out.println("왕!");
		}
	}
	
	// 함수 유형 3) 값을 돌려주는 return
	// void 는 return 할 것이 없다. 정수를 돌려줄꺼면 int를 적는다.
	int turtle() {
		System.out.println("거북이 콜");
		return 15; // 돌려준다고 약속했으면, 반드시 무언가를 돌려주기 위해서 return 이 항상 필요
	}
	
	// 함수 유형 4) 인수 전달하며 값을 돌려줌
	int fish(int num) {
		int n=num*3;
		return n;
	}
}

//ex18)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.merry(); // 함수를 콜한다. 함수를 부른다. 의 행위를 했음.
		
		for (int i = 0; i < 10; i++) { // 강아지 10번 부르기
			t.merry();
		}
		
		System.out.println("---------------------------"); // 이전 결과랑 헷가리지 않게, 하이픈을 사용해서 분리해주면 좋다.
		Tiger t2 = new Tiger();
		t2.happy(3);
		
		int num=t.turtle(); // 변수로 받아서 사용하거나
		System.out.println(num);
		System.out.println(t.turtle()); // 바로 출력하는 방법이 있음
		
		int ct=t.fish(7);
		System.out.println(ct);
		System.out.println(t.fish(7));
		// 함수 구성 4가지
		// 리턴 값   인수 전달
		//   X        X
		//   X        O
		//   O        X
		//   O        O
	}
}
*/

/*
//ex17)
class Tiger{ //첫자리가 대문자로 암묵적인 약속을 했음
	// 필드 : 변수
	int a; // <---"멤버, 변수, 필드" 다 같은 용어임
	int b=20;
	int c, d=30;
	
	// 생성자
	
	// 메쏘드
	
}

public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");
		
		Tiger t1=new Tiger(); // 설계도를 이용해 실질적으로 만들어놓은 비행기 이름 : t1 (객체의 이름)
		Tiger t2=new Tiger(); // "객체를 생성시켰다." 라고 일컫음
		
		t1.a=100; //안에 들어있는 멤버를 사용한다.
		t1.c=t1.a+30;
		System.out.println(t1.a+" "+t1.b+" "+t1.c+" "+t1.d);
		System.out.println(t2.c);
		
		System.out.println(t1.hashCode()); // 고유한 식별 번호(시리얼 번호) ==> "민증번호"라고 생각
		System.out.println(t2.hashCode()); // 절대 t1과 중복될 수 없다.
		
		Tiger t3;
		t3=t2; // 대입 연산자는 쌍방의 타입이 같으면, 성립한다.
		System.out.println(t3.hashCode()); // t3의 민증번호가 t2가 같음. "두 변수를 참조한다." "메모리를 공유한다." 라고 말함. 메모리 공유가 일어났다.
		// 곰돌이와 홍길동이 같은 사람이라고 가정하자.
		t3.a=999; // 곰돌이가 999를 가지면,
		System.out.println(t2.a); // 홍길동도 999를 가진다. 왜냐면 홍길동이 곰돌이이기 때문에 (서로 메모리를 공유한다.)
		
	}
}
*/

/*
//ex16)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a=10, b;
		b=a++; // 순서 : 대입 -> 증가
		System.out.println(a+" "+b);
		
		int c=10, d=0;
		d=++c; // 순서 : 증가 -> 대입
		System.out.println(d+" "+c);
		
		int a1=10, a2=10;
		System.out.println(a1++); // 출력 이후 1증가되므로
		System.out.println(++a2);
		System.out.println(a1); // 여기서는 1증가된 값으로 출력
		System.out.println(a2);
	}
}
*/

/*
//ex15)
public class Hello 
{
	public static void main(String[] args) 
	{
		//책 보고 하고 계심
		int a=10; // int : 타입, a : 변수, = : 대입연산자, 10 : 정수 리터럴
		int b=20;
		short c=30;
		// 원칙을 어긴 예시
//		b=c;
//		c=a;

		// 강제 타입 변환 : type casting
		b=(int)c; // 강제로 타입을 지시함 : type casting
		c=(short)a;
		
		int num=10;
		num=num+3;
		num+=3; // num=num+3와 동일(실행 속도도 동일, 컴파일 속도가 빠름(기계어로 변역하는 속도가 빠름)) ==> 복합 대입 연산자
		
		int a1=0, a2=0;
		a1=a2+3; // 복합 대입 연산자와 아무런 관련이 없음
		
		// 아래의 경우를 주의해야함
		int t= +1; // 단항 연산자, 구태역 연산자로 양수값을 가리킴
		int u= -1; // 이런 경우 구태역 연산자를 사용함 (의도적인 자리 맞춤을 위해 양수도 구태역 연산자를 사용함)
		int k=10;
		k+=3; // 복합 연산
		System.out.println(k);
		k=+3; // 대입 연산
		System.out.println(k);
		
		int d=0;
		d++;
		System.out.println(d);
		++d;
		System.out.println(d);
		d=d+1; // 실행 속도가 느림
		System.out.println(d);
		d+=1;
		System.out.println(d);
	}
}
*/

/*
//ex14)
public class Hello 
{
	public static void main(String[] args) 
	{
		//1)
		int n=129;
		while(true) { // 우박수(Collatz) 출력 프로그램 : 출력 결과가 우박처럼 왔다갔다 거려서
			System.out.println(n);

//			if (n%2==0) { // 짝수 일때,
//				n=n/2;
//			}else { // 홀수 일때,
//				n=n*3+1;
//			}

			n = (n%2 == 0) ? n/2 : n*3+1; // 위에 if else 문을 삼항 연산으로 사용할 수 있음

			if(n==1) {
				System.out.println(n);
				System.out.println("탈출하기 직전");
				break;
			}
		}

		//2)
		int n2=1234;
		int sum=0;
		while(true) {
			int r=n2%10;// 나머지 약자로 r 을 많이 씀
			n2=n2/10;
			System.out.println(n2+" "+r);

			sum=sum+r;

			if(n2==0) {
				System.out.println("탈출하기 직전");
				break;
			}
		}
		System.out.println(sum);
	}
}
 */

/*
//ex13)
public class Hello 
{
	public static void main(String[] args) 
	{
		// for : 프로그래머가 반복횟수를 알고 사용하는 것
		// while : 프로그래머가 반복횟수를 모르고 사용하는 것
		int num=0;
//		while(true) { // 무한 루프 코드
//			num++;
//			System.out.println(num+" "); // 출력 이후 줄 바꿈 있음
//		}// System.out.print(); 출력 이후 줄 바꿈 없음

		int n=0;
		while(n<10) { // 실제 코드에서는 반복회수를 알고 있기 때문에, 이렇게 사용하지 않는다.
			System.out.println(n);
			n++;
		}
		System.out.println("tiger");

		int a=0;
		while(true) { // 무조건 반복한다.
			System.out.println(a);
			if(a==5) {
				System.out.println("탈출하기 직전");
				break; // 무조건 반복문을 탈출함
			}
			a++;
		}
	}
}
 */

/*
//ex12)
public class Hello 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i = 1; i <= 10; i++) { // 10번 반복
			sum=sum+i;
			System.out.println(sum); // 로그를 
		}

		// 구구단 출력하기
		int n=7;
		for (int i = 0; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
 */

/*
//ex11)
public class Hello 
{
	public static void main(String[] args) 
	{
		// for문
		System.out.println(1000);
		int num=10;
		num=num+3;
		System.out.println(num);
		num=num+1;
		System.out.println(num);

		// 후위 증가
		num++; // num=num+1과 같음
		System.out.println(num);
		num--; // num=num-1과 같음
		System.out.println(num);

		// 전위 증가
		++num;
		System.out.println(num); // 여기서 따로 실행해준게 없어서 전위나 후위나 결과는 같음

		// for(초기; 조건; 증감)
		for (int i = 0; i < 3; i++) { // 여기서 3은 반복 횟수이다.
			System.out.println("tiger"+i);
		}

//		// 주의해야하는 코드
//		// 실무에서 int i=0 또는 int i=1 뺴고는 사용하지 않음
//		for (int i = 5; i < 4; i++) {
//
//		}
//		// 실무에서 조건식 i>4로 부등호가 바뀌지 않음 
//		for (int i = 0; i > 4; i++) {
//
//		}
//		// i=i+3과 같이 증감이 1증가하는 코드가 아니라면, 잘못된 코드
//		for (int i = 0; i < 3; i=i+3) {
//
//		}
//		//모든 제어는 for문 안에서 사용해야함
//
//		//for문을 사용하는 3가지 형식
//		//(1)
//		for (int i = 0; i < 5; i++) {
//
//		}
//		for (int i = 1; i <= 5; i++) { // i에서 돌고 5보나 작거나 같으면, 반복횟수 5번
//
//		}
//		int n=5;
//		for (int i = -n; i <= n; i++) { // 음수, 양수의 좌표값 사용할 때, 사용된다.
//			// 반복횟수 : 5*2+1
//		}
	}
}
 */

/*
//ex10)
public class Hello 
{
	public static void main(String[] args) 
	{
		// switch문
		// 1. case 뒤에 변수가 올 수 없다.
		// 2. switch 안에는 변수가 올 수 있다.
		// 3. default break는 필요 여부에 따라 생략할 수 있다.
		// 4. 의도적인 경우, break를 생략할 수 있다.
		// 5. case분기문에서 실행되는 문장이 한 문장 이상일때는 일반적으로 블록 처리를 해버린다.

		int n=10;
		switch (10) {
		case 10:
			System.out.println(1);
			//break;
		case 20:{ // switch문장의 블록 처리의 표준은 다음과 같다.
			System.out.println(2);
			System.out.println(100);
		}break;
		case 30:
			System.out.println(3);
			break;
		default:
			System.out.println(4);
			break;
		}

		//프로그램 속도가 평준화될 수 없음
		int num=83;
		int q=num/10;
		if(q==9) {
			System.out.println("A");
		}else if(q==8){
			System.out.println("B");
		}else if(q==7){
			System.out.println("C");
		}else if(q==6){
			System.out.println("D");
		}else{
			System.out.println("F");
		}

		// 분기되는 곳으로 바로 점프하기 때문에, 실행 속도가 안정화
		// 조건이 3가지 이상일 때, switch문 사용 
		switch (q) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
 */

/*
//ex9)
public class Hello 
{
	// 제어문(if, for, switch, while, (do-while은 제외))
	public static void main(String[] args) 
	{	
		//if문

		//1)
		System.out.println(1);
		if(true) { // if(조건-참/거짓) 
			System.out.println(2);
			System.out.println(4);
		}; // ; 생략가능
		System.out.println(3);

		if(false) // unreachable code: 도달할 수 없는 코드로 노란색 줄이 생김
		{ 
			System.out.println(0);
		}


		//2)
		if(true) {
			System.out.println(5);
		}else {
			System.out.println(6);
		}


		//3)
		int a=10, b=5;
		int c;
		// if로 들어가나 else로 들어가나 받는 변수가 같다면, 삼항 연산을 쓰는게 좋음
		if (a>b) {
			c=7;
		}else {
			c=8;
		}
		System.out.println(c);
		c=a>b?7:8; // 실행상 속도와는 차이가 없음, 단 코드줄이 짧아짐 --> 슈가 코드
		System.out.println(c);

		if(a>b) {
			System.out.println("tiger");
		}else {
			System.out.println("elephant");
		}
		System.out.println(a>b?"tiger":"elephant");


		//4)
		int num=83;
		if(num>=90) {
			System.out.println("A");
		}else if(num>=80){
			System.out.println("B");
		}else if(num>=70){
			System.out.println("C");
		}else if(num>=60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}
}
 */
