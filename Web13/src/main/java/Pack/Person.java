package Pack;

// get, set ������� �Դ�.
// �̰� ���̴�.
public class Person {
	String id;
	String pass;
	
	public Person() { 
		System.out.println("������ ��"); 
	}
	
	public String getId() { 
		System.out.println(1);
		return id; 
	}
	
	public void setId(String id) {
		System.out.println("setId�� ��");
		this.id = id; 
	}
	
	public String getPass() { 
		System.out.println(2);
		return pass; 
	}
	
	public void setPass(String pass) {
		System.out.println("setPass�� ��");
		this.pass = pass; 
	}
}
