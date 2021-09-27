package Pack;

class Tiger{
	void m1() { System.out.println(1); }
	void m2() { System.out.println(2); }
	void m3() { System.out.println(3); }
	void m4() { System.out.println(4); }
	void m5() { System.out.println(5); }
}

interface Delegate{
	void delegate(Tiger t);
}

class Proxy{ // 위인이라는 의미를 쓴다. (대리운전의 대리 느낌) - 원래 하는 기능에 추가적으로 대리해서 쓰는 것이다!!!!!! 90%의 일은 공통적으로 하는데 10%만 바꿔서 쓰는 부분을 일컫음
	void commend(Delegate d) {
		Tiger t = new Tiger();
		t.m1();
		d.delegate(t);
		t.m5();
	}
}

public class World {
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.commend(new Delegate() {
			public void delegate(Tiger t) {
				t.m2();
			}
		});
		
		System.out.println("====================================");
		proxy.commend(new Delegate() {
			public void delegate(Tiger t) {
				t.m3();
			}
		});
		
		System.out.println("====================================");
		proxy.commend(new Delegate() {
			public void delegate(Tiger t) {
				t.m4();
			}
		});
	}
}
