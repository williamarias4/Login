/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.test.service;

import com.login.test.data.User;

/**
 *
 * @author willi
 */
public interface ILoginService {

    public boolean login(User user);

    public User getUserDb(User user);
}
