package com.login.test.service;

import com.login.test.dao.Dao;
import com.login.test.data.User;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author willi
 */
@Service
@Transactional
@Component
public class UserService implements IService<User> {

    @Autowired
    private Dao dao;

    private List<User> users;
    

    @Override
    public Optional<User> get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public List<User> getAll() {
        users = new ArrayList();
        return dao.getAll();
    }

    @Override
    public void update(User t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
