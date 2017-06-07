package users.dao;
import users.model.User;
public interface UserDao {

	User findByUserName(String username);

}
