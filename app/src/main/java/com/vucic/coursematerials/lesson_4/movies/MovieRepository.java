package com.vucic.coursematerials.lesson_4.movies;

import java.util.List;

public interface MovieRepository {
    List<Movie> getMovies();
    List<MovieGenre> getMovieGenres();
}
