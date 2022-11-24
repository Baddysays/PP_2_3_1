package web.DAO;

import web.model.Car;
import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getFullListOfUser();
}