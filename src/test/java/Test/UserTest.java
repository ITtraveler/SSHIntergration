package Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prv.hgs.dao.UserDao;
import prv.hgs.dao.imp.UserImp;

public class UserTest {

	@Test
	public void testUser() {
		ApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao uDao = (UserDao) content.getBean("userImp");
		System.out.println(uDao.findUserById(1));
	}

	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserImp uDao = content.getBean("userImp", UserImp.class);
		System.out.println(uDao.findUserById(1));
	}
}
