package com.vucic.coursematerials.lesson_4.movies;

/**
 * This class represents a category or a genre a movie can belong to. Genres can exist without movies,
 * as they're independent entities. A movie can belong to several genre, and a genre can have
 * several movies. This is called Many-to-many (will be important in later lessons about databases).
 * The field id represents a unique identifier of each MovieGenre. Almost every class in the real world
 * will have this field as it's much faster to do comparisons with ints than with something like a String
 * like "name", and databases have to do a lot of comparisons. colorId is the color resource to paint
 * the background of this view when showing it for a movie.
 */
public class MovieGenre {
    private int id;
    private String name;
    private int colorId;

    public MovieGenre(int id, String name, int colorId) {
        this.id = id;
        this.name = name;
        this.colorId = colorId;
    }

    // TODO Create getters and setters for the fields
    // Think about not providing a setter for the id, as that field is never changed
    // Use the action called Generate. Right-click anywhere in file, find "Generate" and click it.
    // ALT+Insert also does the job. Click Getters and Setters and select the fields you want.
    // Pro tip: you can search almost anything in Android studio. The way I do this
    // ALT+Insert search for 'gs', enter, holding down shift clicking down (however many times to select all fields) enter
    // You can get really quick with shortcuts if you learn to use them right :)
}
