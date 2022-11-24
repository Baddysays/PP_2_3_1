package web.service;

import org.springframework.stereotype.Component;
import web.DAO.UserDaoImpl;
import web.model.User;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
   UserDaoImpl userDao = new UserDaoImpl();


    @Override
    public List<User> getFullListOfUser() {
        return userDao.getFullListOfUser();
    }


    @Override
    public List<User> getListOfUser(int count, List<User> fullList) {

        return userDao.getListOfUser(count, fullList);

    }

    @Override
    public User idShow(int id) {
        return userDao.resultList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}


