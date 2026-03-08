package com.example.iota_theaters;
//Programmer:Aravind Alwar
//Date:August 10,2024
//File:Browser.java
//Description:Browser,Interface in the theater Program;
public interface Browser {
    //The Browser declares ALL common functions linking the Theater/Patron;Need to be abstract;
    int Maximum_Capacity=400; //Theater patrons limit,integer Maximum_Capacity;
    int wait_List=0; //The num of patrons on the wait_List,integer;
    abstract boolean search(String s);//Project advantage:Using a search() interface that will work by returning whether or not the request is in the system;
    abstract void display_search(String s,String t); //And we also need a Display function that sends the results for the keyword searched;
}