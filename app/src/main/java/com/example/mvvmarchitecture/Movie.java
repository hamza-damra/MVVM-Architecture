package com.example.mvvmarchitecture;

public class Movie {
    private int movieId;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie(int movieId, int moviePrice, String movieName) {
        this.movieId = movieId;
        this.moviePrice = moviePrice;
        this.movieName = movieName;
    }

    private int moviePrice;
    private String movieName;
}
