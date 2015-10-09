package tour.workflow.ui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tour.workflow.ui.dao.UserDao;
import tour.workflow.ui.model.User;
import tour.workflow.ui.service.UserService;

@Service("service1")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
