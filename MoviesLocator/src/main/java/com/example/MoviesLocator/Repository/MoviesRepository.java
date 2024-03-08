package com.example.MoviesLocator.Repository;

import com.example.MoviesLocator.entities.MoviesDescp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends MongoRepository<MoviesDescp,Long> {
}
