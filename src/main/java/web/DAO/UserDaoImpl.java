package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao {
@PersistenceContext
private  EntityManager entityManager;

    @Override
    public void addUser(User user) { entityManager.persist(user); }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void removeUser(Long id) {
        entityManager.remove(findById(id));
    }

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }
}