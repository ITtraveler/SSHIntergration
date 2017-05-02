package prv.hgs.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import prv.hgs.domain.User;
import prv.hgs.service.imp.UserServiceImp;

@Controller
public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}

	@Autowired
	private UserServiceImp userServiceImp;

	public String login() {
		// 这里仅举例，以数据库中第一个用户为例
		User realUser = userServiceImp.findUserById(1);
		if (realUser.getUsername().equals(user.getUsername()) && realUser.getPassword().equals(user.getPassword())) {
			System.out.println("success");
			return SUCCESS;
		} else
			return ERROR;
	}
}
