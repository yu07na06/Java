package Pack;

/*
//ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");
	}
}
*/

//ex8)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 변수를 가지고 오칙연산을 사용할 수 있다. - 변수를 사용하면, 일일히 숫자를 변경하지 않아도 된다.
		int a=17, b=3; // b의 값이 0이 들어가지 않는다는 전제하에 (나누기 때문에)
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// 연산 우선순위 : 산술>비교>논리 (외우자!)
		System.out.println(a>b*7); // 산술연산과 비교연산이 같이 일어나고 있음
		System.out.println(a>b*7 || a-10>b); // 산술연산>비교연산>논리연산이 일어남
	}
}

/*
//ex7)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 변수 사용 방법
		
		//1)
		int a; // "컴퓨터야 4byte 메모리 주세요. 그 이름을 a라고 할께"
		a=10; // 
		System.out.println(a);
		
		//2)
		int b, c, d; // 변수를 일괄적으로 한 줄에 사용할 수 있음
		b=1;
		c=2;
		d=3;
		System.out.println(b);
		System.out.println(b+c); // 더해져버림
		System.out.println(b+""+c); // 붙어서 출력됨
		System.out.println(b+" "+c); // 띄워서 출력됨
		System.out.println(b+" "+c+" "+d); // 띄워서 출력됨
		
		//3)
		int e=10; // 초기값 설정
		int f=20, g=30; // 변수 두개를 선언하면ㅅ, 초기값 설정
		int h,i=40,j; // 초기화 안된것도 할 수 있음, 대신 밑에서 초기화 해야함 (i=40, h=j)
		h=50;
		j=60;
		System.out.println(e+" "+j+" "+h);
		
		//4)
		int a10; // 변수 이름은 숫자랑 같이 사용할 수 있음. 대신 숫자가 앞에오면 안됨
		a10=10;
		System.out.println(a10);
		a10=20; // 재대입 : 과거값은 지움, 최근값을 가진다.
		System.out.println(a10);
		
		//5)
		int aa=88, bb=99;
		int temp; // temp 임시라는 뜻의 변수로 많이 사용
		System.out.println(aa+" "+bb);
		// 교환 프로그램 or swap program (단 이 3줄만으로!) ~ 자연스럽게 외워주세요
		temp=aa; // temp=88
		aa=bb; // aa=99
		bb=temp; // bb=88
		System.out.println(aa+" "+bb);
		
		//6) - 5번 예제와 같지만, 한 줄이 줄었다.
		int cc=100, dd=200;
		System.out.println(cc+" "+dd);
		int tt=cc;
		cc=dd;
		dd=tt;
		System.out.println(cc+" "+dd);
		
	}
}
*/

/*
//ex6)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 메모리를 요구할 수 있는 타입 - 총 8가지
		
		
		// (1)정수 메모리 할당하기 (1, 2, 4, 8) byte - (byte, short, int, long)
		byte apple; // 1byte : "컴퓨터야 1바이트 줘, 그 메모리를 apple로 할께"
		apple=100; // = 대입연산 : 메모리에 숫자를 기억시키는 것 (오른쪽껄 왼쪽이 기억함)
		System.out.println(apple); // Apple을 변수라고 하고, 변수명을 지칭함 메모리에 값을 저장할 수 있는 것을 변수라고 함
		System.out.println(Byte.MIN_VALUE); // byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Byte.MAX_VALUE); // byte가 가질 수 있는 최대값을 알려줌
		
		// short Apple; // 변수명은 동일하게 작명할 수 없음
		short banana; // 2byte
		banana=-32000;
		System.out.println(banana);
		System.out.println(Short.MIN_VALUE); // 2byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Short.MAX_VALUE); // 2byte가 가질 수 있는 최대값을 알려줌
		
		int orange; // 4byte
		orange=-2147483648;
		System.out.println(orange);
		System.out.println(Integer.MIN_VALUE); // int는 약자이기 때문에, Integer로 적어줘야함. 4byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Integer.MAX_VALUE); // 4byte가 가질 수 있는 최대값을 알려줌
		
		long melon; // 8byte
		melon=0;
		System.out.println(melon);
		System.out.println(Long.MIN_VALUE); // 8byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Long.MAX_VALUE); // 8byte가 가질 수 있는 최대값을 알려줌
		
		
		
		// (2)실수 메모리 할당하기 (4, 8) byte - (float, double)
		float tiger; // 4byte
		tiger=3.14f; // 반드시 f를 넣어야함
		System.out.println(tiger);
		System.out.println(Float.MIN_VALUE); // 4byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Float.MAX_VALUE); // 4byte가 가질 수 있는 최대값을 알려줌
		
		double lion; // 8byte
		lion=3.14; // f가 없으므로 double를 가리킴
		System.out.println(lion);
		System.out.println(Double.MIN_VALUE); // 8byte가 가질 수 있는 최소값을 알려줌
		System.out.println(Double.MAX_VALUE); // 8byte가 가질 수 있는 최대값을 알려줌
		
		
		
		// (3)문자 메모리 할당하기 2byte - char
		char cat; // 2byte, char는 유일하게 음수를 사용할 수 없음 > 문자 하나를 기억하기 위해 사용함
		// cat=1234; // 이런식으로 절대 사용하지 않음. 사용할 순 있으나 안함
		cat='한'; // 글자 하나만 들어감
		System.out.println(cat);
		System.out.println((int)Character.MIN_VALUE); // 2byte가 가질 수 있는 최소값을 알려줌
		System.out.println((int)Character.MAX_VALUE); // 2byte가 가질 수 있는 최대값을 알려줌
		// character같은 경우는 값을 보려면, (int)를 붙여줘야 보임.
		
		
		
		// (4)true, false만 담는것
		boolean dog; // 1byte
		dog=true;
		System.out.println(dog);
		//boolean은 MIN_VALUE, MAX_VALUE가 없다. true, false만 담기기 때문에
		
	}
}
*/

