package com.vucic.coursematerials.lesson_4.movies;

import java.util.List;

/**
 * @author Milan
 * @version 1.0
 *
 * This is called a Java doc. It is slightly different than a normal comment.
 * It can have annotations like @return, @param, @see, @author, @version, @link etc.
 * It's basically a normal comment formatted nicely for the programmers to read.
 *
 * Movie represents one single movie entry. For the sake of simplicity, some concessions were made
 * that are rarely seen in a real world project. Director and actors being Strings is just one of them.
 * In a more realistic app, they would be of some custom type like "Person" or "Actor", which would contain
 * a lot of data about them, open their info pages on click etc. There would also be many more fields
 * in the Movie class, like writer, more roles in making the movie, trailer url, a list of reviews and so on.
 */
public class Movie {
    private String title;
    private String description;
    private String director;
    private List<MovieGenre> movieGenres;
    private List<String> actors;
    private int durationMinutes;
    // The resource id of the locally stored image of the thumbnail
    private int imageResId;

    /**
     * Javadoc for a method (constructor)
     * @param title the title of the movie
     * @param description the short description of a movie
     * @param director the director of the movie
     * @param movieGenres a list of MovieGenre object used to filter movies
     * @param actors a list of Strings representing the actors in the movie
     * @param durationMinutes integer duration of the movie in minutes (seconds are not important)
     * @param imageResId the resource identifier of s local drawable for the movie's thumbnail
     */
    public Movie(String title, String description, String director, List<MovieGenre> movieGenres, List<String> actors, int durationMinutes, int imageResId) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.movieGenres = movieGenres;
        this.actors = actors;
        this.durationMinutes = durationMinutes;
        this.imageResId = imageResId;
    }
}
