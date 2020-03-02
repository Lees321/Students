package dao.imlp;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list.add(user);
		for (User user2:list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}
	}

}
