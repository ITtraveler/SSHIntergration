package prv.hgs.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prv.hgs.dao.User2Dao;
import prv.hgs.domain.User2;
import prv.hgs.service.User2Service;

public class UserServiceImp2 implements User2Service {

	private User2Dao user2Dao;

	public void setUser2Dao(User2Dao user2Dao) {
		this.user2Dao = user2Dao;
	}

	@Override
	public void save(User2 user2) {
		user2Dao.save(user2);
	}

	@Override
	public void update(User2 user2) {
		user2Dao.update(user2);
	}

	@Override
	public void delete(User2 user2) {
		user2Dao.delete(user2);
	}

	@Override
	public User2 findUser2ById(Integer id) {
		return user2Dao.findUser2ById(id);
	}

	@Override
	public List<User2> findAllUser2() {
		return user2Dao.findAllUser2();
	}

}
