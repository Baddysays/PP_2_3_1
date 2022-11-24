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
        System.out.println("сработал метод getListOfUser");
        return (count >= 5) ? fullList : fullList.subList(0, count);

    }
}


