package com.xfboy.movies.service.impl;

import com.xfboy.movies.repository.DbContext;
import com.xfboy.movies.repository.MovieRepository;
import com.xfboy.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MovieServiceImpl
 *
 * @author alex.chen
 * @version 1.0.0
 * @date 2016/9/17
 */
@Service
public class MovieServiceImpl extends BaseServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public DbContext getRepository() {
        return this.movieRepository;
    }
}
