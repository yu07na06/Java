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

class Proxy{ // �����̶�� �ǹ̸� ����. (�븮������ �븮 ����) - ���� �ϴ� ��ɿ� �߰������� �븮�ؼ� ���� ���̴�!!!!!! 90%�� ���� ���������� �ϴµ� 10%�� �ٲ㼭 ���� �κ��� ������
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
