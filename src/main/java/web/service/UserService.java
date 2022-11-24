package web.service;

import web.model.Car;
import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getFullListOfUser();

    List<User> getListOfUser(int count, List<User> fullList);

    User idShow(int id);

}
