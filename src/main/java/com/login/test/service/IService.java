package com.login.test.service;

import com.login.test.data.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author willi
 */
public interface IService<T> {

    Optional<T> get(int id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);

}
