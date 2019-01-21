package Class_9.Service;

import java.util.ArrayList;
import java.util.List;

import Class_9.DAO.UserDAO;
import Class_9.Model.User;


public class UserDAOImp implements UserDAO {
	
	private List<User> List=new ArrayList<User>();

	public boolean addUser(User user) {
		List.add(user);
		return true;
	}

	public boolean upadateUser(User user) {
		List.add(user);
		return true;
	}

	public boolean deleteUser(User user) {
		List.remove(user);
		return true;
	}

	public User get(int userId) {
		User user=List.get(userId);
		return user;
	}

	public java.util.List<User> listAll() {
		return List;
	}
	
	
}
