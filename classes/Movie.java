package com.example.iota_theaters;
import java.util.ArrayList;
//Programmer:Aravind Alwar
//Date:August 10,2024
//File:Movie.java
//Description:Film Information here,so that the user can choose from the best film(s);
public class Movie {
    private String film_Name=" ";
    private int film_relYear;
    private int film_relDay;
    private int film_relMonth;
    private float film_Boxprice;
    private String film_Genre;
    private Person film_Director;
    private ArrayList<Person> film_Actors;
    private String film_Rating;
    private float film_Mins;
    //Constructor for the Movie class;
    public Movie(String film_Name,int film_relMonth,int film_relDay,int film_relYear,Person film_Director){ //Constructor one for those who want to check based on release Date;
        this.film_Name=film_Name;
        this.film_relMonth=film_relMonth;
        this.film_relDay=film_relDay;
        this.film_relYear=film_relYear;
        this.film_Actors=new ArrayList<>(); //Empty array List
        this.film_Director=film_Director; //Film director will always be an adult;We are not gonna show whom exactly;
    }
    //Rating added with the cast
    public Movie(String film_Name,Person film_Director,ArrayList<Person> film_Actors,String film_Rating){ //Constructor for those who want to check based on cast/crew;
        this.film_Name=film_Name;
        this.film_Director=film_Director;
        this.film_Actors=film_Actors;
        this.film_Rating=film_Rating;
    }
    //All information;
    public Movie(String film_Name,int film_relMonth,int film_relDay,int film_relYear,float film_Boxprice,String film_Genre,Person film_Director,ArrayList<Person> film_Actors,String film_Rating,float film_Mins){ //Full Description constructor
        this.film_Name=film_Name;
        this.film_relMonth=film_relMonth;
        this.film_relDay=film_relDay;
        this.film_relYear=film_relYear;
        this.film_Boxprice=film_Boxprice;
        this.film_Genre=film_Genre;
        this.film_Director=film_Director;
        this.film_Actors=film_Actors;
        this.film_Rating=film_Rating;
        this.film_Mins=film_Mins;
    }
    //Cast-exclusive constructor
    public Movie(String film_Name,Person film_Director,ArrayList<Person> film_Actors) { //Constructor for those who want to check based on cast/crew;
        this.film_Name = film_Name;
        this.film_Director = film_Director;
        this.film_Actors = film_Actors;
    }
    //Setters for the Movie
    public void setFilmTitle(String film_Name){
        this.film_Name=film_Name;
    }
    public String getFilmTitle(){
        return this.film_Name;
    }
    public void setFilmMonth(int film_relMonth){
        this.film_relMonth=film_relMonth;
    }
    public int getFilmMonth(){
        return this.film_relMonth;
    }
    public void setFilmDay(int film_relDay){
        this.film_relDay=film_relDay;
    }
    public int getFilmDay(){
        return this.film_relDay;
    }
    public void setFilmYear(int film_relYear){
        this.film_relYear=film_relYear;
    }
    public int getFilmYear(){
        return this.film_relYear;
    }
    public void setRating(String film_Rating){
        this.film_Rating=film_Rating;
    }
    public String getRating(){
        return this.film_Rating;
    }
    public void setGenre(String film_Genre){
        this.film_Genre=film_Genre;
    }
    public String getFilm_Genre(){
        return this.film_Genre;
    }
    public void setDirector(Person film_Director){
        this.film_Director=film_Director;
    }
    public String getDirectorName(){ //Name only
        return this.film_Director.getCus_fName()+" "+this.film_Director.getCus_lName();
    }
    public Person getDirector(){ //Full Information about the director
        return this.film_Director;
    }
    public void setActors(ArrayList<Person> film_Actors){
        this.film_Actors=film_Actors;
    }
    public ArrayList<Person> getActorsNames(){
        return this.film_Actors;
    }
    public void setPrice(float film_Boxprice){
        this.film_Boxprice=film_Boxprice;
    }
    public float getBoxPrice(){
        return this.film_Boxprice;
    }
    public void setRuntime(float film_Mins){
        this.film_Mins=film_Mins;
    }
    public float getMins(){
        return this.film_Mins;
    }
}