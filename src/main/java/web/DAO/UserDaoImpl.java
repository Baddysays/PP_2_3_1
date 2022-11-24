package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao{

    public final List<User> resultList;

    {
        resultList = new ArrayList<>();

        resultList.add(new User(1, "Виктор", 23));
        resultList.add(new User(2, "Грека", 16));
        resultList.add(new User(3, "Иван", 66));
        resultList.add(new User(4, "Лена", 32));
        resultList.add(new User(5, "Потап", 37));
    }

    @Override
    public List<User> getFullListOfUser() {
        return resultList;
    }

    @Override
    public List<User> getListOfUser(int count, List<User> fullList) {
        System.out.println("сработал метод getListOfUser");
        return (count >= 5) ? fullList : fullList.subList(0, count);

    }
}
