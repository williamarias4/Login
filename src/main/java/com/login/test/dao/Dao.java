package com.login.test.dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author willi
 */
public interface Dao<T> {

    Optional<T> get(int id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);

}
