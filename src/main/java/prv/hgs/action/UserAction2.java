package prv.hgs.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import prv.hgs.domain.User;
import prv.hgs.domain.User2;
import prv.hgs.service.imp.UserServiceImp2;

public class UserAction2 extends ActionSupport implements ModelDriven<User2> {
	private User2 user2 = new User2();

	@Override
	public User2 getModel() {
		return user2;
	}

	private UserServiceImp2 userServiceImp2;

	public void setUserServiceImp2(UserServiceImp2 userServiceImp2) {
		this.userServiceImp2 = userServiceImp2;
	}

	public String login() {
		// 这里仅举例，以数据库中第一个用户为例
		User2 realUser2 = userServiceImp2.findUser2ById(1);
		if (realUser2.getUsername().equals(user2.getUsername())
				&& realUser2.getPassword().equals(user2.getPassword())) {
			System.out.println("success");
			return SUCCESS;
		} else
			return ERROR;
	}
}
