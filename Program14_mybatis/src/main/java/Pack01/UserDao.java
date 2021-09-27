package Pack01;

import java.io.InputStream;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

interface Commend{
	int commend(SqlSession session);
}

class Proxy{
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

public class UserDao{
	SqlSessionFactory ssf = null;
	
	public UserDao() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	public void insert(final Person p) {
		Proxy t = new Proxy();
		t.m1(this, new Commend() {
			public int commend(SqlSession session) {
				return session.insert("test05", p);
			}
		});
	}
	
	public void update(final Person p) {
		Proxy t = new Proxy();
		t.m1(this, new Commend() {
			public int commend(SqlSession session) {
				return session.insert("test07", p); // ���� ������ ���� ���ؼ��� final�� ����Ѵ�.
			}
		});
	}
	
	public void showAge() {
		SqlSession session = ssf.openSession();
		
		List<Person> mm = session.selectList("test08");
		for (Person p : mm) {
			System.out.println(p.getName() + " " + p.getAge());
		}System.out.println();
		
		session.close();
	}
}