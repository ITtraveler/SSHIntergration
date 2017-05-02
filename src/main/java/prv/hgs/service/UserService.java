package prv.hgs.service;

import java.util.List;

import prv.hgs.domain.User;

public interface UserService {
	void save(User user);

	void update(User user);

	void delete(User user);

	User findUserById(Integer id);
	
	List<User> findAllUser();
}
