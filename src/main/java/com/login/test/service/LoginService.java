/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.test.service;

import com.login.test.dao.Dao;
import com.login.test.data.User;
import java.util.ArrayList;
import java.util.List;
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
public class LoginService implements ILoginService {

    @Autowired
    private Dao dao;

    @Override
    public boolean login(User user) {
        List<User> users = new ArrayList<>();
        users = dao.getAll();
        for (User userAux : users) {
            if (userAux.getUsername().equals(user.getUsername()) && userAux.getPassword()
                    .equals(user.getPassword())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public User getUserDb(User user) {
        List<User> users = new ArrayList<>();
        users = dao.getAll();
        for (User userAux : users) {
            if (userAux.getUsername().equals(user.getUsername()) && userAux.getPassword()
                    .equals(user.getPassword())) {
                return userAux;
            }

        }
        return null;
    }

}
