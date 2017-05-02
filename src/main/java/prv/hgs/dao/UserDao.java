package prv.hgs.dao;

import java.util.List;

import prv.hgs.domain.User;

public interface UserDao {
	void save(User user);

	void update(User user);

	void delete(User user);

	User findUserById(Integer id);
	
	List<User> findAllUser();
}
