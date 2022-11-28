package com.vucic.coursematerials.lesson_4.movies;

import com.vucic.coursematerials.R;

import java.util.ArrayList;
import java.util.List;

/**
 * The hardcoded implementation of a MovieRepository interface. Used only for practice here,
 * in the real-world you could see something like this when you are working in parallel
 * with the development of the server, and you need to mock some data for yourself. It's a good skill to have.
 * Later it's easy to swap out the HardCoded repo with another one (either local or remote)
 * because of the usage of the interface.
 * @see MovieRepository
 */
public class HardCodedMovieRepository implements MovieRepository {
    // TODO: Add more Movie genres
    public static final MovieGenre MOVIE_GENRE_ROMANCE = new MovieGenre(1, "Romance", R.color.movie_genre_color_1);
    public static final MovieGenre MOVIE_GENRE_ACTION = new MovieGenre(2, "Action", R.color.movie_genre_color_2);
    public static final MovieGenre MOVIE_GENRE_COMEDY = new MovieGenre(3, "Comedy", R.color.movie_genre_color_3);
    public static final MovieGenre MOVIE_GENRE_DRAMA = new MovieGenre(4, "Drama", R.color.movie_genre_color_4);
    private static final List<MovieGenre> MOVIE_GENRES = new ArrayList<>();
    // This is a static initialization block. It's used to initialize static variables like this.
    // This data would usually come from a Database, but we'll cover that a bit later.
    // For now, these static data are standing in for the DB.
    static {
        MOVIE_GENRES.add(MOVIE_GENRE_ROMANCE);
        MOVIE_GENRES.add(MOVIE_GENRE_ACTION);
        MOVIE_GENRES.add(MOVIE_GENRE_COMEDY);
        MOVIE_GENRES.add(MOVIE_GENRE_DRAMA);
    }

    //
    public List<MovieGenre> getMovieGenres() {
        // This method would usually query a DB, we're using static fields to simplify a bit
        return MOVIE_GENRES;
    }

    // TODO: Add more movies
    // Copy the block of code that I added for adding Titanic and just change the data
    // It's important to learn how to realistically hardcode data to test your app with
    // I usually google for my data, here I looked on IMDB, for the books I used google books API
    // The data doesn't necessarily have to be correct, you're free to improvise :)
    // Little help for adding the image: I just download an image on google of what I want,
    // Then copy/paste the file onto my drawable folder, 2 OKs later, just rename it and we're done.
    @Override
    public List<Movie> getMovies() {
        List<Movie> list = new ArrayList<>();
        List<String> actors = new ArrayList<>();
        actors.add("Leonardo DiCaprio");
        actors.add("Kate Winslet");
        actors.add("Billy Zane");
        List<MovieGenre> movieGenres = new ArrayList<>();
        movieGenres.add(MOVIE_GENRE_ROMANCE);
        movieGenres.add(MOVIE_GENRE_DRAMA);
        list.add(new Movie("Titanic", "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
                        "James Cameron", movieGenres, actors, 194, R.drawable.lesson_4_movie_1));
        return list;
    }
}
