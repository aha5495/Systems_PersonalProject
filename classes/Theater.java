package com.example.iota_theaters;
import java.util.ArrayList;

//Programmer:Aravind Alwar
//Date:August 10,2024
//File:Theater.java
//Description:The class responsible for holding Movie Theater's general information.
public class Theater implements Browser{
    private String title;
    private Home location;
    private float avg_Dist; //Feb 18:Add an average distance to account for the default location;
    private ArrayList<Movie> films;
    private Movie filmInQ; //Mar 14:Add a film Object,so the theater can efficiently find the movie they look up
    private boolean movieFound;
    //Constructor setting; A constructor without movies in the cinemas;
    public Theater(String title, Home location){
        this.title = title;
        this.location = location;
    }
    public Theater(String title, Home location, ArrayList<Movie> films){
        this.title = title;
        this.location = location;
        this.films = films;
    }
    //Setters and Getters
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setLocation(Home location){
        this.location=location;
    }
    public Home getLocation(){
        return this.location;
    }
    public void setFilms(ArrayList<Movie> films){
        this.films=films;
    }
    public ArrayList<Movie> getFilms(){
        return this.films;
    }
    //We are now required to implement the search method,for a theater to search what movies are on the list;
    @Override
    public boolean search(String movieTitle) {
        System.out.println("Searching for movie:"+movieTitle);
        for(Movie A_flick: this.getFilms()){ //Need to search every available
            if(A_flick.getFilmTitle().equalsIgnoreCase(movieTitle)){
                System.out.println("The title is valid currently.");
                this.movieFound=true;
            }
            else{
                System.out.println("The title is not valid currently.");
                this.movieFound=false;
            }
        }
        if(this.getFilms().isEmpty()){
            System.out.println("No movies in the list as of now!~Try again later.");
            this.movieFound=false;
        }
        return this.movieFound;
    }
    @Override
    public void display_search(String movieTitle,String crit) { //Theater has to confirm if the movie is indeed on the menu;
        if(!search(movieTitle)){
            System.out.println("There is either no movies in the list OR the movie in question is not released.");
        }
        else{
            filmInQ=new Movie(filmInQ.getFilmTitle(), filmInQ.getFilmMonth(), filmInQ.getFilmDay(), filmInQ.getFilmYear(), filmInQ.getBoxPrice(), filmInQ.getFilm_Genre(), filmInQ.getDirector(), filmInQ.getActorsNames(), filmInQ.getRating(), filmInQ.getMins());
            System.out.println(filmInQ); //printing the information of the film,not dependent on criteria
        }
    }
    //String method to print out the theater information;
    public String destination(){
        return "Theater:"+this.getTitle()+"\nAddress:"+this.getLocation().homeAddress();
    }
}