package Pack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;
/*********************************************************** 21.8.30(월) *************************************************************/
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


/*********************************************************** 21.9.1(화) *************************************************************/
/*
//ex54-1)
public class Hello 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.add(33);
		mm.add(44);
		mm.add(77);
		for (int i = 0; i < 10; i++) {
			mm.add(i*2);
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		System.out.println(mm);
		
//		int size=mm.size();
//		for (int i = 0; i < size; i++) {
//			int num=mm.get((size-i-1));
//			if (num % 2==0) mm.remove((size-i-1));
//		}
//		System.out.println(mm);
		
		
		// 방법 1 : 따로 증가한다.
		for (int i = 0; i < mm.size();) { // 전형적인 방법 - 요즘은 잘 안쓴다.
			int num=mm.get(i);
			if(num%2==0) {
				mm.remove(i);
			}else {
				i++;
			}
		}
		System.out.println(mm);
		
		
		// 방법 2 : Iterator 이용
		// Iterator<Integer> it = mm.iterator() : 첫번째 데이터를 가리키는 지팡이 it
		// hasNext() : 지팡이가 가리키고 있는 곳에 데이터가 있는지 true, false를 반환
		mm.remove(0);
		for (Iterator<Integer> It = mm.iterator(); It.hasNext();) { 
			Integer num=It.next(); // 데이터 가지고 옴
			if (num%2==0) {
				It.remove();
				System.out.println(It);
			}
		}
		
		System.out.println(mm);
		
		
		// 방법 3 : removeIf 이용 - 실제 코드에서는 적극적으로 이용
		// 조건에 맞춰 제거
		// removeIf 세부 코드 > Predicate 클래스
		mm.removeIf(new Predicate<Integer>() { // 익명
			@Override
			public boolean test(Integer t) {
				return t%2==0; // 제거 했으면 좋겠는 거를 조건문에 넣어라
			}
		});
		System.out.println(mm);
		
		// 방법 4 : Lamda 함수 사용 
		mm.removeIf(num->num%2==0);
		System.out.println(mm);
	}
}
*/

/*
//ex54)
public class Hello 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); i++) {
			int num=mm.get(i);
//			System.out.println(num); // 항상 개발할때 출력해서 확인하는 습관을 가지는 것이 좋음
			if (num==100) {
				System.out.println(i+"번째 찾았다.");
				break;
			}
			
			if(i==mm.size()-1) {
				System.out.println("못찾음");
			}
		}
		
		for (int i = 0; i < mm.size(); i++) {
			int num=mm.get(i);
			if (num==55) {
				mm.remove(i);
				System.out.println("55 삭제함");
				break;
			}
		}
		System.out.println(mm);
	}
}
*/

/*
//ex53)
public class Hello 
{
	public static void main(String[] args) 
	{
		// CRUD (Create, Read, Update, Delete)
		
		// 컨테이너에 자료형을 넣어주면, 해당 자료형만 사용함
		// <>에는 무조건 class만 들어감 - primitive 는 들어가지 않음
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		// C(Create) 단계 /////////////////////////////////////////////////////
		mm.add(10);
		System.out.println(mm.size()); // 관리하고 있는 데이터 개수
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		// R(Read)단계 /////////////////////////////////////////////////////
		// 1.
		System.out.println(mm);
		
		// 2. -- 이렇게 쓰는 것이 활용도가 높음
		int size=mm.size(); // 이렇게 갑을 얻어와서 변수를 사용해야지 비용을 절감할 수 있다.
		for (int i = 0; i < size; i++) { // mm.size() 함수 호출함으로 비용이 들고 있다.-- 최적화에서는 큰일나는 코드
			int data=mm.get(i); // class냐 primitive냐! int(primitive)말고 integer(class)넣어도된다.
			System.out.print(data+" "); // 데이터 출력시 항상 ln없는 출력문을 넣어주는게 좋다.
		}System.out.println(); // 그리고 나서 엔터 출력해주기
		
		// 3. - (x, item, data, value)의 용어로 많이 씀
		for (Integer x : mm) {
			System.out.print(x+" ");
		}System.out.println();
		
		// U(Update) /////////////////////////////////////////////////////
		mm.set(5, 999);
		System.out.println(mm);
		
		// D(Delete) /////////////////////////////////////////////////////
		mm.remove(5); // 해당 인덱스 제거
		System.out.println(mm);
	}
}
*/

/*
//ex52)
public class Hello
{
	static String hexaToBinary(int n) {
		String s=Integer.toBinaryString(n);
		
		while(s.length()<32) s="0"+s;
		
		StringBuffer s1=new StringBuffer(s);
		for (int i = 0; i < 7; i++)
			s1.insert((7-i)*4," ");

		return s1.toString(); // String으로 바꿔서 반환
	}
	
	public static void main(String[] args) 
	{
		int a=0x3b12cd5a;
		int b=0x0000ff00; // 필터링 할떄 사용하는 '마스크'라고 함
		int c=0x0ff00000;
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary(a&b));
		System.out.println(hexaToBinary((a&b) >> 8)); // 먼저 연산이 일어나는 순위는 괄호로 표기하는 것이 암묵적인 약속이다.
		System.out.println((a&b) >> 8);
		System.out.println(hexaToBinary((a&c) >> 20));
		System.out.println((a&c) >> 20);
		System.out.println();
		
		int aa=0x0000cd5a;
		int b1=0x0000f800;
		int b2=0x000007e0;
		int b3=0x0000001f;
		System.out.println(hexaToBinary(aa));
		System.out.println("============================");
		System.out.println(hexaToBinary(b1));
		System.out.println(hexaToBinary((aa & b1)>>11));
		System.out.println((aa & b1)>>11);
		System.out.println("----------------------------");
		System.out.println(hexaToBinary(b2));
		System.out.println(hexaToBinary((aa & b2)>>5));
		System.out.println((aa & b2)>>5);
		System.out.println("----------------------------");
		System.out.println(hexaToBinary(b3));
		System.out.println(hexaToBinary(aa & b3));
		System.out.println(aa & b3);
		
		System.out.println("\n============================");
		int d=0x77000000;
		System.out.println(hexaToBinary(aa));
		System.out.println(hexaToBinary(aa|d));
		int c1=25, c2=42, c3=26;
		System.out.println("----------------------------");
		System.out.println(Integer.toHexString( (c1<<11) | (c2 << 5) | c3 ));
		
		System.out.println("\n============================");
		
		char c5 = 0x00dc; // 1101 1100
		char mask = 0x80; // 1000 0000
		String[] elec=new String[] {"에어컨", "선풍기", "냉장고", "세탁기", "TV", "에어프라이기", "노트북", "컴퓨터"};
		for (int i = 0; i < 8; i++, mask>>=1) {
			System.out.println((c5 & mask)==mask? elec[i]+" : ON": elec[i]+" : OFF");
		}
	}
}
*/
