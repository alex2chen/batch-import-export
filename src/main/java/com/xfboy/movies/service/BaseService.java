package com.xfboy.movies.service;

import com.xfboy.movies.domain.BaseEntity;

/**
 * BaseService
 *
 * @author alex.chen
 * @version 1.0.0
 * @date 2016/9/13
 */
public interface BaseService {
    <T extends BaseEntity> Iterable<T> findAll();

    <T extends BaseEntity> T selectOne(Long id);

    void delete(Long id);

    <T extends BaseEntity> T createOrUpdate(T entity);
}
