//Name:Aravind Alwar
//Date:December 26,2025
//File:Map.i
//Project:Local_Theaters.java

import java.util.ArrayList;
import java.util.Vector;
import com.sothawo.mapjfx.Coordinate;
import com.sothawo.mapjfx.WebView;
import com.sothawo.mapjfx.WebEngine;
import com.sothawo.mapjfx.MapType;
import com.sothawo.mapjfx.Projection;
public class Map{
    //This should be WebView rather than MapView,since AWS Maps use a MapLibre GL JS library. The latter takes in raw data to style via WebGL,making it easier and efficient in performance.
    public WebView mapInterface;
    public WebEngine source;
    public String mapURL;
    protected String region; //We need a variable for this and the following 2 because they are responsible for tracking down WHAT region,map,and key we are using;
    protected String mapName;
    protected String api_Key;
    //Update January 1:We need to add the variables that make up the startPoint,because a user's preference for starting point could vary;
    protected int blockNum;
    protected String street;
    protected String local_County;
    protected String state_Name;
    protected int Zip;
    protected String country;
    private String countryFile="https://history.state.gov/countries/all"; //We use a URL for the purpose of efficient code,rather than writing all out.
    private url countryList=new URL(countryFile)
    private Home startPoint;
    //Using a Vector of the type integer(because we are accounting for startPoint) to put the exact coordinates[x,y,z] of home.
    boolean in_Country,city_Fd,mapBrowse;
    double x_mag,y_mag,z_mag,city_xMag,city_yMag,city_zMag,stateXMag,stateYMag,stateZMag;
    private Vector<Integer> home;
    //We are now accounting towards the multiple theaters that are the best ones for the user to commute to,in terms of time,miles,traffic,road closures,etc.
    private Home optimal_Theater;
    private ArrayList<Home> best_Theaters;
    //While we used a single Vector of Integer type for our home...it is required to SIMPLIFY the process for more than 1 endpoint!! How?
    private Vector<Integer> pt_Theater;
    private ArrayList<Vector> idealSpots; //Since the vector is already an integer,we should use an ArrayList to store each Vector in the making of idealSpots;
    public Time travelTime; //We are going to create a Time class to account for the amt of time it takes to drive to a theater in isolation,and...
    public ArrayList<Time> range; //ArrayList Required since the same logic of idealSpots;
    public Integer miles_Away;
    public ArrayList<Integer> range_Distance;

    public void designMap(WebView mapInterface,WebEngine source,String mapURL,String region,String mapName,String api_Key,String mapURL){ //Using an AWS map to display the app's map;
        mapInterface=new WebView();
        source=mapInterface.getEngine();
        mapURL=getClass().getResource("\UserMap.html").toExternalForm(); //toExternalForm() is responsible for converting the URL in the var to a String;
        region="YOUR_REGION";
        mapName="YOUR_MAP";
        api_Key="YOUR_API_KEY";
        source.load(mapURL);
        System.out.println("Default setting is in Standard Mode.");
    }
    //Serve as the means used to ensure that we do not have the user mistake descriptions as valid Countries;
    public void validateCountryFile(){
    
    }
    public url getValidated(){
    
    }
    public void setDefCountry(Home startPoint,Vector<Integer> home){ //Using a set Default country method become we want to optimize the workflow.
        
    }
    public Vector getDefCountry(){

    }
    public Vector getRoot(Home startPoint,Vector<Integer> home){ //Modifying our function to getRoot since we are optimizing our locating-methods;
        this.startPoint=startPoint;
        return this.startPoint;
        mapBrowse=true; //As the vector coordinates of the person's address need to be found,we will use a mapBrowse boolean;
        in_Country=true; //We assume that the country has already been found,as part of our optimization process;
        city_Fd=false; //The city has not been found yet to locate where the person's address may be;
        x_mag=0.0;
        y_mag=0.0;
        z_mag=0.0;
        while(mapBrowse && city_Fd && in_Country){ //This stage is where the API has to circulate around the map to find the user's cityl
            //Aim:Optimize the search process so the point goes exactly to the city rather than traveling to the Country;
            
        }
    }
}
