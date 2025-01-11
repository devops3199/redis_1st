package com.example.app.movie.service;

import com.example.app.movie.entity.Movie;
import com.example.app.movie.repository.MovieRepository;
import com.example.app.movie.type.MovieStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MovieRepoService {

    private final MovieRepository movieRepository;

    public List<Movie> getMovies(final LocalDate showDate, final MovieStatus status) {
        return movieRepository.findAllByReleaseDateLessThanEqualAndStatus(
                showDate,
                status,
                Sort.by(Sort.Direction.DESC, "releaseDate"));
    }
}
