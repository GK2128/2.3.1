package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();

    void save(User user);

    User show(int id);

    void update(int id, User updateUser);

    void delete(int id);
}
