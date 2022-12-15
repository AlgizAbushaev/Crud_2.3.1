package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserId(long id);

    void addUser(User user);

    void updateUser(User user);

    User removeUser(long id);
}
