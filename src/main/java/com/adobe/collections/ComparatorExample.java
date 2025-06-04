package com.adobe.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    static  class Movie{
        private String movie;
        private int year;

        public String getMovie() {
            return movie;
        }

        public void setMovie(String movie) {
            this.movie = movie;
        }


        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        Movie(String movie,int year){
            this.movie= movie;
            this.year=year;
        }
    }

   static class Rating implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    }

    public static void main(String args[]){
        List<ComparatorExample.Movie> movies= new ArrayList<>();
        movies.add(new ComparatorExample.Movie("pushpa",2022));
        movies.add(new ComparatorExample.Movie("Bahuballi",2017));
        Collections.sort(movies,new Rating());
        for (ComparatorExample.Movie m:movies){
            System.out.println(m.getMovie());
        }
    }

}
