package account;

import org.hibernate.query.Query;

import java.util.List;

public class UserRepository {
    public boolean isUser(String name, String password) {
        boolean flagUser = false;
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        String hql = "FROM users";
        List<User> result = session.createQuery("from User", User.class).getResultList();
        try {
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
        for (User temp : result) {
            if (temp.getName().equals(name) && temp.getPassword().equals(password)) {
                flagUser = true;
            }
        }
        return flagUser;
    }
    public boolean setUserIntoData(String name, String password) {
        boolean flagUser = false;
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        User user = new User();
        user.setUser(name, password);
        session.save(user);
        try {
            transaction.commit();
            flagUser = true;
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
        return flagUser;
    }
}
