package com.khelimellpi.Task_PP_3_1_1.dao;

import com.khelimellpi.Task_PP_3_1_1.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        em.merge(user);
    }

    @Override
    public void removeUser(Long id) {
        User userForDeletion = em.find(User.class, id);
        em.remove(userForDeletion);
    }

    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = em.createQuery("from User", User.class);
        return query.getResultList();
    }
}
