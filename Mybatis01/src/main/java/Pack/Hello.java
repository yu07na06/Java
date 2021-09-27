package Pack;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// Bean
// 1. ����Ʈ �����ڸ� �ִ�.
// 2. �ݵ�� set, get �Լ��� �־�� �Ѵ�.
class Person{
	String fullname; // �ʵ� (set�� get �Լ��� ������ �Ǹ�, "property : �Ӽ�"�̶�� �Ѵ�.)
	public String getName() { return fullname; }
	public void setName(String name) { this.fullname = name; }
	
	int age;
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class Hello {
	public static void main(String[] args) {
		System.out.println(1);
		SqlSessionFactory ssf = null;
		SqlSession session = null;
		
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (Exception e) { e.printStackTrace(); }
		
		ssf = new SqlSessionFactoryBuilder().build(is);
		System.out.println(2);
		
		session = ssf.openSession();
		
		try {
//			Person p = new Person();
//			p.setName("ȣ����");
//			p.setAge(11);
			
//			if (session.insert("test05", p)>0)
//				session.commit();
			
//			if (session.delete("test06", p)>0)
//				session.commit();
			
//			if (session.delete("test07", p)>0)
//				session.commit();
			
			List<Person> mm = session.selectList("test08");
			for (Person p : mm) {
				System.out.println(p.getName()+" "+p.getAge());
			}System.out.println();
			
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
		
		System.out.println(3);
	}
}

/*
class UserDao{
	SqlSessionFactory ssf = null;
	
	UserDao() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	void insert(int num) {
		SqlSession session = ssf.openSession();
		
		try {
			int result = session.insert("test02", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
	
	void update(int num) {
		SqlSession session = ssf.openSession();
		
		try {
			int result = session.update("test04", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
	
	void showAge() {
		SqlSession session = ssf.openSession();
		
		List<Integer> mm = session.selectList("test01", null);
		for (Integer item : mm) {
			System.out.print(item + " ");
		}System.out.println();
		
		session.close();
	}
}

public class Hello {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		dao.insert(552);
//		dao.update(8888);
		dao.showAge();
		
		System.out.println("Exit");
	}
}
*/

/*
interface Commend{
	int commend(SqlSession session);
}

class Test{
	void m1(UserDao dao, Commend c) {
		SqlSession session = dao.ssf.openSession();
				
		try {
			//int result = session.update("test04", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			int result = c.commend(session);
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
}

class UserDao{
	SqlSessionFactory ssf = null;
	
	UserDao() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	void insert(final int num) {
		Test t = new Test();
		t.m1(this, new Commend() {
			public int commend(SqlSession session) {
				return session.insert("test02", num);
			}
		});
	}
	
	void update(final int num) {
		Test t = new Test();
		t.m1(this, new Commend() {
			public int commend(SqlSession session) {
				return session.insert("test04", num); // ���� ������ ���� ���ؼ��� final�� ����Ѵ�.
			}
		});
	}
	
	void showAge() {
		SqlSession session = ssf.openSession();
		
		List<Integer> mm = session.selectList("test01", null);
		for (Integer item : mm) {
			System.out.print(item + " ");
		}System.out.println();
		
		session.close();
	}
}

public class Hello {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		dao.insert(552);
//		dao.update(8888);
		dao.showAge();
		
		System.out.println("Exit");
	}
}
*/

/*
interface Commend{
	int commend();
}

class Test{
	void m1(SqlSessionFactory ssf, Commend commend) {
		
				
		try {
			//int result = session.update("test04", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			int result = commend.commend();
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
}

class UserDao{
	SqlSessionFactory ssf = null;
	
	UserDao() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	void insert(int num) {
		Test t = new Test();
		t.m1(ssf, new Commend() {
			public int commend() {
				SqlSession session = ssf.openSession();
				int result = session.update("test04", num);
			}
		});
	}
	
	void update(int num) {
		SqlSession session = ssf.openSession();
		
		try {
			int result = session.update("test02", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
	
	void showAge() {
		SqlSession session = ssf.openSession();
		
		List<Integer> mm = session.selectList("test01", null);
		for (Integer item : mm) {
			System.out.print(item + " ");
		}System.out.println();
		
		session.close();
	}
}

public class Hello {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		dao.insert(552);
//		dao.update(8888);
		dao.showAge();
		
		System.out.println("Exit");
	}
}
*/

/*
class UserDao{
	SqlSessionFactory ssf = null;
	
	UserDao() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	void insert(int num) {
		SqlSession session = ssf.openSession();
		
		try {
			int result = session.insert("test02", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
	
	void update(int num) {
		SqlSession session = ssf.openSession();
		
		try {
			int result = session.update("test04", num); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
	}
	
	void showAge() {
		SqlSession session = ssf.openSession();
		
		List<Integer> mm = session.selectList("test01", null);
		for (Integer item : mm) {
			System.out.print(item + " ");
		}System.out.println();
		
		session.close();
	}
}

public class Hello {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		dao.insert(552);
//		dao.update(8888);
		dao.showAge();
		
		System.out.println("Exit");
	}
}
*/

/*
public class Hello {

	public static void main(String[] args) {
		System.out.println(100);
		SqlSessionFactory ssf = null;
		SqlSession session = null;
		
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (Exception e) { e.printStackTrace(); }
		
		ssf = new SqlSessionFactoryBuilder().build(is);
		System.out.println(2);
		
		session = ssf.openSession();
		
		try {
//			int result = session.insert("test02", 9999); // �̰� ������ ���� ������ test02��� �Լ��� ã�� 9999�μ� ������ �� ���̴�.
			
//			int result = session.delete("test03", 9999);

//			int result = session.update("test04", 5);

			// ���������� ����� ���Դٸ�,
//			if (result>0) session.commit(); // Ŀ���� �ϸ� �ȴ�.
//			System.out.println(result); // ����� ���;� �������� ����
			
			List<Integer> mm = session.selectList("test01", null);
			for (Integer item : mm) {
				System.out.print(item + " ");
			}System.out.println();
		
		} catch (Exception e) { e.printStackTrace(); 
		} finally { session.close(); }
		
		System.out.println(3);
	}
}
*/
