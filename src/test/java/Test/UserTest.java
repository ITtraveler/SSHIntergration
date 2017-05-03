package Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prv.hgs.dao.UserDao;
import prv.hgs.dao.imp.UserImp2;

public class UserTest {

	@Test
	public void testUser() {
		ApplicationContext content = new ClassPathXmlApplicationContext("applicationContext2.xml");
		UserImp2 uDao = content.getBean("userImp2", UserImp2.class);
		System.out.println(uDao.findUser2ById(1));
	}

	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("applicationContext2.xml");
		UserImp2 uDao = content.getBean("userImp2", UserImp2.class);
		System.out.println(uDao.findUser2ById(1));
	}
}
