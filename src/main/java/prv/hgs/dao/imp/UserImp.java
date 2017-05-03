package prv.hgs.dao.imp;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import prv.hgs.dao.UserDao;
import prv.hgs.domain.User;

@Component
public class UserImp implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}

	@Override
	public void update(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	public void delete(User user) {
		hibernateTemplate.delete(user);
	}

	@Override
	public User findUserById(Integer id) {
		return hibernateTemplate.get(User.class, id);
	}

	@Override
	public List<User> findAllUser() {
		return (List<User>) hibernateTemplate.find("from User", null);
	}
}
