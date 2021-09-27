package Pack;

// get, set 만들려고 왔다.
// 이게 모델이다.
public class Person {
	String id;
	String pass;
	
	public Person() { 
		System.out.println("생성자 콜"); 
	}
	
	public String getId() { 
		System.out.println(1);
		return id; 
	}
	
	public void setId(String id) {
		System.out.println("setId가 콜");
		this.id = id; 
	}
	
	public String getPass() { 
		System.out.println(2);
		return pass; 
	}
	
	public void setPass(String pass) {
		System.out.println("setPass가 콜");
		this.pass = pass; 
	}
}
