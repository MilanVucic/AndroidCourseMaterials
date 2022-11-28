package com.vucic.coursematerials.lesson_4.movies;

import java.util.List;

/**
 * An interface used to declare all the methods that we'll need for working with the movies
 * If this was a real-world example, there may be many more methods here, such as:
 * searchMoviesByKeyword, searchMoviesByGenre, getMovieDetails, and so on.
 * Any class that implements this interface must provide implementations for all the methods.
 * If we were working with a server, we would probably send a different request for each method.
 * If the data was local, we would create a new query.
 * @see HardCodedMovieRepository as one provided implementation
 */
public interface MovieRepository {
    List<Movie> getMovies();
    List<MovieGenre> getMovieGenres();
}
