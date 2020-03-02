package dao;

import entity.User;

public interface UserDao {
	void save(User user);
	
	void update(User user);
}