/*
//ex5)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(10); // 숫자
		System.out.println('한'); // 문자 (싱클 커테이션('') 사용)
		System.out.println("호랑이"); // 문자열 (더블 커테이션("") 사용)
		System.out.println("1000"); // 문자열 (더블 커테이션이("") 우선순위기 때문에)
		
		
		System.out.println(10+20); // 숫자+숫자 (산술 연산이 일어남)
		System.out.println(10+"호랑이"); // 숫자+문자열 (문자열 연결 - 결과적으로 문자열로 취급)
		System.out.println("호랑이"+10); // 문자열+숫자 (문자열 연결 - 결과적으로 문자열로 취급)
 		System.out.println("호랑이"+"코끼리"); // 문자열+문자열 (문자열 연결 - 결과적으로 문자열)
 		
 		//좌측에서 우측으로 연산이 일어남
		System.out.println(10+"호랑이"+20); //(숫자+문자열)+숫자=문자열+숫자=문자열
		System.out.println(10+20+"호랑이"); //(숫자+숫자)+문자열=숫자+문자열=문자열
		System.out.println("호랑이"+10+20); //(문자열+숫자)+숫자=문자열+숫자=문자열
		System.out.println(10+" "+20); //숫자 두개를 한 라인에 출력하고 싶을때 사용
	}
}
*/

/*
//ex4)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 논리 연산자 (논리 and, 논리 or, 부정 연산자) - 총4가지 
		
		// 논리 or - 하나라도 참이면 참
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		
		// 논리 and - 전부 참이여야 참
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		// 연습
		System.out.println(true && true && false);
		System.out.println(false || false || true);
		
		System.out.println(false || true && true); // 어떤 식으로는 잘못된 코드
		System.out.println(false || (true && true)); // 괄호를 하면, 해결
		System.out.println(3>2 || false || 6<=3);
		
		// 부정 연산자 - 그 결과에 대해서 부정한다
		System.out.println(!true);
		System.out.println(!(3>2));
		
	}
}
*/

/*
//ex3)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 관계 연산 or 비교 연산 (>, >=, <, <=, ==, !=) - 총 6가지
		System.out.println(5>3); // 크냐
		System.out.println(5>=3); // 크거나 같냐
		System.out.println(5<3); // 작냐
		System.out.println(5<=3); // 작거나 같냐
		System.out.println(5==3); // 같냐
		System.out.println(5!=3); // 다르냐
	}
}
*/

/*
//ex2)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 산술연산자 (+, -, *, /, %) - 총 5가지
		System.out.println(20+3);
		System.out.println(20-3);
		System.out.println(20*3);
		System.out.println(20/3); // 몫을 구함
		System.out.println(20%3); // 나머지를 구함
		
		// 산술연산자 우선순위
		System.out.println(3+2*4); // *,/  >  +,-
		System.out.println((3+2)*4); // 괄호 우선순위가 더 높음
		
	}
}
*/

/*
// ex1)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("douzone");
	}
}
*/
