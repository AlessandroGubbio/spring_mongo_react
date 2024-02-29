package com.example.Movies2.service;

import com.example.Movies2.model.Movie;
import com.example.Movies2.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String  imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
