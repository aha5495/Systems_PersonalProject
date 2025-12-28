//Name:Aravind Alwar
//Date:December 26,2025
//File:Map.i
//Project:Local_Theaters.java

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.BasemapStyle;
import com.esri.arcgisruntime.mapping.view.MapView;
public class Map{
    //We must declare a map variable that can reasonably hold in the Testing stages!!
    public MapView mapInterface;
    private Address startPoint;
    //Using a Vector of the type integer(because we are accounting for startPoint) to put the exact coordinates[x,y,z] of home.
    private Vector<Integer> home;
    //We are now accounting towards the multiple theaters that are the best ones for the user to commute to,in terms of time,miles,traffic,road closures,etc.
    private Address optimal_Theater;
    private ArrayList<Address> best_Theaters;
    //While we used a single Vector of Integer type for our home...it is required to SIMPLIFY the process for more than 1 endpoint!! How?
    private Vector<Integer> pt_Theater;
    private ArrayList<Vector> idealSpots; //Since the vector is already an integer,we should use an ArrayList to store each Vector in the making of idealSpots;
    public Time travelTime; //We are going to create a Time class to account for the amt of time it takes to drive to a theater in isolation,and...
    public ArrayList<Time> range; //ArrayList Required since the same logic of idealSpots;
    public Integer miles_Away;
    public ArrayList<Integer> range_Distance;
}
