package service.impl;

import dao.UserDao;
import dao.imlp.UserDaoImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
