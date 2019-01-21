package Class_9.DAO;

import java.util.List;

import Class_9.Model.User;

public interface UserDAO {
	boolean addUser(User user);
	boolean upadateUser(User user);
	boolean deleteUser(User user);
	User get(int userId);
	List<User> listAll();
}
