package com.xfboy.movies.repository;

import com.xfboy.movies.domain.BaseEntity;

/**
 * IDao
 *
 * @author alex.chen
 * @version 1.0.0
 * @date 2016/9/13
 */
public interface DbContext<T extends BaseEntity> {
    Iterable<T> findAll();

    T find(Long id);

    void delete(Long id);

    T createOrUpdate(T entity);
}
