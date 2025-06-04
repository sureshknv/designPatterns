package com.adobe.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample{
//Builders, Helpers, DTOs, Enum types
  static class Movie implements  Comparable<Movie>{
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
        @Override
        public int compareTo(Movie c){
            return  this.year- c.year;
        }
        Movie(String name,int year){
            this.movie= name;
            this.year= year;
        }

    }


    public  static  void  main(String args[]){
            List<Movie> movies= new ArrayList<>();
        movies.add(new Movie("pushpa",2022));
            movies.add(new Movie("Bahuballi",2017));

            Collections.sort(movies);
            for (Movie m:movies){
                System.out.println(m.getMovie());
            }

    }

}
