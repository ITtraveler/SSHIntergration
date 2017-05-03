package prv.hgs.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import prv.hgs.dao.User2Dao;
import prv.hgs.domain.User2;


public class UserImp2 extends HibernateDaoSupport implements User2Dao {

	@Override
	public void save(User2 user2) {
		this.getHibernateTemplate().save(user2);
	}

	@Override
	public void update(User2 user2) {
		this.getHibernateTemplate().update(user2);
	}

	@Override
	public void delete(User2 user2) {
		this.getHibernateTemplate().delete(user2);
	}

	@Override
	public User2 findUser2ById(Integer id) {
		return this.getHibernateTemplate().get(User2.class, id);
	}

	@Override
	public List<User2> findAllUser2() {
		return (List<User2>) this.getHibernateTemplate().find("from user2", null);
	}

}
