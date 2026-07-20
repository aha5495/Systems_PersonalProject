package com.example.local_theaters;
import java.util.ArrayList;

public class Child extends Person implements Browser{
    private ArrayList<Movie> appropriateMovies;
    private boolean Kid_added;
    private String movieRated;
    //Constructor for Child

    public Child(String cus_fName,String cus_mName,String cus_lName,int cus_Age,String movie_Genre,float radius,Movie chosenMovie,Home residence,ArrayList<Movie> appropriateMovies){
        super(cus_fName, cus_mName, cus_lName, cus_Age, movie_Genre, radius, chosenMovie, residence);
        this.appropriateMovies = appropriateMovies;
    }
    public Child(String cus_fName,String cus_mName,String cus_lName,int cus_Age,String movie_Genre,float radius,Movie chosenMovie,Home residence){
        super(cus_fName, cus_mName, cus_lName, cus_Age, movie_Genre, radius, chosenMovie, residence);
        this.appropriateMovies = new ArrayList<>();
    }
    public Child(String cus_fName,String cus_mName,String cus_lName,int cus_Age,Home residence,String userName,String password){
        super(cus_fName,cus_mName,cus_lName,cus_Age,residence,userName,password);
    }
    public Child(String userName,String password){
        super(userName,password);
    }
    //Constructor for child;
    public void setAllowedMovies(ArrayList<Movie> appropriateMovies){
        this.appropriateMovies = appropriateMovies;
    }
    public ArrayList<Movie> getAppropriateMovies(){
        return this.appropriateMovies;
    }
    //Sep 27:Boolean function to be added;
    public boolean addedToBackend(boolean kid_added){
        return this.Kid_added;
    }
    //We are now supposed to have the Child use the search bar so they can search for their movie if it is present;
    @Override
    public boolean search(String film_Name){
        //Assuming the movie title has not been found yet;
        boolean movieforKid=false;
        System.out.println("Searching the browser for:"+film_Name);
        if(this.getAppropriateMovies().isEmpty()){
            movieforKid=false; //The film is not in the arrayList;
        }
        else{
            //Check conditions for if the film_Name entered by the user IS IN the arrayList
            for(Movie r:this.getAppropriateMovies()){
                if(r.getFilmTitle().equalsIgnoreCase(film_Name)){ //Checking if the query equals r.getFilmTitle()
                    movieforKid=true;
                }
                else{ //If not found,the search doesn't contain keywords for the title;
                    movieforKid=false;
                }
            }
        }
        return movieforKid;
    }
    @Override //For the child,it's required we set a limit to R-rated films;
    public void display_search(String film_Name,String crit) {
        Movie m = null;
        //The adult is trying to search for a movie with a specific condition;
        if (!search(film_Name)) {
            System.out.println("Could not find the movie based on either name or criteria!");
        } else { //We assume that we can find the movie somewhere in the list;
            switch (crit) { //The user is required to type in a criteria to narrow the search
                case "Cast":
                    m = new Movie(super.getChosenMovie().getFilmTitle(), super.getChosenMovie().getDirector(), super.getChosenMovie().getActorsNames());
                case "Rating": //For rating,an adult could give a PG,PG-13,R,or NC-17 option
                    switch (movieRated) {
                        case "G":
                            System.out.println(film_Name + " happens to be a " + movieRated + "-rated movie.");
                        case "PG":
                            System.out.println(film_Name + " happens to be a " + movieRated + "-rated movie.Appropriate for most kids.");
                        case "PG13":
                            System.out.println(film_Name + " happens to be a " + movieRated + "-rated movie.You can watch it so long as you are mature to understand.");
                        case "R":
                            System.out.println("Restricted Movie-->Use caution");
                            System.out.println(film_Name + " happens to be a " + movieRated + "-rated movie.Under 17 alone not permitted.");
                        default:
                            System.out.println("Invalid rating for child!");
                    }
                    m=new Movie(super.getChosenMovie().getFilmTitle(),super.getChosenMovie().getDirector(),super.getChosenMovie().getActorsNames(),super.getChosenMovie().getRating());
                case "Time": //In what time period the movie was released;
                    m=new Movie(super.getChosenMovie().getFilmTitle(),super.getChosenMovie().getFilmMonth(),super.getChosenMovie().getFilmDay(),super.getChosenMovie().getFilmYear(),super.getChosenMovie().getDirector());
                default:
                    System.out.println("Could not find the movie based on either name or criteria!");
            }
            System.out.println(m);
        }
    }
    @Override
    public String toString(){
        return "Child:\t"+super.getCus_fName()+" "+super.getCus_mName()+" "+super.getCus_lName()+"\nAge:\t"+super.getCus_Age()+"\nUsername:"+super.getUserName()+"\nPassword:"+super.getPassword();
        //We have to add the theater with the seating available soon;
    }
    public String fullChildInfo(){
        return "Standard Customer:\t"+super.getCus_fName()+" "+super.getCus_mName()+" "+super.getCus_lName()+"\nAge:\t"+super.getCus_Age()+"\nAddress:"+super.getResidence().getHouseNumber()+" "+super.getResidence().getHouseStreet()+","+super.getResidence().getLocal_area()+","+super.getResidence().getState()+","+super.getResidence().getZipcode()+","+super.getResidence().getCountry()+"\nUsername:"+super.getUserName()+"\nPassword:"+super.getPassword();
        //We have to add the theater with the seating available soon;
    }
}
