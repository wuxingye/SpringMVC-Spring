package tour.workflow.ui.dao.impl;

import org.springframework.stereotype.Component;

import tour.workflow.ui.dao.UserDao;
import tour.workflow.ui.model.User;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	@Override
	public int insert(User record) {
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		User user = new User();
		user.setAge(11);
		user.setId(1);
		user.setPassword("好好好");
		user.setUserName("兴业");
		return user;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
