package prv.hgs.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import prv.hgs.dao.UserDao;
import prv.hgs.domain.User;


public class UserImp extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void delete(User user) {
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public User findUserById(Integer id) {
		return this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> findAllUser() {
		return (List<User>) this.getHibernateTemplate().find("from User", null);
	}

}
