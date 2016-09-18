package com.xfboy.movies.repository.impl;

import com.xfboy.movies.domain.Person;
import com.xfboy.movies.repository.PersonRepository;
import org.springframework.stereotype.Repository;

/**
 * PersonRepositoryImpl
 *
 * @author alex.chen
 * @version 1.0.0
 * @date 2016/9/17
 */
@Repository
public class PersonRepositoryImpl extends DbContextImpl<Person> implements PersonRepository {
    @Override
    public Class<Person> getEntityType() {
        return Person.class;
    }
}
