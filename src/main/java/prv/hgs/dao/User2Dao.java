package prv.hgs.dao;

import java.util.List;

import prv.hgs.domain.User;
import prv.hgs.domain.User2;

public interface User2Dao {
	void save(User2 user2);

	void update(User2 user2);

	void delete(User2 user2);

	User2 findUser2ById(Integer id);
	
	List<User2> findAllUser2();
}
